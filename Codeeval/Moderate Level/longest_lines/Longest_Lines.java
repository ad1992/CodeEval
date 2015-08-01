package longest_lines;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Aakansha Doshi
 *
 */
public class Longest_Lines {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        List<String> list=new ArrayList<>();
        s = br.readLine().trim();
        int num=Integer.parseInt(s);
        while ((s = br.readLine()) != null&&!s.isEmpty()) {         
        	s = s.trim();        	
        	list.add(s);        	
        	
        }
        Comparator<String> comp1=new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1.length()>s2.length())
					return -1;
				if(s1.length()<s2.length())
					return 1;
				return 0;
			}
		};
		Collections.sort(list,comp1);
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<num;i++)
			ans.append(list.get(i)+"\n")	;
		System.out.print(ans);
		br.close();
	}

}
