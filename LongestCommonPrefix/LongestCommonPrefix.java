package LongestCommonPrefix;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"sunny", "sunshine", "sunglasses"};
		int j=0;
		while(j<strs.length) {
			System.out.println(strs[j]);
			j++;
		}
		if(strs == null || strs.length == 0) System.out.print(" ");
		String pre = strs[0];
		int i = 1;
		while(i < strs.length){
		    while(strs[i].indexOf(pre) != 0) pre = pre.substring(0,pre.length()-1);
		    i++;
		}
		System.out.print(pre);
	}
}
