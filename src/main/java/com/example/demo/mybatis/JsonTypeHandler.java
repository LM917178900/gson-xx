package com.example.demo.mybatis;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.postgresql.util.PGobject;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.example.demo.handler.JsonElementLazyWrapper;
//import com.google.gson.JsonNull;

@MappedTypes({JsonElement.class, JsonArray.class, JsonObject.class})
public class JsonTypeHandler extends BaseTypeHandler<Object> {

    private static final PGobject jsonObject = new PGobject();
    private static final JsonParser PARSER = new JsonParser();

    /**
     * 相当于set方法；将dao中的数据设置到sql对象占位符中；
     * <p>
     * void setParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException;
     *
     * @param preparedStatement
     * @param i
     * @param o
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        jsonObject.setType("jsonb");
        jsonObject.setValue(o.toString());
        preparedStatement.setObject(i, jsonObject);
    }

    /**
     * 相当于get 方法，重查询的结果集中，通过字段名称获取查询的值
     *
     * @param resultSet
     * @param columnName
     * @return
     * @throws SQLException
     */
    @Override
    public JsonElement getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
//        return JSONObject.parseObject(resultSet.getString(columnName));
        return PARSER.parse(resultSet.getString(columnName));

    }
//    public JsonElement getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
//        String jsonSource = resultSet.getString(columnName);
//        if (jsonSource != null) {
//            return fromString(jsonSource);
//        }
//        return JsonNull.INSTANCE;
//    }

    /**
     * 相当于get 方法，重查询的结果集中，通过字段列下标获取查询的值
     *
     * @param resultSet
     * @param columnIndex
     * @return
     * @throws SQLException
     */
    @Override
    public Object getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return resultSet.getString(columnIndex);
    }

    /**
     * 相当于get 方法，重查询的结果集中，通过字段列下标获取查询的值
     *
     * @param callableStatement
     * @param columnIndex
     * @return
     * @throws SQLException
     */
    @Override
    public Object getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return callableStatement.getString(columnIndex);
    }
}
