public class Main {
    public static String inserpos(StringBuilder sb,char c ,int pos){
        sb.insert(pos,c);
        return sb.toString();
    }
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("keshav");   
        System.out.println(inserpos(sb, 'k', 3));
    
    }
        
    
}
