package filename_pattern;

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
public class Filename_Pattern {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        
        while ((s = br.readLine()) != null) {
            s = s.trim();
            String files[]=s.split(" ");
            files[0]=files[0].replace(".","\\.");
            files[0]=files[0].replace("*",".*");
            files[0]=files[0].replace("?",".");
            
            String pat="^"+files[0]+"$";
            Pattern p=Pattern.compile(pat);   
            boolean flag=false;
            for(int i=1;i<files.length;i++)
            {
            	 Matcher m=p.matcher(files[i]);
            	 if(m.find())
                 {
                 	System.out.print(m.group(0)+" ");
                 	flag=true;
                 }
            	
            	 
            }
            if(!flag)
            	System.out.print("-");
          System.out.println();
            
            
        }
        br.close();
	}
	

}
