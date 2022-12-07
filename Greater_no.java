import java.util.*;
class Greater_no
{
	public static void main(String args[])
{
	Scanner z=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three no to ne checked");
	a=z.nextInt();
	b=z.nextInt();
	c=z.nextInt();
	if(a>b && a>c)
	System.out.println("the greatest no is"+a);		
	else if(b>a && b>c)
	System.out.println("the greatest no is"+b);
	else
	System.out.println("the greatest no is"+c);
}
}