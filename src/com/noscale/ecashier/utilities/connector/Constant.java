package com.noscale.ecashier.utilities.connector;

/**
 * This class to avoid database constant, it's include table and column;
 * Created by kurniawanrizzki on 26/03/17.
 */
public class Constant {

    protected static final String CONTACT_TABLE = "CONTACT";
    protected static final String ITEM_TABLE = "ITEM";
    protected static final String LOG_TABLE = "LOG";
    protected static final String LOGIN_TABLE = "LOGIN";
    protected static final String PRICE_TABLE = "PRICE";
    protected static final String REPORT_TABLE = "REPORT";
    protected static final String STOCK_TABLE = "STOCK";
    protected static final String SUPPLIER_TABLE = "SUPPLIER";
    protected static final String TRX_DETAILED_TABLE = "TRX_DETAILED";
    protected static final String TRX_TABLE = "TRX";
    protected static final String UNIT_TABLE = "UNIT";

    protected static final String ID_COLUMN = "ID";
    protected static final String NAME_COLUMN = "NAME";
    protected static final String ITEM_ID_COLUMN = "ITEM_ID";
    protected static final String QUANTITY_AT_COLUMN = "QUANTITY_AT";
    protected static final String TOTAL_COLUMN = "TOTAL";
    protected static final String IS_CANCEL_COLUMN = "IS_CANCEL";
    protected static final String CREATED_AT_COLUMN = "CREATED_AT";
    protected static final String CREATED_BY_COLUMN = "CREATED_BY";
    protected static final String UPDATED_AT_COLUMN = "UPDATED_AT";
    protected static final String UPDATED_BY_COLUMN = "UPDATED_BY";

    //CONTACT
    protected static final String SUPPLIER_ID_COLUMN = "SUPPLIER_ID";
    protected static final String CONTACT_COLUMN = "CONTACT";

    //ITEM
    protected static final String UNIT_ID_COLUMN = "UNIT_ID";

    //LOGIN
    protected static final String USERNAME_COLUMN = "USERNAME";
    protected static final String PASSWORD_COLUMN = "PASSWORD";
    protected static final String LEVEL_COLUMN = "LEVEL";
    protected static final String IS_DELETED_COLUMN = "IS_DELETED";

    //LOG
    protected static final String USER_ID_COLUMN = "USER_ID";
    protected static final String LOGIN_AT = "LOGIN_AT";
    protected static final String LOGOUT_AT = "LOGOUT_AT";

    //PRICE
    protected static final String PRICE_COLUMN = "PRICE";

    //REPORT
    protected static final String START_DATE_COLUMN = "START_DATE";
    protected static final String END_DATE_COLUMN = "END_DATE";

    //STOCK
    protected static final String SUPPLIED_AT_COLUMN = "SUPPLIED_AT";
    protected static final String SUPPLIED_BY_COLUMN = "SUPPLIED_BY";

    //TRX
    protected static final String AMOUNT_DUE_COLUMN = "AMOUNT_DUE";
    protected static final String NOTE_COLUMN = "NOTE";

    //TRX_DETAILED
    protected static final String TRX_ID_COLUMN = "TRX_ID";


}
