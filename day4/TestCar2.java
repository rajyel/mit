class Vehicle {
   public void move() {
      System.out.println("Vehicles can move");
   }
}

class Car extends Vehicle {
   public void move() {
      super.move();
      System.out.println("car  can move and is comfortable ");
   }
}

public class TestCar2 {

   public static void main(String args[]) {
     
      Vehicle b = new Car();   // Vehicle reference but Car object
      b.move();   // runs the method in Car class
   }
}