/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
Implement the MinStack class:
MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.

Example 1:
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

Constraints:
-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */
package Stack;

public class _155 {
//    Stack<Long> st = new Stack<Long>();
//    Long min;
//
//    public MinStack() {
//        min = Long.MAX_VALUE;
//    }
//
//    public void push(int val) {
//        Long value = Long.valueOf(val);
//
//        if (st.isEmpty()) {
//            min = value;
//            st.push(value);
//        } else {
//            if (value < min) {
//                st.push(2 * value - min);
//                min = value;
//            } else
//                st.push(value);
//        }
//    }
//
//    public void pop() {
//        if (st.isEmpty())
//            return;
//
//        Long val = st.pop();
//        if (val < min)
//            min = 2 * min - val;
//    }
//
//    public int top() {
//        Long val = st.peek();
//
//        if (val < min)
//            return min.intValue();
//
//        return val.intValue();
//    }
//
//    public int getMin() {
//        return min.intValue();
//    }
}
