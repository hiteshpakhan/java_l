// how to take input 
// you have to import Scanner

import java.util.Scanner;

// import javax.xml.transform.Source;

public class App3input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("input your age : ");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("input value in float");
        float age2 = sc.nextFloat();

        // such as you can take many values 
        // but if you want to take the string values you can take as follows
         
        System.out.println("input your name : ");
        String name = sc.next();        
        System.out.println(name);

        // but to take a line of string as an input you have to use the following method

        System.out.println("type a line");
        String b = sc.nextLine();
        System.out.println(b);

        // knfnhdiognsdiolvbnsdfl

    }
}
