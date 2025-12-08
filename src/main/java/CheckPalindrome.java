public class CheckPalindrome {
    public boolean isPalindrome(int number){
        if(number < 0)
            return false;  // // negative numbers are not palindrome

        int original = number;
        int reversed = 0;

        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {

        CheckPalindrome cp = new CheckPalindrome();
        int num = 121;
        System.out.println(cp.isPalindrome(num));  // Output: true
    }
}