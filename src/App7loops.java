// loops



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




// print the sum of first n natural number
import java.util.*;

public class App7loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        int n = sc.nextInt();

        int sum = 0;
        
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }

        System.out.println(sum);

    }
}