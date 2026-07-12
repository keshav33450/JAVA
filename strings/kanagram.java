
import java.util.*;

public class kanagram {
    public static boolean kanagram(String s1,String s2,int k){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);


    }
    for(int i=0;i<s2.length();i++){
        char ch=s2.charAt(i);
        if(map.getOrDefault(ch, 0)>0){
        map.put(ch,map.get(ch)-1);
        }
    }
    int count =0;
    for(char ch:map.keySet()){
        count+=map.get(ch);
    }
    if(count>k){
        return false;
    }
    else{
        return true;
    }
}
    public static void main (String [] args){
        String s1="apple";
        String s2="maplae";
        int k=3;
        if (kanagram(s1, s2, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}

