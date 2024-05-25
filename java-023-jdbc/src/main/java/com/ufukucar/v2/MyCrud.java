package com.ufukucar.v2;


// SQL INSERT - SELECT - UPDATE - DELETE
// JAVA CREATE - READ - UPDATE  - DELETE



import java.sql.*;

public class MyCrud {

    Connection connection = null;

    PreparedStatement preparedStatement = null;

    ResultSet resultSet = null;


    static final String DB_NAME = "postgresql";
    static final String DB_SCHEMA = "companydb";
    static final String DB_USERNAME = "postgres";
    static final String DB_PASSWORD= "123456789";
    static final String DB_PORT = "5432";
    static final String DB_IP = "5432";

    private boolean openConnection () {

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb",
                    DB_USERNAME,
                    DB_PASSWORD);

            return true;


        }catch (SQLException e) {
            System.out.println("HATA: " + e);
            return false;
        }

    }

    private boolean closeConnection () {

        try {

          /*  if ( resultSet != null ) {
                resultSet.close();
            }
            if ( preparedStatement != null ) {
                preparedStatement.close();
            }
*/
            if ( !connection.isClosed() ) {
                connection.close();
            }

            return true;

        }catch (SQLException e) {
            System.out.println("HATA: " + e);
            return false;
        }

    }

    // READ ()
    public ResultSet findFromTableRecordAll(String sql) throws SQLException {

        if ( openConnection() ) {
            System.out.println("Bağlantı açıldı");
            preparedStatement = connection.prepareStatement(sql);
            resultSet  = preparedStatement.executeQuery();
            if ( closeConnection() ) {
                System.out.println("Bağlantı kapatıldı");
            }
            return resultSet;
        }

      else {
            System.out.println("Bağlantı kapalı");
            return null;
        }
    }

    // INSERT () || DELETE () || UPDATE AYNIDIR.
    public void updateFromTableRecord(String sql) throws SQLException {

        if ( openConnection() ) {

            System.out.println("Bağlantı açıldı");

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.executeUpdate();
            System.out.println("Güncelleme başarılı");
            if ( closeConnection() ) {
                System.out.println("Bağlantı kapatıldı");
            }
        }

        else {
            System.out.println("Bağlantı kapalı");
        }


    }

    // INSERT () || DELETE () || UPDATE AYNIDIR.
    public void deleteFromTableRecord(String sql) throws SQLException {

        if ( openConnection() ) {

            System.out.println("Bağlantı açıldı");

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.executeUpdate();
            System.out.println("Güncelleme başarılı");
            if ( closeConnection() ) {
                System.out.println("Bağlantı kapatıldı");
            }
        }

        else {
            System.out.println("Bağlantı kapalı");
        }
    }

    // INSERT () || DELETE () || UPDATE AYNIDIR.
    public void insertFromTableRecord(String sql) throws SQLException {

        if ( openConnection() ) {

            System.out.println("Bağlantı açıldı");

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.executeUpdate();
            System.out.println("Ekleme başarılı");
            if ( closeConnection() ) {
                System.out.println("Bağlantı kapatıldı");
            }
        }

        else {
            System.out.println("Bağlantı kapalı");
        }

    }
}
