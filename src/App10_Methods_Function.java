// Function  - group of instruction 
// methods   - function inside a class

public class App10_Methods_Function {
    
    public static void function1(){     
        // here there is no return statement inside of this method 
        // so we put the void type otherwise we will be puting the type of the return
        
        System.out.println("this is the first function that is method because its inside of the class");
    }
    
    public static void sample(String name){
        System.out.println(name);
    }

    public static void sum(int i, int j){
        System.out.println("the sum of two no is : " + (i + j) );
    }
    public static void main(String[] args){
        
        // to call this function we have to call this function by following method 
        function1();
        function1();

        sample("hi there"); //this is the parameter

        sum(5, 6);
        
    }

}
