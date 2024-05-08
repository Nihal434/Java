
public class  Jbk{

    public class Apple {
        void selling_price(int mrp,int discount){
            int selling_price,discount_price;
            discount_price = (mrp*discount)/100;
            selling_price = mrp-discount_price;
            System.out.println(selling_price);
        }
    
    }
    public class Calculator {
	
        void multiplication(int num1,int num2){
            int product = num1*num2;
            System.out.println("product of two numbers " + product);
        }
        void addTwo(int a , int b){
            int c;
            c = a+b;
            System.out.println("sum of two numbers " + c); 
        }
    
    }

    public class Class1 {
        int add(int a,int b, int c) {
            int sum;
            sum = a+b+c;
            System.out.println("sum method executed");
            System.out.println("sum : " + sum);
            System.out.println("First break point executed");
            return sum;
        }
        
        int avg(int a,int b,int c) {
            Class1 c1 = new Class1();
            int sum1 = c1.add(a, b, c);
            System.out.println("Second break point executed");
            int avg1 = sum1/3;
            System.out.println("avg method executed");
            System.out.println("avg : "+ avg1);
            System.out.println("Third break point executed");
            return avg1;
        }
        
        void discount(int a,int b,int c) {
            Class1 c2 = new Class1();
            int avg = c2.avg(a,b,c);
            System.out.println("Fourth break point executed");
            int result = avg - ((avg*10)/100);
            System.out.println("discount method executed");
            System.out.println("Fifth break point executed");
            System.out.println("Final result : "+ result);
            
        }
    
    }
    public class Company {
        String emp;
        int salary;
        void working_projects(){
            System.out.println("projects method");
        };
        void services(){
            System.out.println("Services method");
        };
    
    }

    public class operators {

        void m1() {
            System.out.println("*******Arithmetic Operators*******");
            System.out.println("Addition of 2 and 3 : " + (2+3));
            System.out.println("Subtraction of 10 and 5 : " + (10-5));
            System.out.println("Multiplication of 20 and 30 : " + (20*30));
            System.out.println("Division of 20 and 10 : " + (20/10));
            System.out.println("Division of 25 and 10 : " + (25/10));
            System.out.println("Modulo of 20 and 10 : " + (20>>10));
            System.out.println("Modulo of 25 and 10 : " + (25%10));
            int a= 10;
    //		System.out.println(++a);
    //		System.out.println(--a);
            System.out.println(a++);
    //		System.out.println(a--);
            
        }
    }

    public class RangeOfdt {
        void m1(){
                      System.out.println( 
                        "S.No.\t  Data Type\t  Size\t  Min. Value\t\t  Max. Value\t"); 
                    System.out.println("1\t  Byte\t\t" + Byte.SIZE 
                                       + "\t" + Byte.MIN_VALUE 
                                       + "\t\t\t" + Byte.MAX_VALUE); 
                    System.out.println("2\t  Short\t\t" + Short.SIZE 
                                       + "\t" + Short.MIN_VALUE 
                                       + "\t\t\t" + Short.MAX_VALUE); 
                    System.out.println("3\t  Integer\t" + Integer.SIZE 
                                       + "\t" + Integer.MIN_VALUE 
                                       + "\t\t" + Integer.MAX_VALUE); 
                    System.out.println("4\t  Float\t\t" + Float.SIZE 
                                       + "\t" + Float.MIN_VALUE 
                                       + "\t\t\t" + Float.MAX_VALUE); 
                    System.out.println("5\t  Long\t\t" + Long.SIZE 
                                       + "\t" + Long.MIN_VALUE + "\t"
                                       + Long.MAX_VALUE); 
                    System.out.println("6\t  Double\t" + Double.SIZE 
                                       + "\t" + Double.MIN_VALUE 
                                       + "\t\t" + Short.MAX_VALUE); 
                    System.out.println("7\t  Character\t"
                                       + Character.SIZE);
                    
            
        }
    
    }

    public class School {
        String name = "xyz";
        String loc;
    
        void curriculum(){
            String name = "xyzfff";
            
            System.out.println(name);	
        };
        void events(){
            System.out.println("Event method");
        };
    
    }

    public class compare_two_num {
	
        void m2(int num1,int num2) {
            if(num1>num2) {
                System.out.println(num1 + " is greater than " + num2);
            }
            else {
                System.out.println(num1 + " is lesser than "+ num2);
            }
        }
    
    }

    public class Even_odd {
        void m1(int num) {
            if(num%2==0) {
                System.out.println(num + " is even number....!");
            }else {
                System.out.println(num + " is odd number....!");
            }
        }
    
    }

    public class Grade {
        void m1(int num) {
            if(num>90 && num<=100) {
                System.out.println("Congratulations you got grade A");
            }
            else if(num<=90 && num>80) {
                System.out.println("Congratulations you got grade B");	
            }
            else if(num<=80 && num>70) {
                System.out.println("Congratulations you got grade C");
            }
            else if(num <=70 && num>60) {
                System.out.println("Congratulations you got grade D");
            }
            else if(num<=60 && num>=0) {
                System.out.println("Congratulations you got grade E");
            }
            else {
                System.out.println("Enter a valid number between 0 to 100");
            }
        }
    
    }

    public class Leap_yr {
        void m1(int yr) {
            if(yr%4==0) {
                if(yr%100==0) {
                    if(yr%400==0) {
                        System.out.println("Entered year is a leap year");
                    }
                    else {
                        System.out.println("Entered year is not a leap year");
                    }
                }
                else {
                    System.out.println("Entered year is a leap year");
                }
            }
            else {
                System.out.println("Entered year is a leap year");
    
            }
        }
    
    }
    
    public class operator {
        void m1() {
            int a = 10;
            System.out.println("Initial value of a : " + a);
            System.out.println("value of a after post increment : " + (a++));
            System.out.println("value of a after post decrement : " + (a--));
            System.out.println("value of a after pre increment : " + (++a));
            System.out.println("value of a after pre decrement : " + (--a));
        }
    
    }
    




}




