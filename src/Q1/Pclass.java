package Q1;

public class Pclass {
	public void pmethod(){
		System.out.println("This is Parent class");
	  }
	}
     class Cclass extends Pclass {
    	public void cmethod(){
    	System.out.println("This is child class");
    	 }
    
	public static void main(String[] args) {
		Pclass m = new Pclass();
		Cclass n = new Cclass();
		m.pmethod();
		n.cmethod();
		n.pmethod();

	}

}
