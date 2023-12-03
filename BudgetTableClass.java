/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Budgets;

/**
 *
 * @author Lenovo
 */
public class BudgetTableClass {
    private String year, expendi, expns, total;

    public BudgetTableClass(String year, String expendi, String expns, String total) {
        this.year = year;
        this.expendi = expendi;
        this.expns = expns;
        this.total = total;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getExpendi() {
        return expendi;
    }

    public void setExpendi(String expendi) {
        this.expendi = expendi;
    }

    public String getExpns() {
        return expns;
    }

    public void setExpns(String expns) {
        this.expns = expns;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BudgetTableClass{" + "year=" + year + ", expendi=" + expendi + ", expns=" + expns + ", total=" + total + '}';
    }

    
}
