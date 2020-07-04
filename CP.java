import java.util.*;
class CP{
    static Scanner sc=new Scanner(System.in);
    static CP ob=new CP();
    boolean isCP(int n){
        int m=n,c=0;
        Prime ob=new Prime();boolean b=true;
        while(m!=0){
            c++;m/=10;
        }
        m=n;
        for(int c1=0;c1<c;c1++){
            b=true;
            if(ob.isPrime(m)==false){
                b=false;break;
            }
            //System.out.println(m);
            int q=(int)(m/Math.pow(10,c-1));
            int r=(int)(m%Math.pow(10,c-1));
            m=r*10+q;
        }
        if(b)
        return true;
        else
        return false;
    }
    public static void cp(){
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(ob.isCP(n))
        System.out.println(n+" is a Circular Prime");
        else{
        //System.out.println(m);
        System.out.println(n+" is not a Circular Prime");}
    }
    public static void cs(){
        System.out.print("enter the last no.:");
        int n=sc.nextInt();
        for (int i=2;i<=n;i++)
            if(ob.isCP(i))
                System.out.println(i);
    }
}