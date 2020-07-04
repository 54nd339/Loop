import java.util.*;
class Neon{
    static Scanner sc=new Scanner(System.in);
    static Neon ob=new Neon();
    boolean isNeo(int n){
        int m=n*n;
        int s=0;
        while(m!=0){
            int r=m%10;
            s+=r;
            m/=10;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    public static void neNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isNeo(n))
        System.out.print(n+" is a Neon no.");
        else
        System.out.print(n+" is Not a Neon No.");
    }
    public static void neSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isNeo(i))
            System.out.println(i);
    }
}