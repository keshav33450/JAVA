public class isbinary{
    public static boolean isbinary(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0' && s.charAt(i)!='1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
    String s="101101";
    System.out.println(isbinary(s));
    }
}