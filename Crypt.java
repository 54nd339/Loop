import java.util.*;
class Crypt{
    static Scanner sc=new Scanner(System.in);
    static Crypt ob=new Crypt();
    public static void encryp1(){
        System.out.print("Enter a String:");
        String s=sc.nextLine(),s1="";
        System.out.print("Enter the Shift:");
        int n=sc.nextInt(),a,z;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int b=(int)ch+n;
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch))
                {a=65;z=90;}
                else
                {a=97;z=122;}
                while(b<a)
                b+=26;
                while(b>z)
                b-=26;
                s1+=(char)b;
            }
            else if(ch==' ')
            for(int j=1;j<=2;j++)
            s1+=(char)((int)'Q'+n);
            else
            s1=s1+ch;
        }//System.out.println(s1);
        ob.encryp2(s1);
    }
    public static void decryp1(String s){
        /*System.out.print("Enter a String:");
        String s=sc.nextLine(),*/String s1="";
        System.out.print("Enter the shift:");
        int n=sc.nextInt(),a,z;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int b=(int)ch-n;
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch))
                {a=65;z=90;}
                else 
                {a=97;z=122;}
                while(b<a)
                b+=26;
                while(b>z)
                b-=26;
                if(b==(int)'Q' && (int)s.charAt(i+1)-n==(int)'Q' && i<s.length()){
                b=32;i++;}
                s1+=(char)b;
            }
            else
            s1=s1+ch;
        }System.out.print(s1);
    }
    public static void encryp2(String s){
        /*System.out.print("Enter a String:");
        String s=sc.nextLine(),*/ String s1="",s2="";
        for(int i=0;i<s.length();i++)
            s1+=(int)s.charAt(i);
        for(int i=0;i<s1.length();i++)
            s2=s1.charAt(i)+s2;
        System.out.print(s2);
    }
    public static void decryp2(){
        System.out.print("Enter the code:");
        String s=sc.nextLine(),rev="",s1="",s2="";char ch;
        for(int i=0;i<s.length();i++)
            rev=s.charAt(i)+rev;
        int i=0;
        while(i<s.length()){
            if(rev.charAt(i)>'1'){
                s1=rev.substring(i,i+2);
                ch=(char)(Integer.parseInt(s1));i+=2;
            }else{
                s1=rev.substring(i,i+3);
                ch=(char)(Integer.parseInt(s1));i+=3;
            }s2+=ch;
        }//System.out.println(s2);
        ob.decryp1(s2);
    }
    public static void encryp3(){
        System.out.print("Enter a String:");
        String S=sc.nextLine().toUpperCase(),s1="";
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ob.check(ch)){
                int n=0;String s="";
                //if(Character.isLetter(ch))
                n=(int)ch;
                /*if(Character.isDigit(ch))
                n=Integer.parseInt(ch+"");*/
                if(ch!=' '){
                    while(n!=0){
                        int r=n%2;
                        s=r+s;
                        n/=2;
                    }
                    s=s.replace('0','.');
                    s=s.replace('1','-');
                    s1+=s+" ";
                }
                else
                s1+=" ";
            }
            else s1+=ch+" ";
        }   
        System.out.println(s1);
    }
    boolean check(char ch){
        if(Character.isDigit(ch) || Character.isLetter(ch) || ch==' ')
        return true;
        else return false;
    }
    public static void decryp3(){
        System.out.print("Enter a String:");
        String s=sc.nextLine()+" ",ns="",s1="";
        s=s.replace('.','0');
        s=s.replace('-','1');
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0' && s.charAt(i-1)==' '){
                s=s.substring(0,i)+"."+s.substring(i+1);ch=s.charAt(i);}
            if(Character.isDigit(ch)) s1+=ch;
            else{
                if(ch==' ' && s.charAt(i-1)!=' ' && !Character.isLetter(ch) 
                                && ob.check(ch) && ob.check(s.charAt(i-1))){
                    int S=0,c=0;int n=Integer.valueOf(s1);
                    while(n!=0){
                        int r=n%10;
                        S=S+r*(int)Math.pow(2,c);c++;
                        n/=10;
                    }
                    char dc=(char)S;
                    ns+=dc;
                }
                else ns+=ch;
                s1="";
            }
        }
        System.out.print(ns);
    }
    public static void encryp4(){
        System.out.print("Enter a String:");
        String s=sc.nextLine().toLowerCase(),S="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a') S+='s';
                if(ch=='b') S+='n';
                if(ch=='c') S+='v';
                if(ch=='d') S+='f';
                if(ch=='e') S+='r';
                if(ch=='f') S+='g';
                if(ch=='g') S+='h';
                if(ch=='h') S+='j';
                if(ch=='i') S+='o';
                if(ch=='j') S+='k';
                if(ch=='k') S+='l';
                if(ch=='l') S+='a';
                if(ch=='m') S+='z';
                if(ch=='n') S+='m';
                if(ch=='o') S+='p';
                if(ch=='p') S+='q';
                if(ch=='q') S+='w';
                if(ch=='r') S+='t';
                if(ch=='s') S+='d';
                if(ch=='t') S+='y';
                if(ch=='u') S+='i';
                if(ch=='v') S+='b';
                if(ch=='w') S+='e';
                if(ch=='x') S+='c';
                if(ch=='y') S+='u';
                if(ch=='z') S+='x';
            }
            else S+=ch;
        }
        System.out.println(S);
    }
    public static void decryp4(){
        System.out.print("Enter a String:");
        String s=sc.nextLine().toLowerCase(),S="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='s') S+='a';
                if(ch=='n') S+='b';
                if(ch=='v') S+='c';
                if(ch=='f') S+='d';
                if(ch=='r') S+='e';
                if(ch=='g') S+='f';
                if(ch=='h') S+='g';
                if(ch=='j') S+='h';
                if(ch=='o') S+='i';
                if(ch=='k') S+='j';
                if(ch=='l') S+='k';
                if(ch=='a') S+='l';
                if(ch=='z') S+='m';
                if(ch=='m') S+='n';
                if(ch=='p') S+='o';
                if(ch=='q') S+='p';
                if(ch=='w') S+='q';
                if(ch=='t') S+='r';
                if(ch=='d') S+='s';
                if(ch=='y') S+='t';
                if(ch=='i') S+='u';
                if(ch=='b') S+='v';
                if(ch=='e') S+='w';
                if(ch=='c') S+='x';
                if(ch=='u') S+='y';
                if(ch=='x') S+='z';
            }
            else S+=ch;
        }
        System.out.println(S);
    }
}