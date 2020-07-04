import java.util.*;
class Perfect{
    static Scanner sc=new Scanner(System.in);
    static Perfect ob=new Perfect();
    boolean isPer(int n){
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            s+=i;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    public static void per(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isPer(n))
        System.out.println(n+" is a Perfect no.");
        else
        System.out.println(n+" is not a Perfect no.");
    }
    public static void perSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isPer(i))
            System.out.println(i);
    }
}