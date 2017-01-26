public class PrintAscii
{
    public static void main(String args[])
    {
	
        String s;
        int i;
        for(i=1; i<=255; i++)
        {
            s = new Character((char)i).toString();
            System.out.print(i+ " -> " + s + "\t");
        }
		
    }
}