package com.getsdeready.designpatterns.creational.builder;

public class Driver {

    public static void main(String[] args) {
//        Query query = new Query();
//
//        query.setSelect("SELECT x,y,z");
//        query.setTableName("FROM table");
//        query.setGroupBy("group by y,z");
//        query.setOrderBy("order by y,z");


        // method chaining
        QueryBuilder queryBuilder = new QueryBuilder()
                .from("FROM table")
                .select("SELECT x, y, z")
                .where("where z != 1")
                .groupBy("group by y,z")
                .orderBy("order by y, z");

        Query query1 = queryBuilder.build();

        System.out.println(queryBuilder.getSelect());
        System.out.println(queryBuilder.getTableName());

        System.out.println(query1.getQuery());
    }
}
