/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pets;

import clases.*;
/***
 *
 * @author 57314
 */
public class poli {
    public static void main(String[] args) {
        
        clsDog pet1 = new clsDog("Pastor Aleman","001","Canino",2013,"Negro","Saludable");
        clsCat pet2 = new clsCat("Angora","002", "minino", 2010, "Blanco", "Saludable" );

        clsDoct doct = new clsDoct("Jorge Sánchez", "123456");
        clsVete vete = new clsVete("Dogtor", "314-678-7528", "algun lugar del mundo", doct);
   
        String saluDog = vete.PetSalud(pet1);
        System.out.println("El estado de salud de "+pet1.getName()+" es "+saluDog);
        pet1.Sound();
        pet1.Move();
        
        String saluCat = vete.PetSalud(pet2);
        System.out.println("El estado de salud de "+pet2.getName()+" es "+saluCat);
        pet2.Sound();
        pet2.Move();
    }
}
