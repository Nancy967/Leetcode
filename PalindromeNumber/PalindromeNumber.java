package PalindromeNumber;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 1331;
        System.out.println(x);
        boolean isPalindrome = true;
        if (x<0 || (x!=0 && x%10==0)) {
        	isPalindrome = false;
        }
        int rev = 0;
        while (x>rev){
        	rev = rev*10 + x%10;
        	x = x/10;
        }
        if (x==rev || x==rev/10) {
        	isPalindrome = true;
        }else{
        	isPalindrome = false;
        }
        System.out.println(isPalindrome);
    }
}
    
  /*public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
        	rev = rev*10 + x%10;
        	x = x/10;
        }
        return (x==rev || x==rev/10);
    }*/