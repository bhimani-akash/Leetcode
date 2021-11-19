package Array;

import java.util.HashMap;

public class _1399 {
    public static int countLargestGroup(int n) {
        HashMap<Integer,Integer> result = new HashMap<>();
        int ans = 0;
        int sum;
        int temp;
        int digit;
        int high = 1;

        for (int i = 1; i <= n; i++) {
            sum = 0;
            temp = i;

            while (temp > 0) {
                digit = temp % 10;
                temp = temp / 10;
                sum += digit;
            }

            result.put(sum,result.getOrDefault(sum,0) + 1);
        }


        for (int i : result.values()) {
            if (i == high)
                ans += 1;

            if (i > high) {
                ans = 1;
                high = i;
            }
        }

        return ans;
    }
}
