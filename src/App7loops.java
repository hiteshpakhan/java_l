// loops
// nested loops -(loops inside teh loops)



// public class App7loops {
//     public static void main(String[] args){
        
//         // for loop 
//         for(int i = 1; i <= 5; i = i + 1){              //the variable that are define inside the for loop will not affect outside the loop
//             System.out.println("*");
//         }

//         for(int j = 5; j >= 1; j = j - 1){
//             System.out.println(j);
//         }

//         // while loop
//         int i = 100;

//         while(i >= 90){
//             System.out.println(i--);
//         }

//         // do while loop 
//         int j = 10;

//         do{
//             System.out.println(j);
//             j = j - 1;            
//         }while(j >= 1);        

//     }
// }




// // Question : print the sum of first n natural number
// import java.util.*;

// public class App7loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("enter the number : ");
//         int n = sc.nextInt();

//         int sum = 0;
        
//         for(int i = 1; i<=n; i++){
//             sum = sum + i;
//         }

//         System.out.println(sum);

//     }
// }
// // output 
// // enter the number : 5
// // 15





// // Question : print the table of a number input by the user
// import java.util.*;
// public class App7loops{
//     public static void main(String[] args){
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         for(int i = 1; i <= 10; i++){
//             System.out.println(n * i);
//         }
//     }
// }
// // output 
// // Enter the number : 7
// // 7
// // 14
// // 21
// // 28
// // 35
// // 42
// // 49
// // 56
// // 63
// // 70





// // make the star pattern
// import java.util.*;
// public class App7loops{
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;

//         for(int i = 1; i<=n; i++){
            
//             // inner loop
//             for(int j = 1; j <= m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
        
//         }


//     }
// }
// // output
// // *****
// // *****
// // *****
// // *****



import java.util.*;

public class App7loops{
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        for(int i=1; i <= n; i++){
            for(int j=1; j <= m; j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}