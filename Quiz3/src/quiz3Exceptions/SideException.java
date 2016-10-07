package quiz3Exceptions;

public class SideException extends Exception{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SideException(double side1, double side2, double side3, String Message) {
				super(Message);
				this.side1=side1;
				this.side2=side2;
				this.side3=side3;
				}
	double side1;
	double side2;
	double side3;
}
	