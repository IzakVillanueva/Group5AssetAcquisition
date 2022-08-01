/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author Izak
 */
public interface IMediator {
    public void addEquipment(Office office, Equipment equipment);
    public void removeEquipment(Office office, Equipment equipment);
    public void moveEquipment(Office office1, Office office2, Equipment equipment);
}
