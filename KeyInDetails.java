import java.io.*;
public class KeyInDetails {

  public static void main(String[] args)
  {
   String   firstName;
   String   lastName;
   String   line;
   int      iSSN;
   String   address;
   try
   {
         BufferedReader keyboardBuffer =
          new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the first name ");
         firstName = keyboardBuffer.readLine();
         System.out.println("Enter the last name ");
         lastName = keyboardBuffer.readLine();
         System.out.println("Enter the SSN Number ");
         line = keyboardBuffer.readLine();
         iSSN = Integer.valueOf(line).intValue();
         System.out.println("Enter the Address ");
         address = keyboardBuffer.readLine();
         System.out.println(" First Name "+firstName);
         System.out.println(" Last Name  "+lastName);
         System.out.println(" SSN        "+iSSN);
         System.out.println(" Address    "+address);
   }
   catch(Exception e)
   {
        System.out.println(" Exception is "+e);
   }

  }
}
