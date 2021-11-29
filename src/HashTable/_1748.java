package HashTable;

import java.util.HashMap;

public class _1748 {
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int ans = 0;

        for (int i : nums) {
            int temp = hashMap.getOrDefault(i,0);
            if (temp == 0)
                hashMap.put(i,1);
            else
                hashMap.put(i,temp + 1);
        }

        for (int i : hashMap.keySet())
            if (hashMap.get(i) == 1)
                ans += i;

        return ans;
    }
}
