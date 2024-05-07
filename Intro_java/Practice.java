public class Practice{
    public static void main(String[] args) {

        int n = 2001;

        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Leap year");
            }
        
        }else{
            System.out.println("Not a leap year");
        }
        
    }

}
