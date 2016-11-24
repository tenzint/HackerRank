import java.util.Scanner;
import java.util.regex.*;
// https://www.hackerrank.com/challenges/pattern-syntax-checker

public class PatternSyntaxChecker
{
    static void check(String pattern){
        try{
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch(PatternSyntaxException pse){
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            check(pattern);
            testCases--;
        }
    }
}
