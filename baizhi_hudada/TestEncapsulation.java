package day8;
public class TestEncapsulation{
	public static void main(String[] args){
          CreditCard card=new CreditCard();
        //  System.out.println(card.password);
        //  card.password ="654321";
        //  System.out.println(card.password);

         System.out.println( card.getPassword());
          card.setPassword("654321");
         System.out.println( card.getPassword());
	}

}

class CreditCard{
	private String password="123456";
	public String getPassword(){
		// could do someting to protect the access ,such as role 
		return password;
	}
	public void setPassword(String password){
		this.password =password;
	}
}
