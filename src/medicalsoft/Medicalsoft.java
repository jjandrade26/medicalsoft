/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class Medicalsoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medico PrimerMedico = new Medico("jefferson","andrade","cirujano");
        
       
        System.out.println(PrimerMedico.getNombres());
        System.out.println(PrimerMedico.getApellidos());

    }
    
}
