package com.SH.TypeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanToInt extends BaseTypeHandler<Boolean> {//<T>泛型里写java类型


    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {
            if (aBoolean){
                preparedStatement.setInt(i,1);
            }else {
                preparedStatement.setInt(i,0);
            }
    }

    public Boolean getNullableResult(ResultSet resultSet, String s) throws SQLException {
       int sexNum=resultSet.getInt(s);
       if (sexNum==1){
           return true;
       }else if (sexNum==0){
           return false;
       }else {
           return null;
       }
    }

    public Boolean getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int sexNum=resultSet.getInt(i);//i为第几列

        if (sexNum==1){
            return   true;
        }else if (sexNum==0){
            return false;
        }else {
            return null;
        }
    }

    public Boolean getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
       int sexNum=callableStatement.getInt(i);//i为第几列
        if (sexNum==1){
            return   true;
        }else if (sexNum==0){
            return false;
        }else {
            return null;
        }
    }
}
