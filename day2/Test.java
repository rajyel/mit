public class Test {

  public static void main(String[] args)
  {
  /*
  The general contract of hashCode is: Whenever it is invoked on the same object 
  more than once during an execution of a Java application, the hashCode method 
  must consistently return the same integer, provided no information used in equals 
  comparisons on the object is modified.
  */
      Employee emp = new Employee();
	  emp.setName("Rajesh Yelnare");
	  System.out.println(" to string "+emp.toString());
	  System.out.println(" hash code "+emp.hashCode());
	  
	}
}