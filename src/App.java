// index
    // simple syntax
    // data types
    // string methods
    // premetive vs non primivative 
    // array 
    // casting
    // constant






// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }


// public class App{
//     public static void main(String[] args){
//         // System.out.println("hello");
//         // //afer println the curser goes to the net line and if you print it will not goes to the next line
//         // String name = "hitesh";
//         // int age = 30;
//         // long phone = 123456789L;
//         // float pi = 3.14F;
//         // // char = "a";

//         // System.out.println(name.length() + age);


//         // concatination
//         String name1 = "hitesh";
//         String name2 = "pakhan";
//         String fullname = name1 + " " + name2;
//         System.out.println(fullname); 

//     }
// }



// public class App{
//     public static void main(String[] args){

//         String text = "finding the character position number";
//         System.out.println(text.charAt(5));

//         System.out.println(text.length());//it will show the length of the string

//         String text2 = text.replace("n", "************");
//         System.out.println(text2);

//         System.out.println(text.substring(0,11));

//     }
// }



//imp premetive vs non primivative  
// non-primitive types are Strings, Arrays, Classes, Interface, etc





// Array
// import java.util.Arrays;

// public class App{
//     public static void main(String[] args){
        

//         // to declare an array 
//         int [] marks = new int [3];
        
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;

//         System.out.println(marks);  //it will give you an memory location [I@4617c264
//         System.out.println(marks[2]);

//         System.out.println(marks.length); //it will give the output


//         // now we are using library Arrays
//         System.out.println("original marks = "+marks[0]+" "+marks[1]+" "+marks[2]);
//         //sort
//         Arrays.sort(marks);
//         System.out.println("new marks = "+marks[0]+" "+marks[1]+" "+marks[2]);

//         // you can also declare array by following type
//         int[] students = {2,45,56,6,6,45,3,4342,667,3};

//         // 2d arrays
//         int [][] result = {{3,6,5},{34,6,704,3,8}};

//         //you can access the 2d array by following method
//         System.out.println(result[1][2]);

//     }
// }




// casting
// public class App{
//     public static void main(String[] args){
//         int a = 100;
//         // int b = a + 18.0;   //it will give an error because int with double 

//         int b = a + (int)18.0;  //it will convert it into the integer number even it is the 18.99 it will become 18
//         System.out.println(b);
//     }
// }



// constants
// public class App{
//     public static void main(String[] args){
//         int a = 1;
//         a = 2; //here as you can see you can change the values of variables again

//         // but if you want the values of a variable to never change you can use the final variable
//         // final
        
//         final int B = 23; //its a prictice of java coders to give the variable name of the 
//         // B = 3;       //you can never change the values of the constant

//     }
// }



// operators

// + - * / %            // % this sign is modulo
// = ==
// unery operators : ++ -- 


// public class App{
//     public static void main(String[] args){
//         int a = 3;
//         int b = 2;
//         double c = a / b;
//         System.out.println(c);

//         int d = ++b;
//         System.out.println(d);
//         int e = b++;
//         System.out.println(e);
//     }
// }



