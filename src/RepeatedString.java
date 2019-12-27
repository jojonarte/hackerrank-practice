public class RepeatedString {
    static long repeatedString(String s, long n) {
        int counter = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == 'a') {
                counter ++;
            }
        }

        long nDiv = n / s.length();
        long remainder = n - nDiv * s.length();
        long remainderCtr = 0;
        for (int i = 0; i < remainder; i ++) {
            if (s.charAt(i) == 'a') {
                remainderCtr++;
            }
        }

        return nDiv * counter + remainderCtr;
    }

    public static void main(String [] args) {
        System.out.println(repeatedString("aba", 10));
    }
}
