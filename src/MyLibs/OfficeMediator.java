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
public class OfficeMediator implements IMediator{
    public ArrayList<Equipment> equipmentList;
    
    public OfficeMediator(){
        equipmentList = new ArrayList<Equipment>();
        
        equipmentList.add(new Printer("Printer 1", 2, "", "new"));
    }
    
    @Override
    public void addEquipment(Office office, Equipment equipment) {
        office.equipments.add(equipment);
        equipment.office = office.name;
    }

    @Override
    public void removeEquipment(Office office, Equipment equipment) {
        office.equipments.remove(equipment);
        equipment.office = "";
    }

    @Override
    public void moveEquipment(Office office1, Office office2, Equipment equipment) {
        office1.equipments.remove(equipment);
        office2.equipments.add(equipment);
        equipment.office = office2.name;
    }
}
