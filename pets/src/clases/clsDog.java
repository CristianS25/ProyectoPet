/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author 57314
 */
public class clsDog extends claPets{
    private String bread;

    public clsDog(String bread, String code, String name, int born_year, String color, String healt_status) {
        super(code, name, born_year, color, healt_status);
        this.bread = bread;
    }

    @Override
    public void Move(){
        System.out.println(super.getName()+" está caminando");
    }
    
    @Override
    public void Sound(){
        System.out.println(super.getName()+" está ladrando");
    }
    
    /**
     * @return the bread
     */
    public String getBread() {
        return bread;
    }

    /**
     * @param bread the bread to set
     */
    public void setBread(String bread) {
        this.bread = bread;
    }
    
}
