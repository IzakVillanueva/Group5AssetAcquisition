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
public class Photocopy extends Equipment implements ISpecification{

    public Photocopy(String name, int years, String office, String condition) {
        super(name, years, office, condition);
    }

    @Override
    public void powerOnOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
