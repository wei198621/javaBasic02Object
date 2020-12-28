package day8;
public class TestInheritance2{
	public static void main(String[] args){
         //Animal2
          Dog2 ani= new Dog2();
         //ani.eat();
         ani.sleep();
	}
}

class Animal2{
	 int age;
	 char gender;
	 public void eat(){
	 	System.out.println("eating by Animal2 ");
	 }
	 private void sleep(){
	 	System.out.println("sleeping by animal2 ! ");
	 }
}

class Dog2 extends Animal2{
	//int age;
	//char gender;
	@Override
	public void eat(){
	 	System.out.println("eating by Dog2 ");
	}

	public int sleep(){
		System.out.println("sleeping by Dog2");
		return 1;
	}
	public void shout(){

	}
}