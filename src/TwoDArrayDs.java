public class TwoDArrayDs {
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i ++) {
            for (int j = 0; j < arr.length - 2; j ++) {
                int currentTotal = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                System.out.println(currentTotal);
                max = Math.max(currentTotal, max);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] hourglass = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };
        System.out.println(hourglassSum(hourglass));
    }
}
