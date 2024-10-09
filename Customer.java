/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservationapp;

public class Customer implements User {
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accessLevel() {
        System.out.println("Access Level: Customer");
    }
}
