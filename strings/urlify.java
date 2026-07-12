public class urlify {
    public static String urlify(String s){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                res.append("%");
                res.append("2");
                res.append("0");
            }
            else{
             res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s="i love you";
        System.out.println(urlify(s));
    }
    
}
