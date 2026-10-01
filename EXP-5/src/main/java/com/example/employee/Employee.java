package com.example.employee;

public class Employee {

    private int eno;
    private String ename;
    private double sal;

    public Employee() {
    }

    public Employee(int eno, String ename, double sal) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}