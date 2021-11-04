package String;

public class _1967 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern))
                count++;
        }

        return count;
    }
}
