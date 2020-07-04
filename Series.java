import java.util.*;
class Series{
    static Scanner sc=new Scanner(System.in);
    public static void fib(){
        System.out.print("Enter the no. of terms:");
        int n=sc.nextInt(),a=0,b=1,c;
        System.out.println("Fibonacci Series:");
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=b;b+=a;a=c;
        }
    }
    public static void trib(){
        System.out.print("Enter the nos. of terms:");
        int n=sc.nextInt(),a=0,b=1,c=1,d;
        System.out.println("Tribbonacci Series:");
        for(int i=1;i<=n;i++){
            System.out.println(a);
            d=c;c+=a+b;a=b;b=d;
        }
    }
}       