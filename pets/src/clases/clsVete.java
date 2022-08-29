/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author 57314
 */
public class clsVete {
    private String name;
    private String phone;
    private String dire;
    private clsDoct doct;

    public clsVete(String name, String phone, String dire, clsDoct doct) {
        this.name = name;
        this.phone = phone;
        this.dire = dire;
        this.doct = doct;
    }
    
    public String PetSalud(claPets pet){
        System.out.println("Atendiendo a la mascota "+pet.getName());
        return pet.getHealt_status();
    }
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the dire
     */
    public String getDire() {
        return dire;
    }

    /**
     * @param dire the dire to set
     */
    public void setDire(String dire) {
        this.dire = dire;
    }

    /**
     * @return the doct
     */
    public clsDoct getDoct() {
        return doct;
    }

    /**
     * @param doct the doct to set
     */
    public void setDoct(clsDoct doct) {
        this.doct = doct;
    }
}
