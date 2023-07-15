 class Main
{
	public static void main(String[] args) {
		String s="akanksha";
		String l="";
		String t="";
		String v="";
		int c=0,u=0,d=0;
		int n=s.length();
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j<n;j++)
		    {
		        l="";
		        for(int k=i;k<=j;k++)
		        {
		            l=l+s.charAt(k);
		           
		        }
		        for(int m=0;m<l.length();m++)
		        {
		             c=0;
		            for(int p=m;p<l.length();p++)
		            {
		                if(l.charAt(m)==l.charAt(p))
		                {
		                    c++;
		                }
		            }
		            if(c>=2)
		            {
		                break;
		            }
		            
		        }
		        if(c<=1)
		        {
		           t=l; 
		        }
		        u=t.length();
		        if(u>d)
		        {
		            d=u;
		            v=t;
		        }
		      //   System.out.print(l);
		      //   System.out.println();
		         
		    }
		   
		}
		System.out.print(v);
	}
}