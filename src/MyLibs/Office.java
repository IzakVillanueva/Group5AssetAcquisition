/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import java.util.ArrayList;

/**
 *
 * @author Izak
 */
public abstract class Office {
    public String name;
    public int officeHoursStart, officeHoursEnd, squareFeet;
    public double height, capacity;
    public ArrayList<Equipment> equipments = new ArrayList<Equipment>(); 
    private OfficeMediator mediator;
    
    public Office(OfficeMediator mediator){
        this.mediator = mediator;
    }
    
    public void openOffice()
    {
        
    }
    
    public void closeOffice()
    {
        
    }
    
    public void addEquipment(Office office, Equipment equipment) {
        mediator.addEquipment(office, equipment);
        //this.equipments.add(equipment);
        //equipment.office = equipment.name;
    }

    public void removeEquipment(Office office, Equipment equipment) {
        mediator.removeEquipment(office, equipment);
    }

    public void moveEquipment(Office office1, Office office2, Equipment equipment) {
        mediator.moveEquipment(office1, office2, equipment);
    }
}
