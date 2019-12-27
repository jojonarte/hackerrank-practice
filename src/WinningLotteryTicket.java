
public class WinningLotteryTicket {
    static int binaryEquivalent(String s) {
        char[] chars = { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        for (int i = 0; i < s.length(); i ++) {
            chars[s.charAt(i) - 48] = '1';
        }
        String binaryStr = ""+chars[0] + chars[1] + chars[2] + chars[3] + chars[4] + chars[5] + chars[6] + chars[7]  + chars[8] + chars[9];
        return Integer.parseInt(binaryStr, 2);
    }

    static long winningLotteryTicket(String[] tickets) {
        long [] freq = new long[1024];
        int binary;
        long counter = 0l;

        for (String s: tickets) {
            binary = binaryEquivalent(s);
            freq[binary] = 1l;
        }
        for (int i = 0; i < 1023; i ++) {
            if (freq[i] == 0) continue;
            for (int j = i + 1; j < 1024; j ++) {
                if ((i|j) == 1023) {
                   counter += freq[i] * freq[j];
                }
            }
        }

        return counter + freq[1023] * (freq[1023] - 1) / 2;
    }

    public static void main(String[] args) {
        String[] tickets = {
            "129300455",
            "5559948277",
            "012334556",
            "56789",
            "123456879"
        };

        long result = winningLotteryTicket(tickets);
        System.out.println(result);
        System.out.println(Integer.parseInt("1111111111", 2));
    }
}
