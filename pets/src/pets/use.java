
package pets;

import clases.*;
import java.util.Date;


class petManager {
    public static void main(String[] args) {
        
        clsDog pet1 = new clsDog("Pastor Aleman","001","Canino",2013,"Negro","Saludable");
        clsCat pet2 = new clsCat("Angora","002", "minino", 2010, "Blanco", "Saludable" );

        Date fecha_actual = new Date();
        int anioActual = fecha_actual.getYear();

        int agePet1 = anioActual - pet1.getBorn_year();
        int agePet2 = anioActual - pet2.getBorn_year();

        if (agePet1 > agePet2) {
            System.out.println("La mascota "+ pet1.getName()+ "  es mayor que la mascota "+ pet2.getName());
        }else{
            if (agePet2> agePet1) {
                System.out.println("La mascota "+ pet2.getName()+ " es mayor que la mascota "+ pet1.getName());
            }else{
                System.out.println("La mascota "+ pet1.getName()+ " tiene la misma edad que la mascota "+ pet2.getName());
            }
        }


        pet1.Eat();
        pet1.Move();
        pet2.Eat();
        pet2.Move();
        pet2.Sound();
    }
}