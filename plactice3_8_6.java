public class Main{
	public static void main(String[] args){
		System.out.println("【数あてゲーム】");

		int ans = new java.util.Random().nextInt(10);

		for(int i = 0; i < 5; i++){
			System.out.print("0〜9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			
			if(ans == num){
				System.out.print("アタリ！");
				break;
			} else {
				System.out.print("ハズレです。");
			}
		}
	System.out.println("ゲームを終了します。");
	}
}