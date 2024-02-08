package lk.ijse.gdse66.pos.bo.custom;

import lk.ijse.gdse66.pos.bo.SuperBO;

import java.sql.Connection;
import java.sql.SQLException;

public interface QueryBO extends SuperBO {
    int getCustomer(Connection connection) throws SQLException, ClassNotFoundException;

    int getItem(Connection connection) throws SQLException, ClassNotFoundException;

    int getSumOrders(Connection connection) throws SQLException, ClassNotFoundException;
}