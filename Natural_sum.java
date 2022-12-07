import java.util.*;
class Natural_sum
{
	public static void main(String args[])
{
	Scanner z=new Scanner(System.in);
	int n,sum=0;
	System.out.println("Enter the range of n");
	n=z.nextInt();
	for(int i=1;i<=n;i++)
	sum=sum+i;
	System.out.println(sum);
}
}