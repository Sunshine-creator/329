package cww329;

import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scanner.next();
        if(isPalindrome(s)){
            System.out.println( s + " is a palindrome ! ");
        }else {
            System.out.println(s + " is not a palindrome ! ");
        }
    }
    public static boolean isPalindrome(String s){
        int low = 0;
        int high =  s.length()-1;
        while (low < high){
            if(s.charAt(low) != s.charAt(high))
                return false;
//                low++;
//                high--;
            low++;
            high--;

        }
        return  true;
    }
}
