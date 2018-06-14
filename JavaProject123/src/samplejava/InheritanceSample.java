 package samplejava;

public class InheritanceSample extends AdditionDemo {
	public void sum(){
		int x=100;
		int y=200;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //AdditionDemo ramu= new AdditionDemo();
      //ramu.sum();
		InheritanceSample ramu=new InheritanceSample();
		ramu.sum();
				   
	}

}
