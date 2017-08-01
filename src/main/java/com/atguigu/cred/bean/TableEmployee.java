package com.atguigu.cred.bean;

public class TableEmployee {
    private Integer empId;

    private String empName;

    private Long salary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TableEmployee [emfdffspId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
    }
    
}