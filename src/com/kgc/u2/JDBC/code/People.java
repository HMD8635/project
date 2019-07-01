package com.kgc.u2.JDBC.code;

public class People {
    private String pname;
    private Integer pid;
    private String psex;
    private String padd;

    public People() {
    }

    public People(String pname, Integer pid, String psex, String padd) {
        this.pname = pname;
        this.pid = pid;
        this.psex = psex;
        this.padd = padd;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public String getPadd() {
        return padd;
    }

    public void setPadd(String padd) {
        this.padd = padd;
    }

    @Override
    public String toString() {
        return "People{" +
                "pname='" + pname + '\'' +
                ", pid=" + pid +
                ", psex='" + psex + '\'' +
                ", padd='" + padd + '\'' +
                '}';
    }
}
