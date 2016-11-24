// https://www.hackerrank.com/challenges/simple-addition-varargs

//\Write your code here
class VarargAdd {
    void add(int... n){
        int sum = 0;
        String out = "";
        for(int i: n){
            out += (i +"+");
            sum += i;
        }
        out = out.substring(0, out.length()-1);
        out += "="+sum;
        System.out.println(out);
    }
}