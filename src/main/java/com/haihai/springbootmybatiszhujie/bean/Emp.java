package com.haihai.springbootmybatiszhujie.bean;

public class Emp {
    private int eid;

    public int getEid() {
        return eid;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Emp(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    private String ename;

    public Emp() {
    }
}
