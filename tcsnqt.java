/******************************************************************************

TCS NQT Solved Paper - 12th Sept 2021 [Slot 2]

Q2. Given N gold wires, each wire has a length associated with it. At a time, only two adjacent 
small wres assembled at the end of a large wire and the cost of 
forming is the sum of their length. Find the minimum cost when all wires are assembled to form a single wire.

For Example:

Suppose, Arr] = [7, 6, 8, 6, 1, 1). (7.6, 8, 6, 1, 1)-(7, 6, 8, 6, 2), cost = 2

[7, 6, 8, 6, 2)-(7, 6, 8, 8), cost = 8 
(13, 16)-(29), cost = 29 
2+8+13+16+29=68

(7.6, 8, 8)-(13, 8, 8), cost =13 (13, 8, 8)-(13, 16), cost = 16

*******************************************************************************/
import java.util.*;
 class Main
{
    int sum=0;
    int m1(Stack s,int n)
    {
        
        Collections.sort(s);
        Collections.reverse(s);
        int k=(int)s.pop();
        int k1=(int)s.pop();
        int m=k+k1;
        sum=sum+m;
        s.push(m);
        if(n>2)
        {
            n--;
            m1(s,n);
        }
       return sum; 
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer>a1=new Stack<>();
		for(int i=1;i<=n;i++)
		{
		    a1.push(sc.nextInt());
		    
		}
		Main a2=new Main();
		
		System.out.print(a2.m1(a1,n));
		}
}