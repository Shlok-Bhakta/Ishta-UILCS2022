import java.util.Scanner;
import java.io.File;


public class App {

    public static int linespaces = 0;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ishita.dat"));
        int loop = scanner.nextInt();

        
        for (int i = 0; i < loop; i++) {
            linespaces = 0;
            String line = scanner.next();

            for (int j = 0; j < line.length(); j++){
                for(int k = 0; k < line.length(); k++){
                    if(line.charAt(k) == '('){ 
                        if(line.charAt(k + 1) == ')'){
                            linespaces++;
                        }else{
                            k++;
                        }
                    }

                }
                
            }
    
            System.out.println(linespaces);



        }



    }
    public static void numspaces(char input, char nextin){
        if(input == '('){
            if(nextin == ')'){ 
                linespaces++;
            }

        }



        
        
    }

    }
