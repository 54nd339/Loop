import java.util.*;
class Bouncy{
    static Scanner sc=new Scanner(System.in);
    static Bouncy ob=new Bouncy();
    boolean isBou(int n){
        int m=n,l=9,s=0;boolean b=false,b1=false;
        while(m!=0){
            int r=m%10;
            if(l>=r) 
                l=r;
            else    
                {b=true;;break;}
            m/=10;
        }
        m=n;
        while(m!=0){
            int r=m%10;
            if(s<=r) 
                s=r;
            else    
               {b1=true;break;}
            m/=10;
        }
        if(b && b1)
            return true;
        else
            return false;
    }
    public static void bouNo(){
        System.out.println("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isBou(n))
            System.out.println(n+" is an Bouncy no.");
        else
            System.out.println(n+" is not an Bouncy no.");
    }
    public static void bouSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isBou(i))
            System.out.println(i);
    }
}