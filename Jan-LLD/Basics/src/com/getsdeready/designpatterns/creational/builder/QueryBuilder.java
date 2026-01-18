package com.getsdeready.designpatterns.creational.builder;

import java.util.Objects;

public class QueryBuilder {

    private String select;
    private String tableName;
    private String where;
    private String groupBy;

    public String getSelect() {
        return select;
    }

    public QueryBuilder select(String select) {
        this.select = select;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public QueryBuilder tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getWhere() {
        return where;
    }

    public QueryBuilder where(String where) {
        this.where = where;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public QueryBuilder groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }


    public Query build() {
        if (Objects.isNull(this.select)) {
            throw new IllegalArgumentException("Select clause cannot be empty");
        }

        if (Objects.isNull(this.tableName)) {
            throw new IllegalArgumentException("TableName cannot be empty");
        }

        if (Objects.isNull(this.where)) {
            throw new IllegalArgumentException("Where clause cannot be empty");
        }


        StringBuilder sb = new StringBuilder();

        String query = sb
                .append("Select ")
                .append(this.select)
                .append(" from ")
                .append(this.tableName)
                .append(" where ")
                .append(this.where)
                .toString();

        Query query1 = new Query();
        query1.setQuery(query);
        return query1;
    }
}
