public class MainApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator(3.0, 2.0);
		
		System.out.println("Sum of the operands: " + calc.getSum());
		System.out.println("Differernce of the operands: " + calc.getDifference());
		System.out.println("Multiplication of the operands: " + calc.getMultiplication());
	}
}
