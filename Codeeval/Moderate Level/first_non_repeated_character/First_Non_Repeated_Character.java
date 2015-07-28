package first_non_repeated_character;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class First_Non_Repeated_Character {

	public static void main(String[] args)throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
        
        String s;
        while ((s = br.readLine()) != null) {
            s = s.trim();
           int check[]=new int[26];
            for(int i=0;i<s.length();i++)
            {
            	int ch=s.charAt(i)-97;
            	check[ch]++;
            }            
            for(int i=0;i<s.length();i++)
            {
            	int ch=s.charAt(i)-97;
            	
            	if(check[ch]==1)
            	{
            		System.out.println((char)(ch+97));
            		break;
            	}
            }
        }
        br.close();
		
	}

}
