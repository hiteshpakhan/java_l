public class App8_break_continue {
    public static void main(String[] args){

        
        
        int i = 0;
        
        while(true){
        
            if(i == 3){  // this statement is to skip the number 3
                i = i + 1;
                continue;
            }

            System.out.println(i);
            
            i = i + 1;
            
            if(i > 5){  // this statement is for to break this whole program
                break;
            }

        }




    }
}
