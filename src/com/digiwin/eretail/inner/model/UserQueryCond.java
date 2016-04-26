package com.digiwin.eretail.inner.model;

public class UserQueryCond extends UserQueryCondKey {
    private String queryname;

    private String querycond;

    public String getQueryname() {
        return queryname;
    }

    public void setQueryname(String queryname) {
        this.queryname = queryname == null ? null : queryname.trim();
    }

    public String getQuerycond() {
        return querycond;
    }

    public void setQuerycond(String querycond) {
        this.querycond = querycond == null ? null : querycond.trim();
    }
}