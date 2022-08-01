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
public class EquipmentList {
    private ArrayList<Equipment> equipmentList;
    
    public EquipmentList(){
        equipmentList = new ArrayList<Equipment>();
        
        equipmentList.add(new Printer("Printer 1", 2, "", "new"));
    }
}
