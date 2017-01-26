class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
   //bark 
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object
	  //Dog d = new Animal();
      Dog c = new Dog();
      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class'
	  c.move();
   }
}