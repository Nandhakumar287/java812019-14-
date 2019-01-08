import java.io.*;
import java.util.*;
public class SearchInt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N:");
    int N=sc.nextInt();
    System.out.println("Enter K:");
    int K=sc.nextInt();
    System.out.println("Enter "+N+" Elelments");
    int A[]=new int[N];
    int i=0;
	int Ans=0;
    for(i=0;i<N;i++)
    {
      A[i]=sc.nextInt();
    }
    System.out.println("..............");
    for(i=0;i<N;i++)
    { 
      if(K==A[i])
        {
          Ans=1;
		  //
        }
        else
        {
        
        }
     }
		if(Ans==1)
		{
		System.out.println("Yes ,K value Present");	
		}
		else
		{
			System.out.println("No");
		}
   }
 }
