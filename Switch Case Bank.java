import java.util.Scanner;

public class Banker
{
   public static void main(String[] args)
    {
      	int b=20000,d,s=0,ch,w,x;
      	do
      	{
		System.out.println("1:Diposit \n2:Withdraw \n3:Exit");
 		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			   	System.out.println("Enter deposit amount");
				d=sc.nextInt();
				b=b+d;
				System.out.print("Deposit Successful \nNew Balance=");
				System.out.println(b);
				break;
			case 2:
				System.out.println("Enter withdraw amount");
				w=sc.nextInt();
				if(b>=w)
				{
					b=b-w;
					System.out.print("withdraw Successful \nNew Balance=" );
					System.out.println(b);
				}
				else
				{
					System.out.print("Insufficient Balance \nDo you want to add 5000? \n1:yes\n2:No");
					 x=sc.nextInt();
					 if(x==1)
					 { 
				     b=b+5000;
				     System.out.print("New Balance");
				     System.out.println(b);
				     }
					 else
						 System.out.println("Please add funds in order to withdraw");
		
			    } 
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Enter correct option");
				break;
			
		}
		}
		while(ch<3);
		}
}