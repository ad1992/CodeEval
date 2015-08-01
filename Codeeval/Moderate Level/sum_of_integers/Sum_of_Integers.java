package sum_of_integers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Sum_of_Integers {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
        String s;
        StringTokenizer st;
        while ((s = br.readLine()) != null) {
            s = s.trim();
            st=new StringTokenizer(s,",");
            int arr[]=new int[st.countTokens()];
            for(int i=0;i<arr.length;i++)
            {
            	arr[i]=Integer.parseInt(st.nextToken());
            }
            int ans=max_sum(arr);
            System.out.println(ans);
        }
        br.close();

	}

	private static int max_sum(int[] arr) {
		int len=arr.length;
		int maxlen[]=new int[len];
		int max=arr[0];
		maxlen[0]=arr[0];
		for(int i=1;i<len;i++)
		{
			maxlen[i]=arr[i];
			if(maxlen[i-1]>0)
				maxlen[i]+=maxlen[i-1];
			//System.out.println(i+" " +maxlen[i]);
			max=Math.max(max,maxlen[i]);
		}
		return max ;
	}

}
