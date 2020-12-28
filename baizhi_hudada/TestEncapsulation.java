package day8;
public class TestEncapsulation{
	public static void main(String[] args){
          CredictCard card=new CredictCard();
        //  System.out.println(card.password);
        //  card.password ="654321";
        //  System.out.println(card.password);

         System.out.println( card.getPassword());
          card.setPassword("654321");
         System.out.println( card.getPassword());
	}

}

class CredictCard{
	private String password="123456";
	public String getPassword(){
		// could do someting to protect the access ,such as role 
		return password;
	}
	public void setPassword(String password){
		this.password =password;
	}
}
