public class Calculator {
	private Double operandOne;
	private Double operandTwo;
	
	public Calculator(Double operandOne, Double operandTwo) {
		super();
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
	}
	
	public Double getSum() {
		return (this.operandOne + this.operandTwo);
	}
	
	public Double getDifference() {
		return (this.operandOne - this.operandTwo);
	}
	
	public Double getMultiplication() {
		return (this.operandOne * this.operandTwo);
	}

	public Double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public Double getOperand() {
		return operandTwo;
	}

	public void setOperand(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
}
