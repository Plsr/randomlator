package randomlator;

public class Randomlate {
	
	private int operator1;
	private int operator2;
	private static int random = randomNumber();
	
	public Randomlate(int a, int b){
		operator1 = a;
		operator2 = b;
	}
	
	private static int randomNumber() {
		double random = Math.random() * 4;
		return (int) random;
	}
	
	private int calculus(){
		int result;
		
		switch (random) {
		case 0:	result = operator1 + operator2;
			break;
			
		case 1:	result = operator1 - operator2;
			break;
			
		case 2: result = operator1 * operator2;
			break;
			
		case 3:	if(operator2 == 0) throw new ArithmeticException("Teilen durch 0 ist verboten"); 
			result = operator1 / operator2;
			break;

		default: result = 0;
			break;
		}
		return result;
	}
	
	public String operation() {
		String operation;
		
		switch (random) {
		case 0:
			operation = "+";
			break;
			
		case 1:
			operation = "-";
			break;
			
		case 2:
			operation = "*";
			break;
			
		case 3:
			operation = "/";
			break;

		default:
			operation = "?";
			break;
		}
		
		return operation;
	}
	
	public String calculate(){
		return operator1 + operation() + operator2 + "=" + calculus();
	}
	
}

