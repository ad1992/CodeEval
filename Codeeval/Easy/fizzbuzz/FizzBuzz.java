package fizzbuzz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class FizzBuzz{

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            s = s.trim();
            String arr[]=s.split("\\s");
            int x=Integer.parseInt(arr[0]);
            int y=Integer.parseInt(arr[1]);
            int n=Integer.parseInt(arr[2]);
            displayfb(x,y,n);
            
        }
        br.close();

	}

	private static void displayfb(int x, int y, int n) {
		StringBuilder ans=new StringBuilder();
		for(int i=1;i<=n;i++)
		{
			if(i%x==0)
			{
				ans.append("F");
			}
			if(i%y==0)
			{
				ans.append("B");
				
			}
			else if(i%x!=0)
			{
				ans.append(i);
			}
			ans.append(" ");
			
		}
		System.out.println(ans);
		
	}

}