public class Main{
	public static void main(String[] args){
		System.out.println("�y�����ăQ�[���z");

		int ans = new java.util.Random().nextInt(10);

		for(int i = 0; i < 5; i++){
			System.out.print("0�`9�̐�������͂��Ă�������");
			int num = new java.util.Scanner(System.in).nextInt();
			
			if(ans == num){
				System.out.print("�A�^���I");
				break;
			} else {
				System.out.print("�n�Y���ł��B");
			}
		}
	System.out.println("�Q�[�����I�����܂��B");
	}
}