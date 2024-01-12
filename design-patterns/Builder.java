public class BuilderApplication {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("This")
            .append("is")
            .append("example")
            .toString();
        QueryBuilder builder = new QueryBuilder();
        Query query = builder
                .select(new String[]{"name", "age"}, "users")
                .where("name", "John")
                .build();
        System.out.println(query.getQuery());
    }
}

class QueryBuilder {
private Query query;

public QueryBuilder() {
    this.query = new Query();
}

    public QueryBuilder select(String[] cols, String table) {
        this.query.setSelect("Select " + String.join(",", cols) + " from " + table);
        return this;
    }

    public QueryBuilder where(String col, String value) {
        this.query.setWhere("WHERE " + col + " = " + value);
        return this;
    }

    public Query build() {
        String query = "";

        if (this.query.getSelect() == null) {
            throw new RuntimeException("Invalid query. Query cannot be formed without select clause");
        }

        if (!this.query.getSelect().isEmpty()) {
            query += this.query.getSelect();
        }

        if (this.query.getWhere() != null && !this.query.getWhere().isEmpty()) {
            query += " " + this.query.getWhere();
        }
        this.query.setQuery(query);
        return this.query;
    }
}

class Query {
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    private String select;
    private String where;
    private String order;
    private String group;
    private String query;
}



