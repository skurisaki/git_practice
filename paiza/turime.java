import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
    	int x = Integer.parseInt(line);
        for(int i=0;i<x;i++){
            System.out.print("Ann");
        }
    }
}
