/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author jeste
 */
public class Equipment {
    
    protected String name;
    protected int years;
    protected String office;
    protected String condition; 

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public String getOffice() {
        return office;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }

    public String getCondition() {
        return condition;
    }
    //constructor
    public Equipment(String name, int years, String office, String condition){
        this.name = name;
        this.years = years;
        this.office = office;
        this.condition = condition;
    }    
}
