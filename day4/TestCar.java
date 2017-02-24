class Vehicle {
   public void move() {
      System.out.println("Vehicles can move");
   }
}

class Car extends Vehicle {
   public void move() {
      System.out.println("car  can move and is comfortable ");
   }
}

public class TestCar {

   public static void main(String args[]) {
      Vehicle a = new Vehicle();   // Vehicle reference and object
      Vehicle b = new Car();   // Vehicle reference but Car object

      a.move();   // runs the method in Vehicle class
      b.move();   // runs the method in Car class
   }
}