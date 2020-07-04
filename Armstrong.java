import java.util.*;
class Armstrong{
    static Scanner sc=new Scanner(System.in);
    static Armstrong ob=new Armstrong();
    boolean isArm(int n){
        int m=n,s=0;
        while(n>0){
            int r=n%10;
            s+=(r*r*r);
            n/=10;
        }
        if(m==s)
        return true;
        else
        return false;
    }
    public static void armNo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isArm(n))
        System.out.print(n+" is an Armstrong no.");
        else
        System.out.print(n+" is Not an Armstrong No.");
    }
    public static void armSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isArm(i))
            System.out.println(i);
    }
}