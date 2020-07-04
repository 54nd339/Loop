class HCF_LCM{
    public static void hcf_lcm(int a,int b,int n){
        int hcf=0,lcm=1;
        int d=a*b*n;
        for(int c=1;c<=d;c++){
            if(a%c==0 && b%c==0 && n%c==0)
            hcf=c;
        }
        for(int c=1;c<=d;c++){
            if(a%c==0 && b%c==0 && n%c==0){
                lcm*=c;
                a/=c;b/=c;n/=c;
            }
            else if(a%c==0 && b%c==0){
                lcm*=c;
                a/=c;b/=c;
            }
            else if(b%c==0 && n%c==0){
                lcm*=c;
                b/=c;n/=c;
            }
            else if(a%c==0 && n%c==0){
                lcm*=c;
                a/=c;n/=c;
            }
        }
        lcm*=a*b*n;
        System.out.println("HCF="+hcf);
        System.out.println("LCM="+lcm);
    }
}