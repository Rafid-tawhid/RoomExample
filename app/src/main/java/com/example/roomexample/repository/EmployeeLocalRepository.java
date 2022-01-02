package com.example.roomexample.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.roomexample.dao.EmployeeDao;
import com.example.roomexample.db.EmployeeDatabase;
import com.example.roomexample.entities.Employee;

import java.util.List;

public class EmployeeLocalRepository {
    private final EmployeeDao employeeDao;

    public EmployeeLocalRepository(Context context) {

        employeeDao= EmployeeDatabase.getDb(context).getEmployeeDao();


    }


    public LiveData<List<Employee>> getEmployees(){
        return employeeDao.getAllEmployees();
    }
    public void addEmoloyee(Employee employee)
    {
        employeeDao.insertEmployee(employee);
    }
}
