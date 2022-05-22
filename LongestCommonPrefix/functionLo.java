package LongestCommonPrefix;

import java.util.Scanner;

public class functionLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please texting your string arrays:");
		String[] strs = new String[3];//這裡可更改陣列大小
		int j=0;
		while(j<strs.length) {
			strs[j] = scan.next();
			System.out.println(strs[j]);
			j++;
		}
		
		//假設是["nature","naive","native"]
		
		String result = longestCommonPrefix(strs);
		System.out.println(result);

	}
	
	public static String longestCommonPrefix(String[] strs) {
	    String pre = strs[0];
	    int i = 1;
	    while(i < strs.length){
	        while(strs[i].indexOf(pre) != 0 && pre != "")
	        	pre = pre.substring(0,pre.length()-1);
	        i++;
	    }
	    if(pre == "") {
	    	pre = "()";
	    }
	    return pre;
	}
}