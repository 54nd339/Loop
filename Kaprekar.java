import java.util.*;
class Kaprekar{
    static Scanner sc=new Scanner(System.in);
    static Kaprekar ob=new Kaprekar();
    boolean isKap(int n){
        int m=n*n,c=0,i=m;
        while(m!=0){
            m/=10;
            c++;
        }
        if(n%2==0)
        c/=2;
        else
        c=(c+1)/2;
        int r=i%(int)Math.pow(10,c);
        int l=i/(int)Math.pow(10,c);
        if(r+l==n && n%10!=0){
        return(true);
        }else{
        return(false);}
    }
    public static void kapNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isKap(n))
        System.out.print(n+" is a Karprekar no.");
        else
        System.out.print(n+" is not a Karprekar no.");
    }
    public static void kapSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isKap(i))
            System.out.println(i);
    }
}