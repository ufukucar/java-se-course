package com.ufukucar.v2;


// SQL INSERT - SELECT - UPDATE - DELETE
// JAVA CREATE - READ - UPDATE  - DELETE

import java.sql.*;

public class AppMain {


    static final String QUERY_SELECT_CUSTOMERS_ALL = "SELECT * FROM customers";

    static final String QUERY_SELECT_CUSTOMERS_ALL_BY_ID_ASC = "SELECT * FROM customers ORDER BY customer_id";

    static final String QUERY_SELECT_CUSTOMERS_ALL_BY_ID_DESC = "SELECT * FROM customers ORDER BY customer_id DESC";

    static final String QUERY_UPDATE_CUSTOMERS_BY_ID = """
        UPDATE customers
        SET
        first_name = 'Aşkın',
        last_name = 'Hanım'
        WHERE customer_id = 1;
        """;

    static final String QUERY_INSERT_NEW_CUSTOMER = "INSERT INTO customers (first_name, last_name) VALUES ('Samet', 'Furkan');";

    static final String QUERY_DELETE_CUSTOMERS_BY_ID = "DELETE FROM customers WHERE customer_id = 1;";

    public static void main(String[] args) throws SQLException {


        MyCrud myCrud = new MyCrud();

        // SELECT
        System.out.println("------------------------------------------------- SELECT");
        ResultSet resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);
        if ( resultSet != null ) {
            while ( resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name")
                );
            }
        }

        // UPDATE
        System.out.println("------------------------------------------------- UPDATE");
        myCrud.updateFromTableRecord(QUERY_UPDATE_CUSTOMERS_BY_ID);


        // SELECT
        System.out.println("------------------------------------------------- SELECT");
        resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);
        if ( resultSet != null ) {
            while ( resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name")
                );
            }
        }


        // DELETE
        System.out.println("------------------------------------------------- DELETE");
        myCrud.deleteFromTableRecord(QUERY_DELETE_CUSTOMERS_BY_ID);


        // SELECT
        System.out.println("------------------------------------------------- SELECT");
        resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);
        if ( resultSet != null ) {
            while ( resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name")
                );
            }
        }



        // INSERT
        System.out.println("------------------------------------------------- INSERT");
        myCrud.insertFromTableRecord(QUERY_INSERT_NEW_CUSTOMER);


        // SELECT
        System.out.println("------------------------------------------------- SELECT");
        resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);
        if ( resultSet != null ) {
            while ( resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name")
                );
            }
        }












    }


}
