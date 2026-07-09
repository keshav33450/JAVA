public class Search
 {
    public static int search(String s ,char c){
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s ="keshav";
        char c='e';
        System.out.println(search(s,c));
    }
    
}
