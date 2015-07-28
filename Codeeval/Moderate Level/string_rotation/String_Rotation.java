package string_rotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class String_Rotation {

	public static void main(String[] args) throws IOException {
			File file = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file));
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	        String s;
	        while ((s = br.readLine()) != null) {
	            s = s.trim();
	            String arr[]=s.split(",");
	            arr[0]+=arr[0];
	            System.out.println(check_Rotation(arr[0],arr[1]));
	            
	        }
	        br.close();

	}

	private static String check_Rotation(String s1, String s2) {
		// TODO Auto-generated method stub
		for(int i=0;i+s2.length()<=s1.length();i++)
        {
        	String sub=s1.substring(i,i+s2.length());
        	if(sub.equals(s2))
        	{
        		return "True";
        	}
        		
        }
		return "False";
	}

}
