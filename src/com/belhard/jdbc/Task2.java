package com.belhard.jdbc;

import com.belhard.jdbc.util.SqlUtil;

import java.sql.SQLException;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        try {
            List<SqlUtil.City> cities = SqlUtil.getCities();
            System.out.printf("%24.24s %20.20s\n", "City", "Country");
            cities.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
