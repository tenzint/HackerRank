import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
     public static boolean isBalanced(String expression) {
         // char a[] = expression.toCharArray();
         char temp;
         Stack<Character> stack = new Stack<Character>();
         
         for (int i=0; i<expression.length(); i++) {
             temp = expression.charAt(i);
             switch (temp) {
                case '(':
                case '{':
                case '[': stack.push(expression.charAt(i));
                        break;
                case ']': if(stack.empty() || stack.pop() != '[') {        // found unbalanced bracket if no opening bracket OR
                    return false;                                           // last opening bracket doesn't match
                }
                        break;
                 case '}': if(stack.empty() || stack.pop() != '{') {
                    return false;
                }
                        break;
                case ')': if(stack.empty() || stack.pop() != '(') {
                    return false;
                }
                        break;
                 default: 
                           return false;                                // shouldn't have any other brackets...
             }
             
         }
         // ran through all the brackets in the expression

         
         if (stack.empty())
             return true;
         else
             return false;
     }
  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
             boolean answer = isBalanced(expression);
             if(answer)
              System.out.println("YES");
             else System.out.println("NO");
        }
    }
}
