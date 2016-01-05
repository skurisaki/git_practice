import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int a = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int x = Integer.parseInt(line);
        
        for(int i=1;i<=x;i++){
            a = a*i;
        }
        System.out.println(a);
    }
}