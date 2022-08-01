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
        
       equipmentList.add(new Printer("Canon1", 5, "", "good condition"));
       equipmentList.add(new Computer("Lenovo", 4, "", "new"));
       equipmentList.add(new Photocopy ("Xerox", 7, "", "needs repair"));
       equipmentList.add(new Telephone ("PLDT Home", 7, "", "replacement or lost"));
       equipmentList.add(new Router ("TP-link N300", 3, "", "good condition"));
        
  
       equipmentList.add(new Telephone("Samsung", 2, "", "new"));
       equipmentList.add(new Photocopy("Sharp", 10, "", "needs repair"));
       equipmentList.add(new Computer("Hp", 4, "", "good condition"));
       equipmentList.add(new Printer("Panasonic", 5, "", "replacement or lost"));
       equipmentList.add(new Router("Globe", 1, "", "new"));
       
       equipmentList.add(new Telephone("Apple", 3, "", "good condition"));
       equipmentList.add(new Photocopy("Canon2", 12, "", "replacement or lost"));
       equipmentList.add(new Computer("Acer", 6, "", "good condition"));
       equipmentList.add(new Printer("Lexmark", 2, "", "new"));
       equipmentList.add(new Router("Smart", 8, "", "needs repair"));
       
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
