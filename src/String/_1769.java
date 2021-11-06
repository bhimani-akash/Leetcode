package String;

public class _1769 {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            int sum = 0;

            for (int j = 0; j < len; j++) {

                if (boxes.charAt(j) == '1') {
                    sum += Math.abs(i-j);
                }
            }

            result[i] = sum;
        }
        return result;
    }
}
