/*public class JavaBasics {
    public static void main(String args[]) {
        System.out.print("hello world");
        System.out.println("hello world");
        System.out.println("ritesh\n kumar\n yadav");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
   }   
}*/     





//variable in java

/*public class JavaBasics {
    public static void main(String args[]){
        int a = 10;
        int b= 20;
        System.out.println(a); 
        System.out.println(b);
        String name = "ritesh";
        System.out.println(name);


        a =30;
        b=40;
        System.out.println(ab);
        System.out.println(b);
    }
}*/



//data types in java

/*  public class JavaBasics {
    public static void main(String args[]){
       byte b =5;
       System.out.println(b);
       char ch = 'a';
       System.out.println(ch);
       boolean var = false;
       double price = 10.5;
       int number = 100;
       short n = 240;
       long n1 = 123456; 
        float f1 = 12.5f;
        System.out.println(f1);
        

    } 
}*/




// SUM OF A & B
/*public class JavaBasics {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int sum =a + b;
        System .out.println(sum);

    }
}*/

//INPUT IN JAVA

/* 
import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       // String input = sc.next();
        //System.out.println("you have entered " + input);
       // String name = sc.nextLine();
       // System.out.println(name);

       // int number = sc.nextInt();
        //System.out.println(number);

       // float price = sc.nextFloat();
        //System.out.println(price);

       // double d = sc.nextDouble();
       // System.out.println(d);

       // boolean b = sc.nextBoolean();
        //System.out.println(b);  

        
        

    }
}  */






//SUM OF 2 NUMBERS TAKEN FROM USER

/* 
import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of a and b is " + sum);
    }

}  */



//PRODUCT OF 2 NUMBERS TAKEN FROM USER

/*import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("the product of a and b is " + product);
    }
} */



//AREA OF CIRCLE
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("the area of circle is " + area);
    }
}*/




// TYPE CONVERSION IN JAVA
/* 
import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
       // int a = 257;
      //  long b= a;
      //  System.out.println(b);
      Scanner sc =new Scanner(System.in);
      float number = sc.nextFloat();
      System.out.println(number);



    }
}    */



//TYPE CASTING IN JAVA

/* 
import java.util.*; 
  // public class JavaBasics{
    public static void main(String args[]){
       // Scanner sc= new Scanner (System.in);
        //float a= 25.5f;
        //int b = (int)a;
        //System.out.println(b);
        char ch = 'a';
        int number = ch;
        System.out.println(number);
    }
}*/



//  TYPE EXPRESSION IN JAVA
/* 
import java.util.*;

public class JavaBasics {

    public static void main(String args[]){
      short a=10;
      byte b = 25;
      char c= 'c';
      byte bt = (byte) (a + b + c);
      System.out.println(bt);


    }
}*/
/*
import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        int a= 10 ;
        float b = 20.5f;
        long c=25;
        double d = 30;
        int ans =a + b + c + d;
    
        System.out.println(ans);
    }
     //out will be cannot convert from double to int
}

import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
     byte b= 5;
     byte a= byte (b * 2);
     System.out.println(a);
*/ 

 //In a program, input 3 numbers: A, B andC. Youhave to output the average of
 //these 3 numbers

 /*
 
 import java.util.*;
 public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();

        int B=sc.nextInt();
        int C=sc.nextInt();

        int average = (A + B + C) / 3;
        System.out.println( "the average :" + average);
    }
    
 }


 */


  //In a program, input the side of a square. You have to output the area of the
 //square

/* 
 import java.util.*;

 public class JavaBasics {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println( "area of the square " + area);
        sc.close();
    }
 }
    */



   //  Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 //an eraser. You have to output the total cost of the items back to the user as their bill.
 //(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
   
 
 
 
 /*  import java.util.*;

 public class JavaBasics {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        float pencil = sc.nextFloat();
        float  pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println(total);
        sc.close();

        //adding 18% gst
        float gst= total +(18*total)/100;
        System.out.println(gst);
    }
 }
    */

    //ARTHEMATIC OPERATORS IN JAVA
    //binary operators : + , - , * , / , %
   /* /{
        public static void main(String args[]){
            Scanner sc= new Scanner (System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("the value of a + b is " + (a + b));
            System.out.println("the value of a - b is " + (a - b));
            System.out.println("the value of a * b is " + (a * b));
            System.out.println("the value of a / b is " + (a / b));
            System.out.println("the value of a % b is " + (a % b));
            sc.close();
        }
    } */


    //urnary operators : ++ , --

   /*  import java.util.*;
    public class JavaBasics {
        public static void main(String args[]){
            // int a = 10;
            // int b= ++a;
            // System.out.println(a);
            // System.out.println(b);
            

            // int a = 10;
            // int b= a++;
            // System.out.println(a);
            // System.out.println(b);

            int c = 10;
            int d= --c;
            System.out.println(c);
            System.out.println(d);
            int e = 10;
            int f= e--;
            System.out.println(e);
            System.out.println(f);
         }
    }*/




//RELATIONAL OPERATORS IN JAVA

   /*  import java.util.*;
    public class JavaBasics{
        public static void main(String args[]){
            int A = 10;
            int B = 20;
            System.out.println(A==B);
            System.out.println(A!=B);
            System.out.println(A>=B); 
            System.out.println(A>B);

        }
    }*/


//LOGICAL OPERATORS IN JAVA

/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        System.out.println( (5 > 3) && (8 > 5) );
        System.out.println( (5 > 3) || (8 < 5) );   
        System.out.println( !(5 > 3) );
    }
} */


//ASSIGNMENT OPERATORS IN JAVA

/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        int a = 10;
        a += 5; // a = a + 5
        System.out.println(a);
        a -= 3; // a = a - 3
        System.out.println(a);
        a *= 2; // a = a * 2
        System.out.println(a);
        a /= 4; // a = a / 4
        System.out.println(a);
        a %= 6; // a = a % 6
        System.out.println(a);
    }
}*/

//quetion 
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        int x = 10, y = 20;

        int exp1= (x*y/x);
        int exp2 =(x*(y/x));
        System.out.println(exp1 +" ,");
        System.out.println(exp2);
    }
}*/





//CONDITIONAL STATEMENTS IN JAVA


/*public class JavaBasics{
    public static void main(String args[]){
        int age = 17;
        if ( age >= 18){
            System.out.println(" adult: drink , drive ,marrage , vote ");
        }
        if ( age >16 && age <18){
            System.out.println("teenager: drive , marrage , vote");
        }

        else {
            System.out.println("not adult: shit at home and study");
        }
    }*/


    // print the largest number 
     
 /*    public class JavaBasics{
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
            int b=sc.nextInt();


            if( a>b ){
                System.out.println( "  a is a largest number ");
            }
            else {
                System.out.println("b is largest number ");
            }

           sc.close();
        }
    }


   */
  
   //odd and even
/*import java.util.*;

    public class JavaBasics{
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
           
            if ( a%2==0){
                System.out.print( " even");
            }
            else {
                System.out.print("odd");
            }
        }
    }
  */
  
  
  // else if statement 

 /*  import java.util.*;
  public class JavaBasics{
  public static void main(String args[]){
  int C = 15;
   
  if ( C >=18){
    System.out.println("adult");
  }
  else if (C >13 && C < 18){
    System.out.println("teenager");
  }
  else {
    System.out.println("not adult");
  }     
    }


}*/

//INCOME TAX CALCULATOR 
/* 
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;

        if ( income < 500000){
            System. out .println(tax= tax*0);
        
        } 
        else if ( income >=500000 && income <=1000000){
            System.out.println( tax = income * 20/100);
        }
        else {
            System.out.println(tax = income * 30/100);
        }
    }
}*/


//ternary operator in java
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        int number =4;
        String type = (number % 2 ==0) ? "even" : "odd";
        System.out.println(type);
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        int marks =34;
        String type = (marks >=33) ? "pass" : "fail";
        System.out.println(type);
    }
    }*/


    //SWITCH  STATEMENT IN JAVA
     

/*import java.util.*;
public class JavaBasics{ 
    public static void main(String args[]){
        int number = 8;
        switch (number){ 
            case 1 :System.out.println("samosa");
            break;
            case 2 :System.out.println("burger");
            break;  
            case 3 :System.out.println("pizza");
            break;  
            default : System.out.println("gareeb");

    }
   }
}*/

// calculator using switch statement

/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the a");

        int a= sc.nextInt();
        System.out.println("enter the b");
        int b= sc.nextInt();
        System.out.println("enter the Operator");
        char op = sc.next().charAt(0);

        switch(op){
            case '+' : System.out.println(a + b);
            break;
            case '-' : System.out.println(a - b);
            break;
            case '*' : System.out.println(a * b);
            break;
            case '/' : System.out.println(a / b);
            break;
            case '%' : System.out.println(a % b);
            break;
            default : System.out.println("invalid");

        }
    }
}*/


//Question   Write a Javaprogram that takes a year from the user and print whether thatyear is a leap year or not.

/*import java.util.*;
public class JavaBasics{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();

        boolean x= (year % 4 ==0);
        boolean y= (year % 100 !=0);
        boolean z= (year % 400 ==0);
        if ( x && y || z){
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }
        

    }
}
 */



 // write a java program to input week number (1-7)and print day of week name using switch case 
 
/* import java.util.*;
 public class JavaBasics{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the week number");
        int week = sc.nextInt();
        switch(week){
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("sunday");
            break;
            default : System.out.println("invalid");
        }
    }

 }*/


 //loops in java
 /*import java.util.*;
 public class JavaBasics{
    public static void main(String args[]){
         int counter=0;

         while(counter < 5){
            System.out.println("hello world");
            counter++;
         }
    }

 }*/


    
  /*  import java.util.*;
    
    public class JavaBasics{
        public static void main(String args[]){
            int counter=1;
            while(counter <=100){
                System.out.print(counter);
                counter++;
            }
        }
    
     }
*/

//print numbers from n to 1

/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int range = sc.nextInt();
        int counter =1;

        while(counter <=range){
            System.out.print(counter + "  ");
            counter++;
        }
        System.out.println();
    }

 }
*/


// print sum of first n natural numbers

/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner( System.in);
        int n = sc.nextInt();
        int sum=0;
 
        int i =1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
*/


//for loop
/*import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        //int i =1;
        for (int i =1; i<=10; i++){
            System.out.println("hello world");
        }
    }
}*/

//print square pattern
/*import java.util.*;
public class javaBasics{
    public static void main(String args[]){
       // for(int line=1; line<=4; line++){
         //   System.err.println("****");
       int line =1;
       while(line <=4){
        System.out.println("****");
        line++;
       }

        }

    }
*/


//print reverse of a number

/*import java.util.*;
public class javaBasics{
    public static void main(String args[]){
    int n = 1234;
     
    while (n>0){
        int lastdigit = n%10;

        System.out.print(lastdigit);
        n = n/10;
    }
    System.out.println();
    }
}
*/


//reverse the given number

/*import java.util.*;
public class javaBasics{
    public static void main(String[] args) {
        int n = 1234;
        int reverse=0;
        
        while (n>0) 
        { 
            int lastdigit = n%10;
            reverse = reverse * 10 + lastdigit;
            n = n/10;
            
        }
        System.out.println(reverse);
    }
}*/




// do while loop in java


/*import java.util.*;
public class javaBasics{
    public static void main(String[] args) {
        int counter =1;
        do {
            System.out.println("hello world");
            counter++;
        } while (counter <=10);
    }
}
    */
//break statement in java

/*import java.util.*;
public class javaBasics{
    public static void main(String[]args){
        for (int i=1;i<=5;i++){
            if( i==3){
                break;
            }System.out.println(i);
        }System.out.println("hello world");
    }
}    */


// question break keyword in java
 /*import java.util.*;
 public class javaBasics{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("enter the number");
            int n = sc.nextInt();

            if ( n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);

    }
 }
*/

//continue statement in java

/*import java.util.*;
public class javaBasics{

      public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }
      }
}*/
/* 
import java.util.*;
public class javaBasics{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        do{
            System.out.println("enter the number");
            int n = sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println("number is " + n);

        }while(true);
    }
}*/



//check if a number is primr is not

/*import java.util.*;
public class javaBasics{
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();


        if(n==2){
            System.out.println("prime");
            
        }else{ 
            boolean isPrime = true;
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n% i==0){
                isPrime = false;
            }
        }
        if (isPrime == true){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

        }
       
    }
}*/


// Write a program that reads a set of integers,and then prints the sum of the
 //even and odd integers

// import java.util.*; 
// public class javaBaiscs{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
     
//         int number;
//         int choice;
//         int evenSum =0;
//         int oddSum =0;

//         do {
//             System.out.println("enter the number");
//             number = sc.nextInt();

//             if ( number % 2 ==0){
//                 evenSum += number;
//             }
//             else {
//                 oddSum += number;
//             }

//             System.out.println(" do u want to continue ? if yes then press 1");

//             choice = sc.nextInt();

//         }while ( choice ==1);
//         System.out.println("sum of even number " + evenSum);
//         System.out.println("sum of odd number " + oddSum);
//     }
// }

/* 
import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;  
        int evenSum = 0;
        int oddSum = 0;
        
        System.out.print("Enter how many numbers you want to input: ");
        n = sc.nextInt();  // user decides how many numbers to input
        
        System.out.println("Enter " + n + " integers:");
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();  // read a number
            
            // Check even or odd
            if (num % 2 == 0) {
                evenSum += num;   // add to even sum
            } else {
                oddSum += num;    // add to odd sum
            }
        }
        
        // Print results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
        sc.close(); // good practice to close Scanner
    }
}
*/


//nested loops in java

// paterns 
/*
import java.util.Scanner;
public class javaBasics{
    public static void main(String args[]){
        for(int line=1; line<=20;line++){
            for(int star =1; star<=line ; star++){
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }
    }
}*/

//inverted pattern in java

/*import java.util.Scanner;
public class javaBasics{
    public static void main(String args[]){
        int n=7;
         for( int line =1 ; line<=n; line++ ){
            for(int star=1;star<=n-line+1; star++){
                System.out.print("*");
            } 
             System.out.println();
         }
        
    }
}*/

//print half pyramid
/*public  class JavaBasics{
    public static void main(String args[]){
        int n=5;
        for ( int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

    
*/



//print character pattern

/*public class JavaBasics {
    public static void main(String argd[]){
        int n =4 ;
        char ch = 'A';
        
        //outer loop
        for ( int line =1; line<=n; line++){
            //inner loop
            for (int chars =1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
*/

// FUNCTION / METHODS IN JAVA

/*public class JavaBasics{
    public static void helloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world"); 
        return;
    }
    public static void main (String args[]){
        helloworld();
    }
}*/

import java.util.*;
public class JavaBasics{
    public static void calculatesum(){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is " + sum);
    }
    public static void main (String args[]){
        calculatesum();
    }   
}





















