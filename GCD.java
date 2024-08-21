public class GCD {
    public static void main(String[] args) {
        int x=100,y=88;
        System.out.println("The GCD of two number is "+euclidean_gcd(x,y));
        System.out.println("The GCD of two number is "+gcd(47,91));

    }
    //using euclidean method
    static int euclidean_gcd(int x,int y)
    {
        if(y==0)
            return x;
        return euclidean_gcd(y,x%y);
    }
    //using recursion
    static int gcd(int x,int y)
    {
        if(x==0)
            return y;
        if(y==0)
            return x;
        if(x==y)
            return x;
        if(x>y)
            return gcd(x-y,y);
        return gcd(x,y-x);

    }
}
