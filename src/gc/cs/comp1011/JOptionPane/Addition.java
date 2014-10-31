package gc.cs.comp1011.JOptionPane;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Addition {
	public static void main(String[] args){
		String numberOne, numberTwo;
		int number1, number2, sumNumbers;
		boolean continueFlag = true;
		
		do{
			try{
				numberOne = JOptionPane.showInputDialog("Enter the first integer");
				number1 = Integer.parseInt(numberOne);
				
				try{
					numberTwo = JOptionPane.showInputDialog("Enter the second integer");
					number2 = Integer.parseInt(numberTwo);
					
					//all the input is valid
					sumNumbers = number1 + number2;
					JOptionPane.showMessageDialog(null, String.format("Result of Addition: %d",sumNumbers),"Sum of numbers",JOptionPane.PLAIN_MESSAGE);
					continueFlag = false;
				}
				catch(HeadlessException e){
					System.out.println(e.getMessage());
					System.out.println("Environment does not support a keyboard, display, or mouse");
				}
				catch(NumberFormatException e){
					System.out.println(e.getMessage());
					System.out.println("The number must be an integer");
				}
			}
			catch(HeadlessException e){
				System.out.println(e.getMessage());
				System.out.println("Environment does not support a keyboard, display, or mouse");
			}
			catch(NumberFormatException e){
				System.out.println(e.getMessage());
				System.out.println("The number must be an integer");
			}	
		}while(continueFlag);
		
	}
}
