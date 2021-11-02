package Array;

public class _2011 {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                result += 1;
            } else {
                result -= 1;
            }
        }

        return result;
    }
}
