import java.util.*;
class Duck{
    static Scanner sc=new Scanner(System.in);
    static Duck ob=new Duck();
    boolean isDuc(int n){
        int r=0,c=0;
        for(int i=n;i!=0;i/=10){
            r=i%10;
            if (r==0){
                c=1;break;
            }
        }
        if(c==1)
            return true;
        else
            return false;
    }
    public static void duc(){
        System.out.print("enter a no.:");
        int n=sc.nextInt();
        if (ob.isDuc(n))
            System.out.print(n+" is a duck no.");
        else
            System.out.print(n+" is not a duck no.");
    }
    public static void ducSer(){
        System.out.print("enter the last Integer:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
            if(ob.isDuc(i))
            System.out.println(i);
    }
}