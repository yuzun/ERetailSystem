package com.digiwin.eretail.inner.model;

public class TicketType {
    private String tickettypeid;

    private String tickettypename;

    private String comment;

    public String getTickettypeid() {
        return tickettypeid;
    }

    public void setTickettypeid(String tickettypeid) {
        this.tickettypeid = tickettypeid == null ? null : tickettypeid.trim();
    }

    public String getTickettypename() {
        return tickettypename;
    }

    public void setTickettypename(String tickettypename) {
        this.tickettypename = tickettypename == null ? null : tickettypename.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}