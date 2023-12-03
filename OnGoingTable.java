/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGoingProjects;

/**
 *
 * @author Lenovo
 */
public class OnGoingTable {
    private String name, time, budget,rawMat;

    @Override
    public String toString() {
        return "OnGoingTable{" + "name=" + name + ", time=" + time + ", budget=" + budget + ", rawMat=" + rawMat + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getRawMat() {
        return rawMat;
    }

    public void setRawMat(String rawMat) {
        this.rawMat = rawMat;
    }

    public OnGoingTable(String name, String time, String budget, String rawMat) {
        this.name = name;
        this.time = time;
        this.budget = budget;
        this.rawMat = rawMat;
    }
    
}
