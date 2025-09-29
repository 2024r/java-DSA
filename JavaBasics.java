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
