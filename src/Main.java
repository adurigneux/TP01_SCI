import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Billes");
		frame.setSize(1000, 1000);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int borderWidth = 1;
		int rows = 300;
		int cols = 300;
		JPanel panel = new JPanel(new GridLayout(rows, cols));
		panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				final JLabel label = new JLabel("");
				if (row == 0) {
					if (col == 0) {
						// Top left corner, draw all sides
						label.setBorder(BorderFactory
								.createLineBorder(Color.BLACK));
					} else {
						// Top edge, draw all sides except left edge
						label.setBorder(BorderFactory.createMatteBorder(
								borderWidth, 0, borderWidth, borderWidth,
								Color.BLACK));
					}
				} else {
					if (col == 0) {
						// Left-hand edge, draw all sides except top
						label.setBorder(BorderFactory.createMatteBorder(0,
								borderWidth, borderWidth, borderWidth,
								Color.BLACK));
					} else {
						// Neither top edge nor left edge, skip both top and
						// left lines
						label.setBorder(BorderFactory.createMatteBorder(0, 0,
								borderWidth, borderWidth, Color.BLACK));
					}
				}
				panel.add(label);
			}
		}

		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
