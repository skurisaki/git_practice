public class Main{
	public static void main(String[] args){
		String [][] retsu = {{"A","B","C"},{"1","2","3"}};
		
		System.out.print("行を入力してください（1or2）");
		int gyou = new java.util.Scanner(System.in).nextInt();

		System.out.print("列を入力してください（1～3）");
		int retu = new java.util.Scanner(System.in).nextInt();

		System.out.println("あなたの指定した場所にあるものは");
		System.out.println(retsu[gyou][retu] + "です。");
	}
}