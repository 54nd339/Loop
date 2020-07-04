import java.util.*;
class Prime{
    static Scanner sc=new Scanner(System.in);
    static Prime ob=new Prime();
    boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void priNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isPrime(n))
        System.out.println(n+" is a Prime no.");
        else
        System.out.println(n+" is a Composite no.");
    }
    public static void priSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt(),i;
        for(i=1;i<=n;i++){
            if(ob.isPrime(i))
            System.out.println(i);
        }
    }
}   