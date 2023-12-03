/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BalanceSheets;

/**
 *
 * @author Lenovo
 */
public class BalanceSheetTableClass {
    private String particulars,currAmo,prevAmo;

    public BalanceSheetTableClass(String particulars, String currAmo, String prevAmo) {
        this.particulars = particulars;
        this.currAmo = currAmo;
        this.prevAmo = prevAmo;
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    public String getCurrAmo() {
        return currAmo;
    }

    public void setCurrAmo(String currAmo) {
        this.currAmo = currAmo;
    }

    public String getPrevAmo() {
        return prevAmo;
    }

    public void setPrevAmo(String prevAmo) {
        this.prevAmo = prevAmo;
    }

    @Override
    public String toString() {
        return "BalanceSheetTableClass{" + "particulars=" + particulars + ", currAmo=" + currAmo + ", prevAmo=" + prevAmo + '}';
    }
    
    

    

    
    
    
    
}
