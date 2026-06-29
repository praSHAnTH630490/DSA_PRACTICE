package interfaces;
interface Run1{
	int bolls = 23;
	int wikkets = 34;
    default void total() {
    	System.out.println("Interface Run1");
		System.out.println(bolls * wikkets);
	}
}
interface Run2{
	int bolls = 34;
	int wikkets = 78;
	
	static void total() {
		System.out.println("Interface Run2");
		System.out.println(bolls * wikkets);
	}
}
public class Demo implements Run1 , Run2{
	@Override
 public void total() {
	 Run1.super.total();
 }
	public static void main(String[] args) {
		Demo d = new Demo();
                 d.total();
                 
	}

}
