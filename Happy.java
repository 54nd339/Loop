import java.util.*;
class Happy{
    static Scanner sc=new Scanner(System.in);
    static Happy ob=new Happy();
    boolean isHap(int n){
        int s=n;
        while(s>9){
            n=s;s=0;
            while(n!=0){
                int r=n%10;
                s=s+r*r;n/=10;
            }
        }
        if(s==1)
        return true;
        else
        return false;
    }
    public static void hapNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isHap(n))
        System.out.println(n+" is a Happy no.");
        else
        System.out.println(n+" is not a Happy no.");
    }
    public static void hapSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isHap(i))
            System.out.println(i);
    }
}