package counting_primes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class Counting_Primes {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int prime[]=new int[1000001];
        int count[]=new int[1000001];
        for(int i=0;i<=1000000;i++)
        	prime[i]=i;
        prime[0]=prime[1]=-1;
        
        for(int i=2;i<=1000;i++)
        {
        	if(prime[i]==i)
        	{
        		for(int j=i;j*j<=1000000;j+=i)
        		{
        			prime[j]=i;
        		}
        		count[i]=count[i-1]+1;
        	}
        	else
        	{
        		count[i]=count[i-1];
        	}
        }
        
        while ((s = br.readLine()) != null) {
            s = s.trim();
          String arr[]=(s.split(","));
          int a=Integer.parseInt(arr[0]);
          int b=Integer.parseInt(arr[1]);
          System.out.println(count[b]-count[a-1]);
        }
        br.close();

	}

}
