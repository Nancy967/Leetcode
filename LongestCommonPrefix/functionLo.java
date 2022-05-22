package LongestCommonPrefix;

import java.util.Scanner;

public class functionLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please texting your string arrays:");
		String[] strs = new String[3];
		int j=0;
		while(j<3) {
			strs[j] = scan.next();
			System.out.println(strs[j]);
			j++;
		}
		
		//假設是["nature","naive","native"]
		
		String result = longestCommonPrefix(strs);
		System.out.println(result);

	}
	
	public static String longestCommonPrefix(String[] strs) {
	    if(strs == null || strs.length == 0) return "";
	    String pre = strs[0];
	    int i = 1;
	    while(i < strs.length){
	        while(strs[i].indexOf(pre) != 0)
	        	pre = pre.substring(0,pre.length()-1);
	        i++;
	    }
	    return pre;
	}
}