import java.util.*;
class PP{
    static Scanner sc=new Scanner(System.in);
    static PP ob=new PP();
    boolean isPP(int n){
        int s=0;
        Prime ob=new Prime();
        for(int i=1;i<n;i++){
            if(n%i==0 && (i==1?true:ob.isPrime(i)))
            s+=i;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    public static void perNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isPP(n))
        System.out.println(n+" is a Prime Perfect no.");
        else
        System.out.println(n+" is not a Prime Perfect no.");
    }
    public static void perSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        if(ob.isPP(i))
        System.out.println(i);
    }
}