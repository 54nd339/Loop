import java.util.*;
class Spec2{
    static Scanner sc=new Scanner(System.in);
    static Spec2 ob=new Spec2();
    boolean isSp2(int n){
        int s=0,p=1;
        while(n!=0){
            int r=n%10;
            s+=r;p*=r;
            n/=10;
        }
        if(s+p==n)
        return true;
        else
        return false;
    }
    public static void sp2(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isSp2(n))
        System.out.println(n+" is a Sum Product digit no.");
        else
        System.out.println(n+" is not a Sum Product digit no.");
    }
    public static void perSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        if(ob.isSp2(i))
        System.out.println(i);
    }
}