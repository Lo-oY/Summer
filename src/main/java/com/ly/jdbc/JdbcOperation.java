package com.ly.jdbc;

import java.util.List;

/**
 * Created by cilu on 2017/10/31.
 */
public interface JdbcOperation {

    <T> T exeute(ConnectionCallback<T> action);

    <T> T exeute(StatementCallback<T> action);

    void exeute(String sql);

    <T> List<T> query(String sql, RowMapper<T> rowMapper);


    <T> T queryForObject(String sql, RowMapper<T> rowMapper);

    <T> T queryForObject(String sql,Class<T> requireType);





    Object query();

    int delete();

    int update();

    int add();
}
