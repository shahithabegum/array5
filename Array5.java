import java.util.*;
class Array5
{
        public static void main(String arg[])
       {
                 
                int[]   a= new int[100];    
                int i,n,s=0;
	System.out.println("Enter n");
                  Scanner t=new Scanner(System.in);
                  n=t.nextInt();
                  System.out.println("Enter a value");
	for(i=0;i<n;i++)
	{
	  a[i]=t.nextInt();
	}
                
                for(i=0;i<n;i++)
                {
                   for(int j=i+1;j<n;j++)
	   {
	      if(a[i]<a[j])
	     {
	          s=a[i];
	          a[i]=a[j];
                           a[j]=s;
                           
	      }
                   }  
               }
             System.out.println("smallest"+s);
            
          }
}