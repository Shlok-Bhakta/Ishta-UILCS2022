import java.util.Scanner;
import java.io.File;


public class App {
    public static int position = 0;
    public static int comb = 0;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ishita.dat"));
        int loop = scanner.nextInt();

        
        for (int i = 0; i < loop; i++) {
            String line = scanner.next();


            System.out.println(combos(line.toCharArray()));


        }



    }

    public static int combos(char[] paren){
        
        
        while(position < paren.length){
            if (paren[position] == '(') {
                position++;
                if(paren[position] == ')'){
                    comb++;
                    position++;
                    return comb;
                }else{
                    position++;
                    combos(paren);
                }
                
            }
            
        }

        return comb;
    }
    }
