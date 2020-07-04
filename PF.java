import java.util.*;
class PF{
    void pf(int n){
        int k=n;
        System.out.println("Prime Factors of "+n+" are:");
        for(int i=2;i<=k;i++){
            while(k%i==0){
                k/=i;
                System.out.println(i);
            }
        }
    }
    public static void pf(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        PF ob=new PF();
        ob.pf(n);
    }
}