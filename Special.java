import java.util.*;
class Special{
    static Scanner sc=new Scanner(System.in);
    static Special ob=new Special();
    boolean isSpec(int n){
        int s=0,p=1,m=n;
        while(m!=0){
            int r=m%10;
            for(int j=1;j<=r;j++)
            p*=j;
            s+=p;
            p=1;m/=10;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    public static void speNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isSpec(n))
        System.out.println(n+" is a Special no.");
        else
        System.out.println(n+" is not a Special no.");
    }
    public static void speSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isSpec(i))
            System.out.println(i);
    }
}