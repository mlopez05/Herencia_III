/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_iii;

/**
 *
 * @author alumno
 */
public class Laptop extends Computer {
    
    private String os;
    
    Laptop(String brand, String model, String line, String os){
        super(brand, model, line);
        this.os =  os;
    }

    public String getOs() {
        return os;
    }
    
    public String installation(){
        return "Installing SQL Server";
    }
}
