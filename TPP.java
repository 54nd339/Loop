import java.util.*;
class TPP{
    static Scanner sc=new Scanner(System.in);
    static Prime ob=new Prime();
    public static void twin(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt(),m=n,p1=0,p2=0;
        for(int i=1;i<=n;i++){
            if(ob.isPrime(i) && ob.isPrime(i+2)){
                p1=i;p2=i+2;
                System.out.println("p1="+p1+" p2="+p2);
            }
            if(i==m)
            n+=(m-p1);
        }
        System.out.println("The Twin Prime nearest to "+n+" is "+p1+" and "+p2);
    }
    public static void triplet(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt(),m=n,p1=0,p2=0,p3=0;
        for(int i=1;i<=n;i++){
            if(ob.isPrime(i) && ob.isPrime(i+2) && ob.isPrime(i+6)){
                p1=i;p2=i+2;p3=i+6;
                System.out.println("p1="+p1+" p2="+p2+" p3="+p3);
            }
            if(ob.isPrime(i) && ob.isPrime(i+4) && ob.isPrime(i+6)){
                p1=i;p2=i+4;p3=i+6;
                System.out.println("p1="+p1+" p2="+p2+" p3="+p3);
            }
            if(i==m)
            n+=(m-p1);
        }
        System.out.println("The Prime Triplet nearest to "+n+" is "+p1+", "+p2+" and "+p3);
    }
}