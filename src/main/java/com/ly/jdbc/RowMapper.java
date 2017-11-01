package com.ly.jdbc;

import java.sql.ResultSet;

/**
 * Created by cilu on 2017/10/31.
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int number);
}
