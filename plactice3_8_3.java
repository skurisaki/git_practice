public class Main{
	public static void main(String[] args){
		System.out.print("男性ならば0を、女性ならばそれ以外の数字を入力：");
		int seibetsu = new java.util.Scanner(System.in).nextInt();

		System.out.print("年齢を入力：");
		int age = new java.util.Scanner(System.in).nextInt();

		System.out.println("こんにちは。");

		if(seibetsu == 0){
			System.out.println("私は男です。");
			System.out.println(age + "歳です。");
		} else {
			System.out.println("私は女です。");
		}

		System.out.println("よろしくお願いします。");
	}
}