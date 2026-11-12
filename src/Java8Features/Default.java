package Java8Features;
interface Left{
	public void sleep(int time);
	default void wake() {
		System.out.println("At 6");
	}
}
interface Right{
	default void wake() {
		System.out.println("At 4");
	}
}

public class Default implements Left,Right {
	@Override
	public void sleep(int time) {
		Left.super.wake();//from parent

		System.out.println("At 10:"+time);
	}
	@Override
	public void wake() {
		// TODO Auto-generated method stub
		Right.super.wake();
	}
	public static void main(String[] args) {
		Default d=new Default();
		d.sleep(10);
		d.wake();
	
	}

}
