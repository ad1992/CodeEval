package stack_implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 * @author Aakansha Doshi
 *
 */
public class Stack_Implementation {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null&&!s.isEmpty())
        {
            s = s.trim();
            String arr[]=s.split("\\s");
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<arr.length;i++)
            {
            	int num=Integer.parseInt(arr[i]);
            	st.push(num);
            }
            int c=0;
            StringBuilder ans=new StringBuilder();
            		
            while(!st.isEmpty())
            {
            	int num=st.pop();
            	if(c==0)
            		ans.append(num+" ");
            	c^=1;
            	
            }
            System.out.println(ans);
            
        }

	}

}
