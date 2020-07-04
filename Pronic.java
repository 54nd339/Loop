import java.util.*;
class Pronic{
    static Scanner sc=new Scanner(System.in);
    static Pronic ob=new Pronic();
    boolean isPron(int n){
        boolean b=false;
        for(int i=0;i<=n;i++)
        if(i*(i+1)==n){
        b=true;break;}
        return b;
    }
    public static void proNo(){
        System.out.print("Entere a no.:");
        int n=sc.nextInt();
        if(ob.isPron(n))
        System.out.println(n+" is an Pronic No.");
        else
        System.out.println(n+" is not an Pronic No.");
    }
    public static void proSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isPron(i))
            System.out.println(i);
    }
}