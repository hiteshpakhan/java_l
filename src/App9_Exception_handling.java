// Exception handling 


public class App9_Exception_handling {
    public static void main(String[] args){
        // we can catch exception and run the code
        int[] marks = {97, 98, 95};
        
        try {
            System.out.println(marks[5]);   // it will give an error

        }catch(Exception exception){    // this step will execute after the exception apper

        }
        System.out.println("after part");
    }
}
