import java.util.Scanner;
class Test14
{
	public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	String name="Ravi";
	String msg="Welcome to java Training";
	System.out.println(name);
	System.out.println(msg);
	System.out.println("Enter the name");
	String fname=obj.next();
	System.out.println("Your name is "+fname);
}
}