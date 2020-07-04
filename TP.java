import java.util.*;
class TP{
    static Scanner sc=new Scanner(System.in);
    static TP ob=new TP();
    static Prime obP=new Prime();
    boolean isTP(int n){
        if(obP.isPrime(n)){
            int S=0;
            for(int i=n;i!=0;i/=10){
                int r=i%10;
                S=S*10+r;
            }
            if(obP.isPrime(S))
                return true;
            else
                return false;
        }
        else return false;
    }
    public static void tp(){
        System.out.print("enter a Prime No.:");
        int n=sc.nextInt();
        if(obP.isPrime(n)){
            if(ob.isTP(n))
                System.out.println(n+" is a Twisted Prime");
            else
                System.out.println(n+" is not a Twisted Prime");
        }
        else
            System.out.println("Enter a Prime Integer");
    }
    public static void ts(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the last no.:");
        int n=sc.nextInt();
        for (int i=2;i<=n;i++)
            if(ob.isTP(i))
                System.out.println(i);
    }
}