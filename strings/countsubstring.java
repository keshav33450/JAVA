public class countsubstring{
    public static int substring(String s){
        int count = 0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                for(int j=i+1;j<n;j++){
                    if(s.charAt(j)=='1'){
                        count++;
                    }
                }
            }
        } 
        return count;
    }
        public static void main(String[] args){
            String s="10001001010";
            System.out.println(substring(s));
        }
}