package String;

public class _1689 {
    public int minPartitions(String n) {
        char best = '0';

        for (char c : n.toCharArray()) {
            if (c > best)
                best = c;
        }

        return best - '0';
    }
}
