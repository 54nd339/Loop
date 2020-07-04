import java.util.*;
class Magic{
    static Scanner sc=new Scanner(System.in);
    static Magic ob=new Magic();
    boolean isMagi(int n){
        int s=n;
        while(s>9){
            n=s;s=0;
            while(n!=0){
                int r=n%10;
                s+=r;n/=10;
            }
        }
        if(s==1)
        return true;
        else
        return false;
    }
    public static void magNo(){
        System.out.print("Enter a No.:");
        int n=sc.nextInt();
        if(ob.isMagi(n))
        System.out.println(n+" is a Magic No.");
        else
        System.out.println(n+" is Not a Magic No.");
    }
    public static void magSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isMagi(i))
            System.out.println(i);
    }
}