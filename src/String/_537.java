/*
A complex number can be represented as a string on the form "real+imaginaryi" where:
real is the real part and is an integer in the range [-100, 100].
imaginary is the imaginary part and is an integer in the range [-100, 100].
i2 == -1.
Given two complex numbers num1 and num2 as strings, return a string of the complex number that represents
their multiplications.

Example 1:
Input: num1 = "1+1i", num2 = "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

Example 2:
Input: num1 = "1+-1i", num2 = "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.

Constraints:
num1 and num2 are valid complex numbers.
 */
package String;

public class _537 {
    public static String complexNumberMultiply(String num1, String num2) {
        int real1 = Integer.parseInt(num1.substring(0, num1.indexOf("+")));
        int imagine1 = Integer.parseInt(num1.substring(num1.indexOf("+") + 1, num1.length() - 1));
        int real2 = Integer.parseInt(num2.substring(0, num2.indexOf("+")));
        int imagine2 = Integer.parseInt(num2.substring(num2.indexOf("+") + 1, num2.length() - 1));

        int real = real1 * real2 - imagine1 * imagine2;
        int imagine = real1 * imagine2 + real2 * imagine1;

        return real + "+" + imagine + "i";
    }
}
