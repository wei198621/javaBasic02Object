package day8;
public class TestInheritance2{
	public static void main(String[] args){
         Animal2 ani= new Dog2();
         ani.eat();
	}
}

class Animal2{
	 int age;
	 char gender;
	 public void eat(){
	 	System.out.println("eating by Animal2 ");
	 }
	 public void sleep(){
	 }
}

class Dog2 extends Animal2{
	//int age;
	//char gender;
	@Override
	public void eat(){
	 	System.out.println("eating by Dog2 ");
	}
	//public void sleep(){
	//}
	public void shout(){

	}
}