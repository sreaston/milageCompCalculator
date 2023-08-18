package milageCompCalculator;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class Main extends JFrame implements ActionListener {
	
	private JTextField carMPGField;
	private JTextField gasPriceField;
	private JTextField distanceField;
	private JTextField compensationRateField;
	private JLabel gallonsUsedLabel;
	private JLabel tripCostGrossLabel;
	private JLabel compensationLabel;
	private JLabel profitLabel;
	
	private JButton button;
	
	public Main() {
		setTitle("Milage Pay Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1)); // 0 rows, 1 column

        // Create the first TextField
        carMPGField = new JTextField(20);
        add(new JLabel("Car MPG:"));
        add(carMPGField);

        // Create the second TextField
        gasPriceField = new JTextField(20);
        add(new JLabel("Gas price:"));
        add(gasPriceField);

        distanceField = new JTextField(20);
        add(new JLabel("Miles driven:"));
        add(distanceField);

        compensationRateField = new JTextField(20);
        add(new JLabel("Pay per mile:"));
        add(compensationRateField);
        
        // Create the Button
        button = new JButton("Submit");
        button.addActionListener(this);
        add(button);
	
        gallonsUsedLabel = new JLabel("Gallons used: ");
        add(gallonsUsedLabel);

        tripCostGrossLabel = new JLabel("Cost to drive: ");
        add(tripCostGrossLabel);

        compensationLabel = new JLabel("Gross compensation: ");
        add(compensationLabel);

        profitLabel = new JLabel("Profit: ");
        add(profitLabel);

	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == button) {
	//this method pulls the value of variables from the text input boxes and declares others for use in computing the profit.		 
			 	double compensation;
			 	double gallonsUsed;
			 	double tripCostGross;
			 	double profit;
	            double carMPG = Double.parseDouble(carMPGField.getText());
	            double gasPrice = Double.parseDouble(gasPriceField.getText());
	            double distance = Double.parseDouble(distanceField.getText());
	            double compensationRate = Double.parseDouble(compensationRateField.getText());
	            
	            gallonsUsed = (distance / carMPG);
				tripCostGross = (gallonsUsed * gasPrice);
				compensation = (compensationRate * distance);
				profit = (compensation - tripCostGross);
				//for testing purposes to make sure it works
		        gallonsUsedLabel.setText("Gallons used: " + gallonsUsed);
		        tripCostGrossLabel.setText("Cost to drive: " + tripCostGross);
		        compensationLabel.setText("Gross compensation: " + compensation);
		        profitLabel.setText("Profit: " + profit);
		 }
		 
	    
	
	}
		
	public static void main(String args[]) { 	 
		 SwingUtilities.invokeLater(() -> {
	            Main example = new Main();
	            example.setVisible(true);
	        });
		
	
		
		
		
	
}

}
