package String;

public class _2000 {
    public String reversePrefix(String word, char ch) {
        String result = "";

        int index = word.indexOf(ch);

        result += new StringBuilder(word.substring(0, index+1)).reverse().toString();

        result += word.substring(index+1);

        return result;
    }
}
