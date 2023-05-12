package com.bridgelabz.addressBookJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressBookServiceJDBC extends DataBase {
    public static void retrieveData() throws SQLException {
        connection = setUpDatabase();
        Statement statement = connection.createStatement();
        String query = "select * from addressbook";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String address = resultSet.getString("address");
            String city = resultSet.getString("city");
            String state = resultSet.getString("state");
            String zip = resultSet.getString("zip");
            String email = resultSet.getString("email");
            String phonenumber = resultSet.getString("phonenumber");
            String name = resultSet.getString("name");
            String type = resultSet.getString("type");
            System.out.println(id + " " + firstName + " " + lastName + " " + address + " " + city + " " + state + " "
                    + zip + " " + email + " " + phonenumber + " " + name + " " + type);
        }
        System.out.println("Retrieve all the data from the addressbook table");
    }

}
