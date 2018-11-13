package ah;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class BitwiseOperación {
	// Create variables
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField filePath = new JTextField(40);
	static JTextField value1 = new JTextField(24);
	static JTextField value2 = new JTextField(24);
	static JButton xor = new JButton("^");
	static JButton or = new JButton("|");
	static JButton and = new JButton("&");
	static JButton shiftY = new JButton("<<");
	static JButton Shifty = new JButton(">>");

	// Create GUI method
	public static void create() {
		try {
			System.out.println("Creating stuff");
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("file.txt", true)) ;
			// Add stuff to panel
			panel.add(filePath);
			panel.add(value1);
			panel.add(value2);
			panel.add(xor);
			panel.add(or);
			panel.add(and);
			panel.add(shiftY);
			panel.add(Shifty);
			// Add ActionListeners
			xor.addActionListener((e) -> {
				try {
					fileWriter.write(new Integer(convertNumeros(value1.getText(), value2.getText(), "xor")).toString());
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			or.addActionListener((e) -> {
				try {
					fileWriter.write(new Integer(convertNumeros(value1.getText(), value2.getText(), "or")).toString());
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			and.addActionListener((e) -> {
				try {
					fileWriter.write(new Integer(convertNumeros(value1.getText(), value2.getText(), "and")).toString());
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			shiftY.addActionListener((e) -> {
				try {
					fileWriter.write(new Integer(convertNumeros(value1.getText(), value2.getText(), "<<")).toString());
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			Shifty.addActionListener((e) -> {
				try {
					fileWriter.write(new Integer(convertNumeros(value1.getText(), value2.getText(), ">>")).toString());
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			// Add panel to frame, pack
			frame.add(panel);
			frame.setVisible(true);
			frame.pack();
			System.out.println("Done building the window");
		} catch (Exception e) {
			System.out.println("end me");
		}
	}

	// Conversion method
	public static int convertNumeros(String v1, String v2, String typeChange) {
		System.out.println("Converting");
		int firstNumber = Integer.parseInt(v1);
		int secondNumber = Integer.parseInt(v2);
		if (typeChange.equals("xor")) {			
			System.out.println(firstNumber ^ secondNumber);

			return firstNumber ^ secondNumber;
		} else if (typeChange.equals("or")) {
			System.out.println(firstNumber | secondNumber);

			return firstNumber | secondNumber;
		} else if (typeChange.equals("and")) {
			System.out.println(firstNumber & secondNumber);
			return firstNumber & secondNumber;
		} else if (typeChange.equals("<<")) {
			System.out.println(firstNumber << secondNumber);

			return firstNumber << secondNumber;
		} else {
			System.out.println(firstNumber >> secondNumber);

			return firstNumber >> secondNumber;
		}
	}

	// Main method
	public static void main(String[] pleasePassMe) {
		System.out.println("Beginning...");
		create();
	}
}
