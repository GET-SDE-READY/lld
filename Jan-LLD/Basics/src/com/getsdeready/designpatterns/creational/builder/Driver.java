package com.getsdeready.designpatterns.creational.builder;

public class Driver {

    public static void main(String[] args) {

        Query query = new Query();

        // 1
        query.setSelect("Select x, y, z");
        query.setWhere("where x = 10");


        // 2
        query.setQuery("Select x, y, z from table where x = 10");


        final QueryBuilder qb = new QueryBuilder();

        Query queryFromBuilder = qb.select("x, y, z")
                .tableName("table")
                .where("x = 10")
                .build();

        System.out.println(queryFromBuilder.getQuery());
    }
}
