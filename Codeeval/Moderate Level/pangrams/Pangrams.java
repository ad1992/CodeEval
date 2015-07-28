package pangrams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class Pangrams {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	        String s;
	        while ((s = br.readLine()) != null) {
	           s = s.trim().toLowerCase();
	           StringBuilder ans=new StringBuilder();
	          // System.out.println(s);
	           boolean[] check=new boolean[26];
	           for(int i=0;i<s.length();i++)
	           {
	        	   int ch=s.charAt(i)-97;
	        	   if(ch>=0&&ch<26&&!check[ch])
	        		   check[ch]=true;
	        	   
	           }
	          boolean flag=false;
	           for(int i=0;i<26;i++)
	           {
	        	   if(!check[i]){
	        		  flag=true;
	        		   ans.append((char)(i+97));
	        	   }
	           }
	          if(!flag)
	        	  ans.append("NULL");
	           System.out.println(ans);
	        }
	        br.close();
		}

	

}
