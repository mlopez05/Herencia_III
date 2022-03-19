/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_iii;

/**
 *
 * @author alumno
 */
public class Herencia_III {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Laptop laptop = new Laptop("ASUS","VivoBook","F512FA","Windows Home 10");
        
        System.out.println("Brand: " + laptop.getBrand() + "\nModel: "  + laptop.getModel() + 
                "\nLine: " + laptop.getLine() + "\nOS: " + laptop.getOs() + "\nAction: " + laptop.installation());
        
        SmartPhone smartPhone = new SmartPhone("LG","K22","LMK200BL","2560X1440 píxeles");
        
        System.out.println("Brand: " + smartPhone.getBrand() + "\nModel: " + smartPhone.getModel() + 
                "\nLine: " + smartPhone.getLine() + "\nResolution Display: " + smartPhone.getResolutiondisplay() + "\nAction: " +
                smartPhone.call());
        
    }
    
}
