package com.getsdeready.designpatterns.creational.builder;

public class QueryBuilder {

    private String select;
    private String where;
    private String tableName;
    private String groupBy;
    private String orderBy;

    public String getSelect() {
        return select;
    }

    public String getWhere() {
        return where;
    }

    public String getTableName() {
        return tableName;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public QueryBuilder select(String select) {
        this.select = select;
        return this;
    }

    public QueryBuilder where(String where) {
        this.where = where;
        return this;
    }

    public QueryBuilder from(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public QueryBuilder groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public QueryBuilder orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Query build() {
        if (this.select == null) {
            throw new RuntimeException("Cannot create query without select");
        }

        if (this.tableName == null) {
            throw new RuntimeException("Cannot create query without tablename");
        }

        Query query = new Query();

        query.setQuery(
                String.join(" ",
                        this.select, this.tableName,
                        this.where, this.groupBy, this.orderBy)
        );

        return query;
    }
}
