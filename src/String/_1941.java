package String;

public class _1941 {
    public boolean areOccurrencesEqual(String s) {
        int[] ch = new int[26];

        for(int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
        }

        int j = ch[s.charAt(0) - 'a'];
        for(int i : ch) {
            if(i != 0 && i != j) {
                return false;
            }
        }
        return true;
    }
}
