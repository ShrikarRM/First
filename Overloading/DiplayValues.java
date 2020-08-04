
public class DiplayValues {
	DiplayValues(){
		System.out.println("zero param constructor");
	}
	
	
	void Diplay(String strValue){
		System.out.println("the recieve String value id :"+strValue);
	}
	

	void Diplay(String strValue, char charValue){
		System.out.println("the recieve String value id :"+strValue);
		System.out.println("the recieve char value id :"+charValue);
	}
	
	void Diplay(int intValue, char charValue){
		System.out.println("the recieve int value id :"+intValue);
		System.out.println("the recieve char value id :"+charValue);
	}
	
	//string dixplaying (string StrValue){} // same sigatue but diff return type is not allowed
	public static void main(String[] args) {
		DiplayValues disp = new DiplayValues();
		//C.T.Polymorphism
		disp.Diplay("Hello World");
		disp.Diplay("Hello",'k');
		disp.Diplay(2,'k');
		
		
	}

}
