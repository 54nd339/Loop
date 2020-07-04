import java.util.*;
class Buzz{
    static Scanner sc=new Scanner(System.in);
    static Buzz ob=new Buzz();
    boolean isBuzz(int n){
        if(n%10==7 || n%7==0)
        return true;
        else
        return false;
    }
    public static void buzNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isBuzz(n))
        System.out.println(n+" is a Buzz no.");
        else
        System.out.println(n+" is Not a Buzz no.");
    }
    public static void buzSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isBuzz(i))
            System.out.println(i);
    }
}   