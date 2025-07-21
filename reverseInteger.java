public class reverseInteger {
    public static void main(String[] args) {
        int num = 758;
        int rev = 0;

        while(num > 0){
            int x = num % 10;
            rev = rev * 10 + x;
            num /= 10;
        }
        System.out.println("Reverse Integer is: " + rev);
    }
}
