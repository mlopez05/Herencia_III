/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_iii;

/**
 *
 * @author alumno
 */
public class SmartPhone extends Computer {
    
    private String resolutiondisplay;
    
    SmartPhone(String brand, String model, String line, String resDisplay){
        super(brand, model, line);
        this.resolutiondisplay = resDisplay;
    }

    public String getResolutiondisplay() {
        return resolutiondisplay;
    }
    
    public String call(){
        return "Calling XXXXXXXX";
    }
}
