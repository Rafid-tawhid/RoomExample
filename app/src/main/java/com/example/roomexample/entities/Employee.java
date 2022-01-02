package com.example.roomexample.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName ="tbl_employee")
public class Employee {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name ="emp_name")
    private String name;
    @ColumnInfo(name ="emp_salary")
    private double salary;
//    @Ignore
//    private String company;

    @Ignore
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
