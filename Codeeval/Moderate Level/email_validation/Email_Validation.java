package email_validation;

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
public class Email_Validation {
	public static void main(String[] args)throws IOException {
	File file = new File(args[0]);
	BufferedReader br = new BufferedReader(new FileReader(file));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
        String s;
        while ((s = br.readLine()) != null) {
            s = s.trim();
            System.out.println(isValidEmail(s));
            
        }
        br.close();
	}
	private static boolean isValidEmail(String s) {
		
		String pat="^[a-zA-Z0-9.!@#$%&'*+/=?^_`{|}~-]+@[a-zA-Z1-9.]+\\.([a-z]){2,}$";
		Pattern p=Pattern.compile(pat);		
		Matcher m=p.matcher(s);			
		return m.find();
		
	}

}
