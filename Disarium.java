import java.util.*;
class Disarium{
    static Scanner sc=new Scanner(System.in);
    static Disarium ob=new Disarium();
    boolean isDis(int n){
        int m=n,s=0,k=0;
        while(n>0){
            k++;n/=10;
        }n=m;
        while(n>0){
            int r=n%10;
            s+=(int)Math.pow(r,k);
            k--;n/=10;
        }
        if(m==s)
        return true;
        else
        return false;
    }
    public static void disNo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isDis(n))
        System.out.print(n+" is an Disarium no.");
        else
        System.out.print(n+" is Not an Disarium No.");
    }
    public static void disSer(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last no.:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
            if(ob.isDis(i))
            System.out.println(i);
    }
}