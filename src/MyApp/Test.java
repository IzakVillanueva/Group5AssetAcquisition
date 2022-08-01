/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

import MyLibs.*;

/**
 *
 * @author Izak
 */
public class Test {
    public static void main(String[] args) {
        OfficeMediator officeMed = new OfficeMediator();
        Office office1 = new Headquarters(officeMed, "Head Office", 6, 20, 50);
        Office office2 = new CustomerService(officeMed, "Customer Service Branch", 9, 21, 100);
        Office office3 = new Security(officeMed, "Security Office", 7, 17, 20);
        
        office1.addEquipment(office1, officeMed.equipmentList.get(0));
        System.out.println(office1.equipments);
        Equipment x = officeMed.equipmentList.get(0);
        System.out.println(x.getOffice());
        //office1.removeEquipment(office1, officeMed.equipmentList.get(0));
        //System.out.println(office1.equipments);
        //System.out.println(x.getOffice());
        
        office1.moveEquipment(office1, office2, officeMed.equipmentList.get(0));
        System.out.println(office2.equipments);
        System.out.println(officeMed.equipmentList.get(0).getOffice());
        //System.out.println(officeMed.equipmentList.get(0));
    }
}
