package com.ydc.test;

/**
 * Created by ydc on 16-11-22.
 */
public class Department {

    private int deptNo;
    private String name;

    public Department() {
        System.out.println("+++++++++++++++++++++");
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNo=" + deptNo +
                ", name='" + name + '\'' +
                '}';
    }
}
