//Write your code here
// https://www.hackerrank.com/challenges/calculating-volume
// 
class Calculate {
    Scanner in;
    Output output;
    Calculate(){
        in = new Scanner(System.in);
        output = new Output();
    }
    int get_int_val() throws IOException{
        int n = in.nextInt();
        if (n<=0) {
            throw new NumberFormatException ("All the values must be positive");
        }
        return n;
    }
    double get_double_val() throws IOException{
        double d = in.nextDouble();
        if(d <= 0){
            throw new NumberFormatException ("All the values must be positive");
        }
        return d;
    }
    static Volume do_calc(){
        return new Volume();
    }
}
class Volume{
    //////////////////////
    static double get_volume(int a) {                      // volume of a cube
        double vol = (double)(a*a*a);
        return vol;
    }
    static double get_volume(int l, int b, int h) {        // volume of a cuboid
        double vol = (double)(l*b*h);
        return vol;
    }
    static double get_volume(double r){                    // volume of a hemisphere
        double vol = (double)2/(double)3 * Math.PI * r*r*r;
        return vol;
    }
    static double get_volume(double r, double h){          // volume of a hemisphere
        double vol = Math.PI * r*r * h;
        return vol;
    }
    ////////////////////////
}
class Output{
    void display(double volume){
        System.out.printf("%.3f\n", volume);
    }
}