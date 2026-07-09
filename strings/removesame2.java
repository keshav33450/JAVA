import java.util.*;

public class removesame2{
    public static void main(String[] args) {
        String s = "ababca";
        char c = 'a';
        s = s.replace(String.valueOf(c), "");
        System.out.println(s);
    }
}