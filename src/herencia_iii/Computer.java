/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_iii;

/**
 *
 * @author alumno
 */
public class Computer {
    
    private String brand;
    private String model;
    private String line;
    
    Computer(String brand, String model, String line){
        this.brand = brand;
        this.model = model;
        this.line = line;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLine() {
        return line;
    }
    
}
