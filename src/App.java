import java.util.Scanner;
import java.io.File;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ishita.dat"));
        int loop = scanner.nextInt();
    loop:for(int zz = 0;zz<loop ;zz++)
		{
			char[] chars = scanner.next().toCharArray();
			int ans = 0;
			int ct = 0;
			for(char ch: chars)
			{
				if(ch == ')')
				{
					ct--;
					if(ct < 0)
					{
						System.out.println(0);
						continue loop;
					}else if(ct == 0)
					{
						ans++;
					}
				}else {
					ct++;
				}
			}
			if(ct != 0)
			{
				System.out.println(0);
				continue loop;
			}
			System.out.println((1 << ans - 1) - 1);
		}
    }

}
