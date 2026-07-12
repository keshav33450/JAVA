public class substringindex {

    public static int subindex(String s,String p){
        int n=s.length();
        int m=p.length();
        for(int i=0;i<n-m;i++){ //purinchikoo
            int j;
            for(j=0;j<m;j++){
                if(s.charAt(i+j)!=p.charAt(j)){
                    break;
                }

            }
            if(j==m){
                return i;
            }
        }
        return -1;

    }
    public static void main (String [] args){
        String s="geeksforgeeks";
        String p="eks";
        System.out.println(subindex(s, p));
    }
    
}
