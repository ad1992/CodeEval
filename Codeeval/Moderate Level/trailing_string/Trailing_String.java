package trailing_string;

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
public class Trailing_String {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        
        while ((s = br.readLine()) != null) {
            s = s.trim();
          String arr[]=(s.split(","));
          System.out.println(is_Trailing(arr[0],arr[1]));
        }
        br.close();

	}

	private static int is_Trailing(String s, String word) {
	String pat=word+"$";
	Pattern p=Pattern.compile(pat);
	Matcher m=p.matcher(s);
	if(m.find())
		return 1;
	return 0;
	}
	
}
