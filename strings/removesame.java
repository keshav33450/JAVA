public class Main {
    public static String removestr(String s,char ch){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==ch){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="aaabbbccc";
        char c='a';
        System.out.println(removestr(s,c));
    }
    
}
