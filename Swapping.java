public class Swapping {
    public static void main(String[] args) {
        swap(4,8);

    }
    static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The value of a is "+a+ " and the value of b is "+b);
    }
}
