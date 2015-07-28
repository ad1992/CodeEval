package mth_to_last_element;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class Mth_to_last_element {

	public static void main(String[] args) throws IOException {	
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String s;
        while ((s = buffer.readLine()) != null) {
            s = s.trim();
          String arr[]=s.split("\\s");
		int len=arr.length;
		int ch=Integer.parseInt(arr[len-1]);	
		//System.out.println(ch);
		if(ch<=len-1)
		System.out.println(arr[len-1-ch]);
		
	}
        buffer.close();

}
}