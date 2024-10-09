/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservationapp;

public class Booking {
     private Room room;
    private Customer customer;

    public Booking(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
    }
}
