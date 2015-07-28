package remove_characters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Remove_Characters {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	        String s;
	        while ((s = br.readLine()) != null) {
	            s = s.trim();
	            String arr[]=s.split(",\\s");
	            String pat="([^"+arr[1]+"])";
	            Pattern p=Pattern.compile(pat);
	            Matcher m=p.matcher(arr[0]);
	            while(m.find())
	            {
	            	System.out.print(m.group(0));
	            }
	            System.out.println();
	        }
	        br.close();
		}

	}


