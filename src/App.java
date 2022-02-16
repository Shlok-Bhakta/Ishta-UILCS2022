import java.util.Scanner;
import java.io.File;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ishita.dat"));
        int loop = scanner.nextInt();

        
        for (int i = 0; i < loop; i++) {
            String line = scanner.next();

            int leftP = 0;
            int rightP = 0;

            for(int cursor = 0; cursor < line.length(); cursor++) {
                
                if(line.toCharArray()[cursor] == '(') {
                leftP++;   
                }
                if(line.toCharArray()[cursor] == ')'){
                leftP--;
                    rightP++;
                }


            }
            if(leftP == rightP){
                System.out.println(--leftP);
                
            }else{
                System.out.println(0);
            }



        }



    }

    public static int combos(char[] paren){
        int com = 0;
        
        for(int t = 0; t < paren.length; t++){
            if (paren[t] == '(') {
                
                if(paren[t] == ')'){

                }else{
                    combos(paren);
                }
                
            }else{
                com = 0;
            }

        }

        
        return com;


    }
    }
