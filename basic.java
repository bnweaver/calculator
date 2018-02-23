package Calculator;

public abstract class basic {

	public static double newpercent;
	public static String snewpercent;
	
	public static int function = 0;
	public static int index = 0;
	
	static double one;
	static double two;
	static double equal;
	
	public static void percent() {
		String y = calcFrame.screen.getText();
		Double x = Double.parseDouble(y);
		x = x/100;
		y = Double.toString(x);
		calcFrame.screen.setText(y);
	}
	
	public static void divide() {
		function = 1;
		one = Double.parseDouble(calcFrame.screen.getText());	
		calcFrame.dec = false;
	}
	
	public static void multiply() {
		function = 2;
		one = Double.parseDouble(calcFrame.screen.getText());
		calcFrame.dec = false;
	}
	
	public static void subtract() {
		function = 3;
		one = Double.parseDouble(calcFrame.screen.getText());
		calcFrame.dec = false;
	}
	
	public static void add() {
		function = 4;
		one = Double.parseDouble(calcFrame.screen.getText());
		calcFrame.dec = false;
	}
	
	public static void equal() {
		if (function == 1) {
			two = Double.parseDouble(calcFrame.screen.getText());
			equal = one / two;
			calcFrame.screen.setText(Double.toString(equal));
		}
		if (function == 2) {
			two = Double.parseDouble(calcFrame.screen.getText());
			equal = one*two;
			calcFrame.screen.setText(Double.toString(equal));
		}
		if (function == 3) {
			two = Double.parseDouble(calcFrame.screen.getText());
			equal = one - two;
			calcFrame.screen.setText(Double.toString(equal));
		}
		if (function == 4) {
			two = Double.parseDouble(calcFrame.screen.getText());
			equal = one + two;
			calcFrame.screen.setText(Double.toString(equal));
		}
		calcFrame.dec = false;
	}
}
