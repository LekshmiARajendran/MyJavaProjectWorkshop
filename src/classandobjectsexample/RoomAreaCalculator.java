package classandobjectsexample;

import java.util.Scanner;

//write another class that creates instances of the rectangle class to find the total area of two rooms.
public class RoomAreaCalculator {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        Rectangle room1=getSizeOfRoom("Room 1");
        Rectangle room2=getSizeOfRoom("Room 2");
        System.out.println("The Size of Room1 is Length: " +room1.getLength()+ " and Width: "+room1.getWidth());
        System.out.println("The Size of Room2 is Length: " +room2.getLength()+ " and Width: "+room2.getWidth());
        System.out.println("The Perimeter of Room 1 is " +room1.calculatePerimeter());
        System.out.println("The Perimeter of Room 2 is " +room2.calculatePerimeter());
        System.out.println("The Area of Room 1 is " +room1.calculateArea());
        System.out.println("The Area of Room 2 is " +room2.calculateArea());
        double totalAreaOfRooms= (room1.calculateArea()+room2.calculateArea());
        System.out.println("The total Area of the Room is " +totalAreaOfRooms);
    }
    public static Rectangle getSizeOfRoom(String roomName){
        System.out.println("Enter the length of the " +roomName+ ":");
        double length= scanner.nextDouble();
        System.out.println("Enter the width of the " +roomName+ ":");
        double width=scanner.nextDouble();
        return new Rectangle(length,width);
    }

}
