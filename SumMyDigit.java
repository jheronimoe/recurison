
import javax.swing.JOptionPane;
/*
 * @author Jherome Hernandez - 660252520
 */


public class SumMyDigit 
{
	// RECURSION METHOD
	static int sumMyDigit(int n)
	{ 
		if (n == 0)
			return 0;
		return (n % 10 + sumMyDigit(n / 10));
	}
	public static void main(String[] args) 
	{

		
		//TRYING TO DO A JOPTION PANE INPUT DIALOG TO GRAB USER INPUT
//		String firstNumber;     
//		String secondNumber; 
//		String thirdNumber; 
//		String forthNumber; 
//		String fifthNumber; 
//	
//		int number1;
//		int number2;
//		int number3;
//		int number4;
//		int number5;
//		int sum;
		
//		firstNumber = JOptionPane.showInputDialog("Enter first integer:");
//		secondNumber = JOptionPane.showInputDialog("Enter second integer:");
//		thirdNumber = JOptionPane.showInputDialog("Enter third integer:");
//		forthNumber = JOptionPane.showInputDialog("Enter forth integer:");
//		fifthNumber = JOptionPane.showInputDialog("Enter fifth integer:");
		
//		number1 = Integer.parseInt(firstNumber);
//		number2 = Integer.parseInt(secondNumber);
//		number3 = Integer.parseInt(thirdNumber);
//		number4 = Integer.parseInt(forthNumber);
//		number5 = Integer.parseInt(fifthNumber);
		
//		sum = number1 + number2 + number3 + number4 + number5;
		
		int num = 451;
		int result = sumMyDigit(num);
		JOptionPane.showMessageDialog(null, "Sum of digits in " + 
						num + " is " + result);
	}

}
