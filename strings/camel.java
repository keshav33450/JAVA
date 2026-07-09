public class camel {
    public static String camel(String s) {
        StringBuilder str =new StringBuilder();
    int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                int count =1;
            }
            else if(count ==1){
                str.append(Character.toUpperCase(s.charAt(i)));
                int count=0;
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    
}
public static void main(String[] args) {
    String s="hello iam keshav";
    System.out.println(camel(s));
}
}
