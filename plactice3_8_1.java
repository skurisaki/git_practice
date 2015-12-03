public class Main{
  public static void main(String[] args){
    int weight = 60;
    int age1 = 20;
    int age2 = 10;
    int age = age1 + age2;
    String name = "–©";

    if(weight == 60){
	System.out.println("1 true");
    }

    if(age * 2 >= 60){
	System.out.println("2 true");
    }

    if(age % 2 == 0){
	System.out.println("3 true");
    }

    if(name.equals("–©")){
	System.out.println("4 true");
    }
  }
}