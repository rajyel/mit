class Test1 
{   
    public static void main(String[] args) 
    {
     //System.out.println(" "+7+2+" ");
	  //System.out.println(7+2);
	  int a = 8;
	  int b = 64;
	  int c = 3<<2;
	  System.out.println(c);
	  final StringBuffer s = new StringBuffer("X");
	  bufferReplace(s);
	  System.out.println(" value is "+s);
	 }
	 
	  public static void bufferReplace (StringBuffer text) 
    { 
        text = text.append ("c");  /* Line 9 */
    } 
	 public void foo() 
    {
        assert false; /* Line 5 */
        assert false; /* Line 6 */
    } 
    public void bar()
    {
        while(true)
        {
            assert false; /* Line 12 */
			break;
        } 
        assert false;  /* Line 14 */
    } 
	
}