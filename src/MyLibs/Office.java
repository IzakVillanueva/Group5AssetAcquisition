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
    public int officeHoursStart, officeHoursEnd, capacity;
    public ArrayList<Equipment> equipments = new ArrayList<Equipment>(); 
    private OfficeMediator mediator;
    
    public Office(OfficeMediator mediator, String name, int officeHoursStart, int officeHoursEnd, int capacity){//constructor
        this.mediator = mediator;
        this.name = name;
        this.officeHoursStart = officeHoursStart;
        this.officeHoursEnd = officeHoursEnd;
        this.capacity = capacity;
    }
    
    public String getName() {
        return name;
    }
    
    public void addEquipment(Office office, Equipment equipment) {
        mediator.addEquipment(office, equipment);
    }

    public void removeEquipment(Office office, Equipment equipment) {
        mediator.removeEquipment(office, equipment);
    }

    public void moveEquipment(Office office1, Office office2, Equipment equipment) {
        mediator.moveEquipment(office1, office2, equipment);
    }
}
