package LongestCommonPrefix;

public class indexofSubstring {

	public static void main(String[] args) {
		String strs = "my name is nancy";
		             //0123456789...
		String pre = "na";
		
		//indexof
		System.out.println(strs.indexOf(pre));
		System.out.println(strs.indexOf(pre, 8));//從8開始找
		
		//substring
//		strs = strs.substring(2);//2~最後
//		System.out.println(strs);
		strs = strs.substring(3,15);//3~14
		System.out.println(strs);
	}

}
