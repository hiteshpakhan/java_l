// to name the function we use the method of camel case to name the function name 

import java.util.*;

public class App11_function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("print your name : ");
        String name = sc.next();

        printMyName(name);
    }
}
