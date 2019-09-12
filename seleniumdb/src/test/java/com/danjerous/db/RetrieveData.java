package com.danjerous.db;

import org.apache.commons.dbutils.DbUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetrieveData {


    private static Connection conn;
    private static Statement st;
    private static ResultSet rs;
    private static List<User> userList;

    @Test(dataProvider = "getData")
    public void retrievingUsersFromDB(User user) {
        System.out.println(user.getName() + " " + user.getPassword());
    }


    public List<User> getUsers() {
        DBConnection db = new DBConnection();
        st = null;
        conn = null;
        rs = null;

        try {

            conn = db.getConnection();
            st = conn.createStatement();

            String sql = "SELECT * FROM usuarios";

            rs = st.executeQuery(sql);

            List<User> userList = new ArrayList<>();

            while (rs.next()) {
                User user = new User(rs.getString("nombre"), rs.getString("apellido"));
                userList.add(user);
            }

            return userList;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(st);
            DbUtils.closeQuietly(conn);
        }

        return null;
    }

    @DataProvider
    public Object[][] getData() {
        List<User> testList = getUsers();

        /*Object[][] objects = new Object[testList.size()][];

        for (int i = 0; i < testList.size(); i++) {
            objects[i] = new Object[1];
            objects[i][0] = testList.get(i);
        }
        return objects;*/
        return testList.stream()
                .map(user -> new Object[] { user })
                .toArray(Object[][]::new);
    }

   /* @DataProvider
    public Object[][] studentProvider() {
        return studentList.stream()
                .map(student -> new Object[] { student })
                .toArray(Object[][]::new);
    }*/
}
