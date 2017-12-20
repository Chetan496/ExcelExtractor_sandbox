package com.chetan.excelextraction;

import com.poiji.annotation.ExcelCell;

public class Employee {

    @ExcelCell(0)              
    private long employeeId;   

    @ExcelCell(1)
    private String name;

    @ExcelCell(2)
    private String surname;

    @ExcelCell(3)
    private int age;

    @ExcelCell(4)
    private boolean single;

    @ExcelCell(5)
    private String birthday;

    //no need getters/setters to map excel cells to fields

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", single=" + single +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
