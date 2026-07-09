public class isSame{
    public static boolean isSame(String s1,String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args){
        String s1="keshav";
        String s2="keshav";
        if(isSame(s1,s2)){
            System.out.println("yes");
        }else{
            System.out.println("No"); 
        }
    }
    
}