package pass_triangle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Pass_Triangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        long arr[][]=new long[100][];
        for(int i=0;i<100;i++)
        {
        	arr[i]=new long[i+1];
        }
        int i=0;
        while ((s = br.readLine()) != null&&!s.isEmpty())
        {
            s = s.trim();
            StringTokenizer st=new StringTokenizer(s);
            for(int k=0;k<=i;k++)
            {
            	arr[i][k]=Long.parseLong(st.nextToken());
            	
            }
            i++;
            
        }
       
        long ans=max_Triangle(arr,i);
        System.out.println(ans);  
        br.close();
            
	}

	private static long max_Triangle(long[][] arr, int n) {
		
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<arr[i].length-1;j++)
			{
				arr[i-1][j]+=Math.max(arr[i][j],arr[i][j+1]);
			}
		}
		return arr[0][0];
				
	}

}
