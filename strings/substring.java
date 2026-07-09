import java.util.*;

public class Substring{
public static List<String> findSubstrings(String s) {

    List<String> res = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
        for (int j = i; j < s.length(); j++) {
            res.add(s.substring(i, j + 1));
        }
    }
    return res;
} 
public static void main(String[] args) {
    String s="abc";
    System.out.println(findSubstrings(s));
}
}
