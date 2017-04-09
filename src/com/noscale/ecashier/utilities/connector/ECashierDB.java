package com.noscale.ecashier.utilities.connector;

import com.noscale.ecashier.databases.*;
import com.noscale.ecashier.utilities.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ECashierDB created to avoid connection db;
 * Created by kurniawanrizzki on 26/03/17.
 */
public class ECashierDB {

    private static ECashierDB instance = null;

    private Connection connection;
    private LoginTable loginTable;
    private LogTable logTable;
    private ItemTable itemTable;
    private UnitTable unitTable;
    private StockTable stockTable;
    private PriceTable priceTable;
    private SupplierTable supplierTable;
    private ContactTable contactTable;
    private TRXTable trxTable;
    private TRXDetailedTable trxDetailedTable;
    private ReportTable reportTable;

    public static ECashierDB getInstance() {
        return instance;
    }

    /**
     * Constructor
     */
    public ECashierDB() {

        loginTable = new LoginTable();
        logTable = new LogTable();
        itemTable = new ItemTable();
        unitTable = new UnitTable();
        supplierTable = new SupplierTable();
        contactTable = new ContactTable();
        stockTable = new StockTable();
        priceTable = new PriceTable();
        trxTable = new TRXTable();
        trxDetailedTable = new TRXDetailedTable();
        reportTable = new ReportTable();

    }

    /**
     * Open database
     * @throws SQLException
     */
    public void open() throws SQLException {

        connection = DriverManager.getConnection(
                Config.DATABASE_HOST,
                Config.DATABASE_USER,
                Config.DATABASE_PASSWORD
        );

        loginTable.setConnection(connection);
        logTable.setConnection(connection);
        itemTable.setConnection(connection);
        unitTable.setConnection(connection);
        supplierTable.setConnection(connection);
        contactTable.setConnection(connection);
        stockTable.setConnection(connection);
        priceTable.setConnection(connection);
        trxTable.setConnection(connection);
        trxDetailedTable.setConnection(connection);
        reportTable.setConnection(connection);

    }

    /**
     * Close Connection
     * @throws SQLException
     */
    public void close() throws SQLException {

        if (null != connection) {
            connection.close();
        }

    }

    public LoginTable getLoginTable() {
        return loginTable;
    }

    public LogTable getLogTable() {
        return logTable;
    }

    public ItemTable getItemTable() {
        return itemTable;
    }

    public UnitTable getUnitTable() {
        return unitTable;
    }

    public StockTable getStockTable() {
        return stockTable;
    }

    public PriceTable getPriceTable() {
        return priceTable;
    }

    public SupplierTable getSupplierTable() {
        return supplierTable;
    }

    public ContactTable getContactTable() {
        return contactTable;
    }

    public TRXTable getTrxTable() {
        return trxTable;
    }

    public TRXDetailedTable getTrxDetailedTable() {
        return trxDetailedTable;
    }

    public ReportTable getReportTable() {
        return reportTable;
    }
}
