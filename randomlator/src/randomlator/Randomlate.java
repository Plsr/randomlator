package randomlator;

public class Randomlate {
	
	private int operator1;
	private int operator2;
	private int random;
	
	public Randomlate(int a, int b){
		operator1 = a;
		operator2 = b;
		randomNumber();
	}
	
	/**
	 * Generates a random Integer between 0 and 3.
	 * @return	random Integer
	 */
	private void randomNumber() {
		double randDouble = Math.random() * 4;
		int rand = (int) randDouble;
		random = rand;
		divideZeroTest();
		
	}
	
	/**
	 * Tests if there could be a division by 0. If so, 
	 * runs <tt>randomNumber</tt> again.
	 */
	private void divideZeroTest() {
		if(random == 3 && operator2 == 0){
			randomNumber();
		}
	}
	
	/**
	 * Performs an Arithmetic operation based on <tt>random</tt>.
	 * @return result of the operation
	 */
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
	
	/**
	 * Recognizes which operation was executed by random.
	 * @return string with the operation
	 */
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
	
	/**
	 * Prints out the result.
	 * @return string of the two operands, the operation and the result
	 */
	public String calculate(){
		return operator1 + operation() + operator2 + "=" + calculus();
	}
	
}

