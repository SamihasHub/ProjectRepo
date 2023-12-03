/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salary;

/**
 *
 * @author Lenovo
 */
public class SalaryTableScene {
    private String name, deg,salary;

    public SalaryTableScene(String name, String deg, String salary) {
        this.name = name;
        this.deg = deg;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalaryTableScene{" + "name=" + name + ", deg=" + deg + ", salary=" + salary + '}';
    }
    
}
