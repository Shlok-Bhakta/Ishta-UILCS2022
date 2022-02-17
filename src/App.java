import java.util.Scanner;
import java.io.File;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ishita.dat"));
        int loop = scanner.nextInt();
    loop:for(int zz = 0;zz<loop ;zz++)
		{
			char[] chars = scanner.next().toCharArray();
			int output= 0;
			int cursorPos = 0;
			for(char ch: chars)
			{
				if(ch == ')')
				{
					cursorPos--;
					if(cursorPos < 0)
					{
						System.out.println(0);
						continue loop;
					}else if(cursorPos == 0)
					{
						output++;
					}
				}else {
					cursorPos++;
				}
			}
			if(cursorPos != 0)
			{
				System.out.println(0);
				continue loop;
			}
			System.out.println((1 << output- 1) - 1);
		}
    }

}
