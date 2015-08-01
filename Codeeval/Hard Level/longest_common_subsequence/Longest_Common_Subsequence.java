package longest_common_subsequence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Aakansha Doshi
 *
 */
public class Longest_Common_Subsequence {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
        String s;
        while ((s = br.readLine()) != null) {
            s = s.trim();
            String arr[]=s.split(";");
           // System.out.println(arr[0]+" "+arr[1]);
            System.out.println(lcs(arr[0],arr[1]));
        }
        br.close();

	}

	private static String lcs(String s1, String s2) {
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		int maxlen[][]=new int[arr1.length+1][arr2.length+1];
		for(int i=0;i<=arr1.length;i++)
		{
			for(int j=0;j<=arr2.length;j++)
			{
				if(i==0||j==0)
				{
					maxlen[i][j]=0;
				}
				else if(arr1[i-1]==arr2[j-1])
				{
					maxlen[i][j]=maxlen[i-1][j-1]+1;
				}
				else
				{
					maxlen[i][j]=Math.max(maxlen[i-1][j],maxlen[i][j-1]);
				}
				
			}
		}
		//System.out.println(maxlen[arr1.length][arr2.length]);
		int i=arr1.length;
		int j=arr2.length;
		String ans="";
		while(i>0&&j>0)
		{
			if(arr1[i-1]==arr2[j-1])
			{
				ans=arr1[i-1]+ans;
				i--;
				j--;
				
			}
			else if(maxlen[i][j-1]>=maxlen[i-1][j])
			{
				j--;
			}
			
			else
			{
				i--;
			}
			
		}
		return ans;
		
	}

}
