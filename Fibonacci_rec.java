public class Fibonacci_rec {
    static int n1=0,n2=1,n3=0,count=10;
    static void fib(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            fib(count-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(n1+" "+n2);
        fib(count-2);
    }
}
