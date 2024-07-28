import java.lang.Math;
public class Random_number {
    public static void main(String[] args) {
        //random numbers always generated between 0 and 1 in double
        double a=Math.random();
        System.out.println(a);
        //To generate random number between the given range
        int min=200;
        int max=400;
        double b =Math.random()*(max-min+1)+min;
        System.out.println(b);

        //To generate random num in integer
        int c=(int)(Math.random()*(max-min+1)+min);
        System.out.println(c);
    }
}
