import java.util.*;
class Factorial{
    static Scanner sc=new Scanner(System.in);
    static Factorial ob=new Factorial();
    int fact(int n){
        if(n==0)
        return (1);
        else
        return(n*fact(n-1));
    }
    public static void fact(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        System.out.print("Factorial="+ob.fact(n));
    }
    public static void facs(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        System.out.println(i+"!="+ob.fact(i));
    }
}