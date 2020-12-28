package day8;
public class TestSuper{
	public static void main(String[] args){
         //ClassB clsb=new ClassB();
         //clsb.method();
		new B();
		System.out.println("----------");
		new B(22,33);
	}
}

class ClassA{
	int m=10;
	public void method(){
		System.out.println("method by ClassA ");
	}
}

class ClassB extends ClassA{
	int m=20;
	public void method(){
		super.method();  //  子类 调用父类中被覆盖的方法 
		System.out.println("method by ClassB ");
	}

	public void print(){
		System.out.println(this.m);  //20   
		System.out.println(super.m);  //10    子类 调用父类 被覆盖的属性  
	}
}


class A {
	public A(){
		System.out.println("A()");
	}
	public A(String s){
		System.out.println("A(String)");
	}

}

class B extends A {
	// type1  
    public B(){
    	super(); // super 用在构造方法中，表示构造父类对象  // 利用父类的无参构造方法创建父类对象  
    	System.out.println("B()");
    }
    // type2 
    public B(int a){
    	this();       // this() ; 表示 public B() .... ,所以明面上构造方法首行是this,实际构造方法首行还是super(); 
		System.out.println("B(int)");
    }

    //type3  the method 2 is same 
    public B(int a,int b){    	
        System.out.println("B(int,int)");    	//构造方法首行，不是this ，也不是 super ,编译器自动给该狗脏方法添加一个super(); 
    }
    /*public B(int a,int b){
    	super();
        System.out.println("hehe");    	
    }*/

}

//父类标准写法    无参构造函数虽然系统自动提供，但是最好手动写
class Super{
	public Super(){}  
}
//子类标准写法  子类 无参构造函数 使用super调用父类无参构造函数 ；   
class Sub extends Super{
	public Sub(){
		super();
	}
}

// 程序员自己的写法 
class MyClass{
	int a=10;
	int b;
	String s="abc";
	public MyClass(){
		System.out.println("hehe");
	}
}
//  编译器的执行顺序  
class MyClassAfterCompile{
	int a;
	int b;
	String s;
	public MyClassAfterCompile(){
		super();
		a=10;
		s="abc"
		System.out.println("hehe");
	}
}

/*
对象创建过程
    0）分配堆空间   对象所需空间一次性分配好   ，属性赋值默认值 
    1) 创建父类对象              super();
    2）初始化属性                a=10;
    3）执行构造方法的剩余语句     System.out.println("hehe");

*/