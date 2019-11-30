import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            String s=in.nextLine();
            char[] a=s.toCharArray();
            for(int i=0;i<a.length;i++){
                if(a[i]!=' '){
                    if(a[i]>=70){
                        a[i]=(char)(a[i]-5);
                    }else{
                        a[i]=(char)(a[i]+21);
                    }
                }
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<a.length;i++){
                sb.append(a[i]);
            }
            System.out.println(sb);
        }
    }
}