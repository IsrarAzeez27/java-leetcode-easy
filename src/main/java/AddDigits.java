public class AddDigits {
        public int addDigits(int num) {
            int sum;
            while(num >= 10){
                sum = 0;
                while(num > 0){
                    int temp = num % 10;
                    sum = sum + temp;
                    num = num / 10;
                }
                num = sum;
            }
            return num;
        }
    public static void main(String[] args) {
        AddDigits s = new AddDigits();

        System.out.println(s.addDigits(38));  // Output: 2
        System.out.println(s.addDigits(0));   // Output: 0
        System.out.println(s.addDigits(999)); // Output: 9
    }
}
