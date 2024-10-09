/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelreservationapp;

import java.util.Scanner;

public class HotelReservationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelManagementSystem hotel = new HotelManagementSystem();

        hotel.addRoom(0, new Room(101));
        hotel.addRoom(1, new Room(102));
        hotel.addRoom(2, new Room(103));
        boolean running = true;

        System.out.println("Are you an Admin or a Customer?");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("Admin")) {
            Admin admin = new Admin("Admin User");
            admin.accessLevel();

            while (running) {
                System.out.println("\n1. Check Room Availability\n2. Update Room Availability\n3. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        hotel.checkRoomAvailability();
                        break;
                    case 2:
                        System.out.println("Enter room number to update availability:");
                        int roomNumber = scanner.nextInt();
                        System.out.println("Enter 1 for available, 0 for not available:");
                        boolean availability = scanner.nextInt() == 1;

                        for (int i = 0; i < 3; i++) {
                            if (hotel.rooms[i].getRoomNumber() == roomNumber) {
                                admin.manageRoom(hotel.rooms[i], availability);
                                break;
                            }
                        }
                        break;
                    case 3:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }

        } else if (userType.equalsIgnoreCase("Customer")) {
            System.out.println("Enter your name:");
            String customerName = scanner.nextLine();
            Customer customer = new Customer(customerName);
            customer.accessLevel();

            while (running) {
                System.out.println("\n1. Book Room\n2. Check Room Availability\n3. View Booking Details\n4. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        hotel.bookRoom(customer);
                        break;
                    case 2:
                        hotel.checkRoomAvailability();
                        break;
                    case 3:
                        hotel.displayAllBookings();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }

        scanner.close();
    }
    }

