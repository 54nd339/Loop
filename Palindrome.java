import java.util.*;
class Palindrome{
    static Scanner sc=new Scanner(System.in);
    static Palindrome ob=new Palindrome();
    boolean isPalin(int n){
        int m=n;
        int s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n/=10;
        }
        if(s==m)
        return true;
        else
        return false;
    }
    public static void palNo(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isPalin(n))
        System.out.print(n+" is a Palindrome");
        else
        System.out.print(n+" is Not a Palindrome");
    }
    public static void palSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isPalin(i))
            System.out.println(i);
    }
}