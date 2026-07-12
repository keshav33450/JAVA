import java.util.*;
public class Subsequen
public boolean issequence(String s, String t,int n,int m) {
if(n==0){
    return true;
}
if(m==0){
    return false;
}
if(s.charAt(n-1)==t.charAt(m-1)){
    return issequence(s, t, n-1, m-1);
}
return issequence(s,t,n,m-1);
}
public static void main(String [] args) {
    String s="abn";
    String t="hacrbadn";
    int n=s.length();
    int m=t.length();
    boolean res=new issequence(s,t,n,m);
    if(res){
        System.out.println("True");
        
    }
    else{
        System.out.println("False");
    }
    
}
