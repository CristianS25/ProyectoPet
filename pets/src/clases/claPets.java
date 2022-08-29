package clases;

/**
 *
 * @author 57314
 */
public class claPets{
    private String code;
    private String name;
    private int born_year;
    private String color;
    private String healt_status;
    private clsVete vete;
    
    public claPets(String code, String name, int born_year, String color, String healt_status) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.healt_status = healt_status;
    }
    
    
    public void Eat(){
        System.out.println("La macota "+ this.name+ " esta comiendo");
    }

    public void Move(){
        System.out.println("La macota "+ this.name+ " esta moviendose");
    }

    public void Sound(){
        System.out.println("La macota "+ this.name+ " esta realizando un ruido");
    }


    public String getCode() {
        return code;
    }

    
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHealt_status() {
        return healt_status;
    }

    public void setHealt_status(String healt_status) {
        this.healt_status = healt_status;
    }

    public void setCode(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public clsVete getVete() {
        return vete;
    }

    public void setVete(clsVete vete) {
        this.vete = vete;
    }
}
