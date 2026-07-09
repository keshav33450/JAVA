public class reverse {
    public static String reversestring(String s ){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
    public static void main(String[] args){
        String s="keshav";
        System.out.println(reversestring(s)); 
    }
    
}
