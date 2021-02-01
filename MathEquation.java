package Maths;

public class MathEquation {
	private double leftVal, rightVal, result;
	char opCode;
	
	public MathEquation() {}
	 
	public MathEquation(char opCode) {
		this.opCode = opCode;
	}
	public MathEquation(double leftVal, double rightVal, char opCode) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	public double getleftVal() {
		 return this.leftVal;
	 }
	
	public void setleftVal(double leftVal) {
		 this.leftVal = leftVal;
	 }
	
	public double getRightVal() {
		 return this.rightVal;
	 }
	
	public void setRightVal(double rightVal) {
		 this.rightVal = rightVal;
	 }
	
	public void setOpCode(char opCode) {
		 this.opCode = opCode;
	 }
	
	public double getResult() {
		 return this.result;
	 }
	
	void execute() {
		switch (opCode) {
		case 'a':
			result= leftVal + rightVal;
			break;
		case 's':
			result= leftVal - rightVal;
			break;
		case 'd':
			result= rightVal != 0 ? leftVal / rightVal : 0.0d ;
			break;
		case 'm':
			result= leftVal * rightVal;
			break;	
		default:
			System.out.println("Invalid opCode: "+ opCode);
			result = 0.0d;
			break;
		}
	}
	
}
