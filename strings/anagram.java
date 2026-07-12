import java.util.*;
public class anagram {
    public static boolean anagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char [] sarray=s.toCharArray();
        char [] tarray=t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        return Arrays.equals(sarray,tarray);
    }
    public static void main(String[] args) {
        String s="array";
        String t="yarra";
        if(anagram(s,t)==true){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
