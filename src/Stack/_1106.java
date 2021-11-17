/*
Return the result of evaluating a given boolean expression, represented as a string.
An expression can either be:
"t", evaluating to True;
"f", evaluating to False;
"!(expr)", evaluating to the logical NOT of the inner expression expr;
"&(expr1,expr2,...)", evaluating to the logical AND of 2 or more inner expressions expr1, expr2, ...;
"|(expr1,expr2,...)", evaluating to the logical OR of 2 or more inner expressions expr1, expr2, ...

Example 1:
Input: expression = "!(f)"
Output: true

Example 2:
Input: expression = "|(f,t)"
Output: true

Example 3:
Input: expression = "&(t,f)"
Output: false

Example 4:
Input: expression = "|(&(t,f,t),!(t))"
Output: false

Constraints:
1 <= expression.length <= 20000
expression[i] consists of characters in {'(', ')', '&', '|', '!', 't', 'f', ','}.
expression is a valid expression representing a boolean, as given in the description.
 */
package Stack;

public class _1106 {
//    public boolean parseBoolExpr(String expression) {
//        Stack<Character> st = new Stack();
//
//        for (int i = 0; i < expression.length; i++) {
//            char ch = expression.charAt(i);
//
//            if (ch == ')') {
//                boolean hasTrue = false;
//                boolean hasFalse = false;
//
//                while (st.peek() != '(') {
//                    char next = st.pop();
//
//                    if (next == 't')
//                        hasTrue = true;
//                    else
//                        hasFalse = true;
//                }
//
//                st.pop();
//                char operation = st.pop();
//
//                if (operation == '&') {
//                    st.push(hasFalse ? 'f' : 't');
//                } else if (operation == '|') {
//                    st.push(hasTrue ? 't' : 'f');
//                } else {
//                    st.push(hasTrue ? 'f' : 't');
//                }
//            } else if (ch != ',') {
//                st.push(ch);
//            }
//        }
//
//        return st.pop() == 't';
//    }
}
