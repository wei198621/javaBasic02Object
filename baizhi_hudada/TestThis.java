package day7;
public class TestThis{
	public static void main(String[] args){
            Student s =new Student();
            s.sleep();
	} 
}

class Student{
   String name ;
   int age;
   public void eat(){
          // this.sleep();   等同于下面的sleep 
          sleep();
   }
   public void sleep(){
      System.out.println("sleep");
   }
}

 