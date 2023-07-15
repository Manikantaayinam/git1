import java.util.*;
interface A
{
   abstract void deposit1();
}
abstract class C
{
	abstract void Withdraw1();
}
class B extends C
{
    String name;
    long number;
    String email;
    String adress;
    int cibilScore;
    int bankbalance=500;
	static Scanner sc= new Scanner(System.in);
    B()
    {
	System.out.print("ENTER NAME:");
	name=sc.next();
	System.out.print("ENTER PHONENUMBER:");
      number=sc.nextLong();
	System.out.print("ENTER EMAIL:");
	email=sc.next();
	System.out.print("ENTER CIBILSCORE:");
	cibilScore=sc.nextInt();
	}
	public void deposit1()
		{
                         System.out.println("ENTER AMOUNT"); 
			       int deposit=sc.nextInt();
			       bankbalance=bankbalance+deposit;
				 System.out.println("Remaining Balance:"+bankbalance); 
		}
	void Withdraw1()
				{
				System.out.println("ENTER AMOUNT"); 
				int withdraw=sc.nextInt();
				if(withdraw<=bankbalance)
				{
				   bankbalance=bankbalance-withdraw;
					System.out.println("Remaining Balance:"+bankbalance); 
				}
				else
				{
				   System.out.println("Insufficient funds");
				}
				}
		void rupay()
		{
		   System.out.print("rupay card details");
			System.out.print("Name:manikanta");
			System.out.print("pin:9959");
		}
		void visa()
		{
			
		     System.out.print("visa card details");
			System.out.print("Name:manikanta");
			System.out.print("pin:9959");
		}
		void rewardCard()
		{
			  System.out.print("reward card details");
			System.out.print("Name:manikanta");
			System.out.print("pin:9959");
		}
		void shopping()
		{
		   System.out.print("shopping card details");
			System.out.print("Name:manikanta");
			System.out.print("pin:9959");
		}
		void reward()
		{
		     System.out.print("reward card details");
			System.out.print("Name:manikanta");
			System.out.print("pin:9959");
		}	
			
     void options()
	{
		while(true)
		{
		System.out.println("--------------------------------");
	    System.out.println("PRESS-1 FOR OPEN NEW ACCOUNT");
          System.out.println("PRESS-2 FOR DIBIT CARD");
	    System.out.println("PRESS-3 FOR  CREDIT CARD");
	    System.out.println("PRESS-4 FOR LOAN");
	     System.out.println("PRESS-5 FOR TRANSACTION");
		System.out.println("--------------------------------");
		int c=sc.nextInt();
		if(c==1)
		{
		   System.out.println("Name:Manikanta Ayinam");
		   System.out.println("a/c NO:363959975859");
		   System.out.println("IFSC:SBIN00037");
		   System.out.println("balance:500");
		   System.out.println("Adress:ravulapalem branch");
		}
		if(c==2)
		{
		   System.out.println("----------------");
		   System.out.println("PRESS-1 FOR RUPAY CARD");
		   System.out.println("PRESS-2 FOR VISA CARD");
		   System.out.println("PRESS-3 FOR REWARD POINTS CARD");
		   System.out.println("----------------");
			int d=sc.nextInt();
			if(d==1)
			{
				rupay();
			}
			if(d==2)
			{
				visa();
			}
			if(d==3)
			{
				rewardCard();
			}
		 }
		if(c==3)
		{
               System.out.println("----------------");
		   System.out.println("PRESS-1 FOR SHOPPING");
		   System.out.println("PRESS-2 REWARD POINTS");
		   System.out.println("----------------");
			int k=sc.nextInt();
			if(k==1)
			{
				shopping();
			}
			if(k==2)
			{
				reward();
			}
		 
		}
		if(c==4)
		{
               System.out.println("-----------------------");
		   System.out.println("PRESS-1 FOR HOME LOAN");
		   System.out.println("PRESS-2 FOR VEHICLE LOAN");
		   System.out.println("PRESS-3 FOR PERSONAL LOAN");
		   System.out.println("-----------------------");
		    int l=sc.nextInt();
		    if(cibilScore>=750)
			{
				if(l==1)
				{
			       System.out.println("yes you are eligible for loan with 2% intrest Rate");
				}
				if(l==2)
				{
			       System.out.println("yes you are eligible for loan with 3% intrest Rate");
				}
				if(l==3)
				{
			       System.out.println("yes you are eligible for loan with 4% intrest Rate");
				}
			}
			else
			{
				System.out.println("NO you are not elgible");
			}
			
		}
		if(c==5)
		{
		   System.out.println("PRESS-1 FOR DEPOSIT");
		   System.out.println("PRESS-2 FOR WITHDRAW");
		    int t=sc.nextInt();
			if(t==1)
			{
      			deposit1();
			}
			if(t==2)
			{
                     Withdraw1();
			} 
			 System.out.println("PRESS-1 FOR continue the transaction");
			System.out.println("PRESS-2 FOR exit");
			int e=sc.nextInt();
			if(e==1)
			{
                     options();
			}
			if(e==2)
			{
				System.exit(0);
			}
		}
			
			
		}
    
	}	
		   
			
   public static void main(String args[])
    {
	
	B a2= new B();
	 a2.options();
    }
}