import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class q1_1_5 {
    public static  void main(String[] args){
        double x=StdRandom.uniform();
        double y=StdRandom.uniform();
        if(0<x && x<1  && 0<y && y<1){
            StdOut.println("true");
        }else{
            StdOut.println("false");
        }


    }
}
