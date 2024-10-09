/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservationapp;

public class Admin implements User {
      private String name;

    public Admin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accessLevel() {
        System.out.println("Access Level: Admin");
    }

    public void manageRoom(Room room, boolean availability) {
        room.setAvailable(availability);
        System.out.println("Room availability updated by admin.");
    }
}