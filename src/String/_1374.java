package String;

public class _1374 {
    public String generateTheString(int n) {
        return n % 2 == 0 ? "a".repeat(n-1) + "b" : "a".repeat(n);
    }
}
