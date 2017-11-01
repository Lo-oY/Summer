package com.ly.jdbc;

import java.sql.Connection;

/**
 * Created by cilu on 2017/10/31.
 */
public interface ConnectionCallback<T> {
    T doInConnection(Connection connection);
}
