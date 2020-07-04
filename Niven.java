import java.util.*;
class Niven{
    static Scanner sc=new Scanner(System.in);
    static Niven ob=new Niven();
    boolean isNiv(int n){
        int s=0,m=n;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        if(m%s==0)
            return true;
        else
        return false;
    }
    public static void nivNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isNiv(n))
            System.out.print(n+" is a Harshad Number");
        else
            System.out.print(n+" is not a Harshad Number");
    }
    public static void harSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isNiv(i))
            System.out.println(i);
    }
}