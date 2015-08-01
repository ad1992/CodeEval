package string_permutations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/**
 * @author Aakansha Doshi
 *
 */
public class String_Permutations {
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));      
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null&&!s.isEmpty())
        {
            s = s.trim();
            char arr[]=s.toCharArray();
            TreeSet<String> permute=new TreeSet<>();
            permute=get_All_Permutations(arr,0,s.length()-1,permute);
            StringBuilder ans=new StringBuilder();
            int i=0;
            for(String s1:permute)
            {
            	
            	ans.append(s1);
            	if(i<permute.size()-1)
            		ans.append(",");
            	i++;
            }
            System.out.println(ans);
            
            	
        }
        br.close();

	}

	private static TreeSet<String>  get_All_Permutations(char[] arr,int i,int j, TreeSet<String> permute) {
		
		if(i==j)
		{
		
			permute.add(new String(arr));
			return permute;
		}
		for(int k=i;k<=j;k++)
		{
			swap(arr,k,i);
			get_All_Permutations(arr, i+1, j,permute);
			swap(arr,k,i);
		}
		return permute;
		
	}

	private static void swap(char[] arr, int k, int i) {
		char temp=arr[k];
		arr[k]=arr[i];
		arr[i]=temp;
		
	}

}
