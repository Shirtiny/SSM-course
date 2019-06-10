package com.SH.TypeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanAndIntHandler extends BaseTypeHandler<Boolean> {
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {
        if (aBoolean){
            preparedStatement.setInt(i,1);
        }else {
            preparedStatement.setInt(i,0);
        }
    }

    public Boolean getNullableResult(ResultSet resultSet, String s) throws SQLException {
        if (resultSet.getInt(s)==1){
            return true;
        }else if (resultSet.getInt(s)==0){
            return false;
        }else {
            return null;
        }
    }

    public Boolean getNullableResult(ResultSet resultSet, int i) throws SQLException {
        if (resultSet.getInt(i)==1){
            return true;
        }else if (resultSet.getInt(i)==0){
            return false;
        }else {
            return null;
        }
    }

    public Boolean getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
       if (callableStatement.getInt(i)==1){
           return true;
       }else if (callableStatement.getInt(i)==0){
           return false;
       }else {
           return null;
       }
    }
}
