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
public class Headquarters extends Office{
    //constructor
    public Headquarters(OfficeMediator mediator, String name, int officeHoursStart, int officeHoursEnd, int capacity) {
        super(mediator, name, officeHoursStart, officeHoursEnd, capacity);
    }
        
}
