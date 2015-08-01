package prime_numbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class Prime_Numbers{

	public static void main(String[] args) throws IOException {
			File file = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file));      
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String s;       
            while ((s = br.readLine()) != null) {
            s = s.trim();
            long num=Long.parseLong(s);
            long i=3l; 
            StringBuilder ans=new StringBuilder();
            if(num>2)
                ans.append(2);
            while(i<num)
            {
            	if((i&1)==1&&isPrime(i))
            	{
            		ans.append(","+i);
            	}
            	i+=2;
            }
            System.out.println(ans);
            
        }
         br.close();

	}

	private static boolean isPrime(long n) {
		for(long i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}

}
