package com.noscale.ecashier.utilities.connector;

import com.noscale.ecashier.utilities.Global;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Abstract database class
 * Created by kurniawanrizzki on 26/03/17.
 */
public abstract class Database extends Constant {

    protected Connection connection;

    protected Connection getConnection() {
        return connection;
    }

    protected void setConnection(Connection connection) {
        this.connection = connection;
    }

    public abstract long insertNewEntry(Object object) throws SQLException;
    public abstract List<?> getAllEntries();
    public abstract Object getObject(ResultSet result);

    /**
     * Build insert query
     * @param table table name
     * @see Constant table names and column names has been declared in this class
     * @param columns columns inserteds
     * @return #query
     */
    protected String buildInsertQuery(String table, String[] columns) {

        String query = null;

        if (columns.length > Global.DEFAULT_INT) {

            String values = convertArrayToString(
                    columns,
                    Global.QUESTION_SEPARATOR,
                    Global.COMA_SEPARATOR
            );

            String insertColumns = convertArrayToString(
                    columns,
                    null,
                    Global.COMA_SEPARATOR
            );

            query = "INSERT INTO "+table+"("+insertColumns+") VALUES ("+values+")";

        }

        return query;

    }

    /**
     * Build update query
     * @param table table name
     * @param columns columns update
     * @param selection selection update
     * @param selections selections args update
     * @return #query
     */
    protected String buildUpdateQuery(String table, String[] columns,  String selection, String[] selections) {

        String query = "UPDATE "+table+" SET ";
        String stringSelection = "";

        for (int i = 0; i < columns.length; i++) {

            query += columns[i]+" = "+Global.QUESTION_SEPARATOR;

            if (i < (columns.length - 1)) {
                query += Global.COMA_SEPARATOR;
            }

        }

        if (null != selection) {

            stringSelection = " WHERE "+selection;

            if (stringSelection.contains(Global.QUESTION_SEPARATOR)) {

                if (null != selections) {
                    int index = 0;
                    stringSelection = " WHERE ";

                    String[] selectionsSplit = selection.split(Pattern.quote(Global.QUESTION_SEPARATOR));

                    for (String result:selectionsSplit) {

                        stringSelection += result+" '"+selections[index]+"'";
                        index++;

                    }

                }

            }

            query += stringSelection;

        }

        return query;

    }

    /**
     * Build delete query
     * @param table table name
     * @param selection delete selection
     * @param selections selections args
     * @return #query
     */
    protected String buildDeleteQuery(String table, String selection, String[] selections) {

        String query = "DELETE FROM "+table;
        String stringSelection = "";

        if (null != selection) {

            stringSelection = " WHERE "+selection;

            if (stringSelection.contains(Global.QUESTION_SEPARATOR)) {

                if (null != selections) {
                    int index = 0;
                    stringSelection = " WHERE ";

                    String[] selectionsSplit = selection.split(Pattern.quote(Global.QUESTION_SEPARATOR));

                    for (String result:selectionsSplit) {

                        stringSelection += result+" '"+selections[index]+"'";
                        index++;

                    }

                }

            }

            query += stringSelection;

        }

        return query;

    }

    /**
     * Select query
     * @param primaryTable table name
     * @param columns columns name
     * @param joiners join tables
     * @see Constant
     * @param selection selection column
     * @param selections selection values
     * @param orders order column
     * @param orderBy order by {@link Global#ORDER_BY_ASC} if the query want to be sorted by ASCENDING,
     *                order by {@link Global#ORDER_BY_DESC} if the query want to be sorted by DESCENDING
     * @return #query
     */
    protected String buildSelectQuery(
            String primaryTable,
            String[] columns,
            String[][] joiners,
            String selection,
            String[] selections,
            String[] orders,
            String orderBy
    ) {

        String stringColumns = "";
        String stringJoiners = "";
        String stringSelection = "";
        String stringOrdersValue = "";
        String stringOrderBy = "";

        if (null != columns) {
            stringColumns = convertArrayToString(columns,null, Global.COMA_SEPARATOR);
        } else {
            stringColumns = "*";
        }

        if (null != joiners && joiners.length < 2) {

            for (String[] joiner:joiners) {

                for (String subJoiner:joiner) {
                    stringJoiners += subJoiner+" ";
                }

            }

        }

        if (null != selection && null == joiners) {

            stringSelection = " WHERE "+selection;

            if (stringSelection.contains(Global.QUESTION_SEPARATOR)) {

                if (null != selections) {
                    int index = 0;
                    stringSelection = " WHERE ";

                    String[] selectionsSplit = selection.split(Pattern.quote(Global.QUESTION_SEPARATOR));

                    for (String result:selectionsSplit) {

                        stringSelection += result+" '"+selections[index]+"'";
                        index++;

                    }

                }

            }

        }

        if (null != orders) {
            stringOrdersValue = "ORDER BY "+convertArrayToString(orders, null, Global.COMA_SEPARATOR);
        }

        if (("" != stringOrdersValue) || (null != orders)) {
            stringOrderBy = orderBy;
        }

        String query = convertArrayToString(new String[]
                {
                        "SELECT",
                        stringColumns,
                        "FROM",
                        primaryTable,
                        stringJoiners,
                        stringSelection,
                        stringOrdersValue,
                        stringOrderBy
                },
                null,
                " "
        );

        return query;

    }

    /**
     * Convert array to string, special convert in query builder
     * @param arrayString columns
     * @param defaultValue default value, if the result want to be append as column name, please to put the
     *                     default value by null;
     * @param separator separator value
     * @return #arrayToString
     */
    private String convertArrayToString(String[] arrayString, String defaultValue, String separator) {

        String arrayToString = "";

        for (int i = 0; i < arrayString.length; i++) {

            if (null != defaultValue) {
                arrayToString += defaultValue;
            } else {
                arrayToString += arrayString[i];
            }

            if (i < (arrayString.length - 1)) {
                arrayToString += separator;
            }

        }

        return arrayToString;

    }

}
