package com.ly.jdbc;

import java.sql.Statement;

/**
 * Created by cilu on 2017/10/31.
 */
public interface StatementCallback<T> {
    T doInStatement(Statement statement);
}
