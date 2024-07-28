public class Fibonacci_series{
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3;
        int count=10;
        int sum=1;
        System.out.print(n1+" "+n2);
        for(int i=2;i<count;i++)
        {
            n3=n1+n2;
            sum+=n3;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }
        System.out.println();
        System.out.println("sum: "+sum);


    }
}

