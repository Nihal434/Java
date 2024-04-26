public class Practice{
    public static void main(String[] args) {

        int n = 8;
        if(n==0){
            System.out.println("0");
        }else if (n==1) {
            System.out.println("1");
            
        } else {
            // System.out.println("none");
            int first_term=0;
            int second_term = 1;
            int third_term;
            for (int i = 1; i <= n; i++) {
                third_term = first_term+second_term;
                first_term=second_term;
                second_term=third_term;
                
            }
            System.out.println(first_term);

            
        }
    }
}
