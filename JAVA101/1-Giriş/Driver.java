import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Driver {
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JTextField textField = new JTextField(20);
		panel.add(textField);
		JButton button = new JButton();
		button.setText("Print Text");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println(textField.getText());
			}
		});
		panel.add(button);
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
}