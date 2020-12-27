package day6;
public class TestClass{
	public static void main(String[] args){
         Student s =new Student();
         System.out.println(s.name);
         System.out.println(s.age);
         System.out.println(s.score);
          s.eat();    
	}
}

class Student{
	String name;
	int age;
	double score;
	public Student(){}
	public Student(String name){
		this.name=name;
	}

	void eat(){
		System.out.println("eating ....");
	}
	void sleep(){
		System.out.println("sleeping ... ");
	}
}