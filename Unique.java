import java.util.*;
class Unique{
    static Scanner sc=new Scanner(System.in);
    static Unique ob=new Unique();
    boolean isUniq(int n){
        int m=n,c=0;
        for(int i=0;i<10;i++){
            c=0;
            while(n!=0){
                int r=n%10;
                if(r==i)
                    c++;
                n=n/10;
            }
            if(c>1)
            break;
            n=m;
        }
        if(c==0||c==1)
        return true;
        else
        return false;
    }
    public static void uniNo(){
        System.out.print("Enter a No.:");
        int n=sc.nextInt();
        if(ob.isUniq(n))
        System.out.println(n+" is an Unique no.");
        else
        System.out.println(n+" is not an Unique no.");
    }
    public static void uniSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int j=1;j<=n;j++)
            if(ob.isUniq(j))
            System.out.println(j);
    }
}