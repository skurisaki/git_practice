import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // �����̓��ӂȌ����
        // Let's �`�������W�I�I
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int x = Integer.parseInt(line);
        
        for(int i=x;i>0;i--){
            System.out.println(i);
        }
        System.out.println("0!!");
    }
}