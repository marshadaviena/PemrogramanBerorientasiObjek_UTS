/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservationapp;

public class HotelManagementSystem {
    public Room[] rooms = new Room[3];
    private Booking[] bookings = new Booking[3];
    private int bookingCount = 0;

    public void addRoom(int index, Room room) {
        rooms[index] = room;
    }

    public void bookRoom(Customer customer) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isAvailable()) {
                rooms[i].setAvailable(false);
                bookings[bookingCount] = new Booking(customer, rooms[i]);
                bookingCount++;
                System.out.println("Room " + rooms[i].getRoomNumber() + " successfully booked.");
                return;
            }
        }
        System.out.println("No available rooms.");
    }

    public void checkRoomAvailability() {
        System.out.println("Room Availability:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Room " + rooms[i].getRoomNumber() + ": " + (rooms[i].isAvailable() ? "Available" : "Not Available"));
        }
    }

    public void displayAllBookings() {
        if (bookingCount == 0) {
            System.out.println("No bookings yet.");
            return;
        }
        System.out.println("All Bookings:");
        for (int i = 0; i < bookingCount; i++) {
            bookings[i].displayBookingDetails();
        }
    }
}
