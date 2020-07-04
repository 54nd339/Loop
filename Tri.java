import java.util.*;
class Tri{
    static Scanner sc=new Scanner(System.in);
    static Tri ob=new Tri();
    boolean isTri(int n){
        int s=0;boolean b=false;
        for(int i=1;i<=n;i++){
            s+=i;
            if(s==n){
                b=true;
                break;}   
        }
        return b;
    }
    public static void triNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isTri(n))
        System.out.print(n+" is a Triangular no.");
        else
        System.out.print(n+" is not a Triangular no.");
    }
    public static void triSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isTri(i))
            System.out.println(i);
    }
}