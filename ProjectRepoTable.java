/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectReports;

/**
 *
 * @author Lenovo
 */
public class ProjectRepoTable {
    private String nameP,tTime,tBudget,rMaterials;

    public ProjectRepoTable(String nameP, String tTime, String tBudget, String rMaterials) {
        this.nameP = nameP;
        this.tTime = tTime;
        this.tBudget = tBudget;
        this.rMaterials = rMaterials;
    }

    @Override
    public String toString() {
        return "ProjectRepoTable{" + "nameP=" + nameP + ", tTime=" + tTime + ", tBudget=" + tBudget + ", rMaterials=" + rMaterials + '}';
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public String gettBudget() {
        return tBudget;
    }

    public void settBudget(String tBudget) {
        this.tBudget = tBudget;
    }

    public String getrMaterials() {
        return rMaterials;
    }

    public void setrMaterials(String rMaterials) {
        this.rMaterials = rMaterials;
    }
    
}
