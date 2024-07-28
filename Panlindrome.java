import java.util.Scanner;
public class Panlindrome {
    public static void main(String[] args) {
        int r;
        int sum=0;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a palindrome");
        }
        else{
            System.out.println(temp+" is not a palindrome");
        }
    }
}
