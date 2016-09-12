package interfaceExamples;

public class Becomefather implements Father{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Becomefather f = new Becomefather();
		f.dogiveMoney();
		Father g = new Becomefather();
	}

	@Override
	public void doCare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dogiveMoney() {
		// TODO Auto-generated method stub
		System.out.println("Give money");
	}

}
