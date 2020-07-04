import java.util.*;
class Fascinate{
    static Scanner sc=new Scanner(System.in);
    static Fascinate ob=new Fascinate();
    boolean isFasc(int n){
        boolean b=false;char ch=' ';
        for(int i=1;i<=9;i++){
            int m=n*2,o=n*3;
            String s=""+n+m+o;
            b=false;
            for(int j=0;j<s.length();j++){
                ch=s.charAt(j);
                if((int)ch-48==i){
                    b=true;break;}
            }
            if(b==true) continue;
            else break;
        }   
        return b;
    }
    public static void fasNo(){
        System.out.print("Entere a no.:");
        int n=sc.nextInt();
        if(ob.isFasc(n))
        System.out.println(n+" is a Fascinating No.");
        else
        System.out.println(n+" is not a Fascinating No.");
    }
    public static void faSer(){
        System.out.print("Enter the last no.:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(ob.isFasc(i))
            System.out.println(i);
    }
}