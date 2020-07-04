import java.util.*;
class Evil{
    static Scanner sc=new Scanner(System.in);
    static Evil ob=new Evil();
    boolean isEvil(int n){
        int m=n,c=0;
        while(n!=0){
            int r=n%2;
            if(r==1)
            c++;
            n/=2;
        }
        if(c%2==0)
        return true;
        else
        return false;
    }
    public static void eviNo(){
        System.out.print("Entere a no.:");
        int n=sc.nextInt();
        if(ob.isEvil(n))
        System.out.println(n+" is an Evil No.");
        else
        System.out.println(n+" is not an Evil No.");
    }
    public static void evSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(ob.isEvil(i))
            System.out.println(i);
        }
    }
}