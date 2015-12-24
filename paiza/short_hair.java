import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int x = Integer.parseInt(line);
        String line2 = br.readLine();
        int y = Integer.parseInt(line2);
        int z;
        z = x + y;
        System.out.println(z);
    }
}
