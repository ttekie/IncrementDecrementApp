
import javax.swing.JFrame;

public class IncrementDecrementTester
{

	public static void main (String[] args)
	{

			// create a frame and add a pane to
			// it and make it visible
		JFrame frame = new JFrame("Increment / Decrement");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new IncrementDecrementPanel());
		frame.pack();
		frame.setVisible(true);
		
	} // end method main
	
} // end class IncrementDecrementTester