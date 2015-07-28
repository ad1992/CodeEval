package number_of_ones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class Number_of_Ones {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	        String s;
	        while ((s = br.readLine()) != null) {
	            s = s.trim();
	            int num=Integer.parseInt(s);
	            System.out.println(set_Bits(num));
	            
	        }
	        br.close();

	}

	private static int set_Bits(int num) {
		int c=0;
		while(num>0)
		{
			if((num&1)==1)
				c++;
			num>>=1;
	
		}
		return c;
	}

}
