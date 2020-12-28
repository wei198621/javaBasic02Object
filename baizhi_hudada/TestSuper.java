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
		super.method();  //  
		System.out.println("method by ClassB ");
	}

	public void print(){
		System.out.println(this.m);  //20   
		System.out.println(super.m);  //10   
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
    	super(); // 
    	System.out.println("B()");
    }
    // type2 
    public B(int a){
    	this();
		System.out.println("B(int)");
    }

    //type3  the method 2 is same 
    public B(int a,int b){
    	//super("acbc");
        System.out.println("B(int,int)");    	
    }
    /*public B(int a,int b){
    	super();
        System.out.println("hehe");    	
    }*/

}


class Super{
	public Super(){}
	public Super(int a){}
}
class Sub extends Super{
	/*public Sub(){
		super();
	}*/
}
