import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/challenges/tag-content-extractor

public class TagContentExtractor{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while(testCases>0){
            String line = in.nextLine();
            int count = 0;
            String regex = "<(.+)>([^<>]*)</\\1>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);
            //Write your code here
            while(m.find()){
                if(m.group(2).length() != 0){
                    System.out.println(m.group(2));
                    count++;
                }
            }
            if(count==0){
                System.out.println("None");
            }
            testCases--;
        }
    }
}
