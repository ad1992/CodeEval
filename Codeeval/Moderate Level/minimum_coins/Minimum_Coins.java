package minimum_coins;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class Minimum_Coins {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	        String s;
	        while ((s = br.readLine()) != null) {
	            s = s.trim();
	            int amount=Integer.parseInt(s);
	            int arr[]={1,3,5};
	            int coins[]=new int[amount+1];
	            for(int i=1;i<=amount;i++){
	            	coins[i]=Integer.MAX_VALUE-1;
	            	if(i==1||i==3||i==5)
	            		coins[i]=1;
	            }
	            for(int i=2;i<=amount;i++)
	            {
	            	for(int j=0;j<3;j++)
	            	{
	            		if(arr[j]<=i)
	            			coins[i]=Math.min(coins[i],coins[i-arr[j]]+1);
	            	}
	            }
	            System.out.println(coins[amount]);
	            
	        }
	        br.close();
	}

}
