import java.util.*;
class Sphenic{
    static Scanner sc=new Scanner(System.in);
    static Sphenic ob=new Sphenic();
    boolean isSp(int n){
        int k=n,c=0;
        for(int i=2;i<=k;i++){
            int c1=0;
            while(k%i==0){
                k/=i;c1++;}
            if(c1==1)
            c++;
        }
        if(c==3)
        return true;
        else
        return false;
    }
    public static void spNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isSp(n))
        System.out.print(n+" is a Sphenic no.");
        else
        System.out.print(n+" is not a Sphenic no.");
    }
    public static void spSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isSp(i))
            System.out.println(i);
    }
}