public class Main{
	public static void main(String[] args){
		System.out.print("�j���Ȃ��0���A�����Ȃ�΂���ȊO�̐�������́F");
		int seibetsu = new java.util.Scanner(System.in).nextInt();

		System.out.print("�N�����́F");
		int age = new java.util.Scanner(System.in).nextInt();

		System.out.println("����ɂ��́B");

		if(seibetsu == 0){
			System.out.println("���͒j�ł��B");
			System.out.println(age + "�΂ł��B");
		} else {
			System.out.println("���͏��ł��B");
		}

		System.out.println("��낵�����肢���܂��B");
	}
}