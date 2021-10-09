import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;

public class displayShape extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayShape frame = new displayShape();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public displayShape() {
		setTitle("Display Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel buttonPanel = new JPanel();
		
		JPanel mainPanel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(mainPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttonPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
		);
		
		JPanel shapeDisplay1 = new JPanel();
		shapeDisplay1.setBorder(null);
	
		JPanel shapeDisplay2 = new JPanel();
		shapeDisplay2.setBorder(null);
		
		
		
		JPanel shapeDisplay3 = new JPanel();
		
		JPanel shapeDisplay4 = new JPanel();
		
		JPanel shapeDisplay5 = new JPanel();
		
		JPanel shapeDisplay6 = new JPanel();
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(shapeDisplay1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(shapeDisplay2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(shapeDisplay3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(shapeDisplay4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(shapeDisplay5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(shapeDisplay6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(188, Short.MAX_VALUE))
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(shapeDisplay1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(shapeDisplay3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(shapeDisplay5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addGap(41)
							.addComponent(shapeDisplay2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(shapeDisplay4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(21, Short.MAX_VALUE))
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addContainerGap(201, Short.MAX_VALUE)
					.addComponent(shapeDisplay6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
		);
		shapeDisplay6.setLayout(new CardLayout(0, 0));
		shapeDisplay5.setLayout(new CardLayout(0, 0));
		shapeDisplay4.setLayout(new CardLayout(0, 0));
		shapeDisplay3.setLayout(new CardLayout(0, 0));
		shapeDisplay2.setLayout(new CardLayout(0, 0));
		shapeDisplay1.setLayout(new CardLayout(0, 0));
		mainPanel.setLayout(gl_mainPanel);
		
		
		
		Shape shapePanel[];
		shapePanel = new Shape[6];
		JButton btnNewButton = new JButton("Load Shapes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShapeFactory randomShape = new ShapeFactory();
				
				
				for (int i = 0; i < 6; i++) {
					shapePanel[i] = randomShape.getShape(); 
					shapePanel[i].draw();
				}
				
				shapeDisplay1.removeAll();
				shapeDisplay2.removeAll();
				shapeDisplay3.removeAll();
				shapeDisplay4.removeAll();
				shapeDisplay5.removeAll();
				shapeDisplay6.removeAll();
				shapeDisplay1.add(shapePanel[0]);
				shapeDisplay2.add(shapePanel[1]);
				shapeDisplay3.add(shapePanel[2]);
				shapeDisplay4.add(shapePanel[3]);
				shapeDisplay5.add(shapePanel[4]);
				shapeDisplay6.add(shapePanel[5]);
				shapeDisplay1.validate();
				shapeDisplay1.repaint();
				shapeDisplay2.validate();
				shapeDisplay2.repaint();
				shapeDisplay3.validate();
				shapeDisplay3.repaint();
				shapeDisplay4.validate();
				shapeDisplay4.repaint();
				shapeDisplay5.validate();
				shapeDisplay5.repaint();
				shapeDisplay6.validate();
				shapeDisplay6.repaint();
			}
		});
		buttonPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sort Shapes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortingTechnique sort = new SortingTechnique(shapePanel);
				shapeDisplay1.removeAll();
				shapeDisplay2.removeAll();
				shapeDisplay3.removeAll();
				shapeDisplay4.removeAll();
				shapeDisplay5.removeAll();
				shapeDisplay6.removeAll();
				shapeDisplay1.add(shapePanel[0]);
				shapeDisplay2.add(shapePanel[1]);
				shapeDisplay3.add(shapePanel[2]);
				shapeDisplay4.add(shapePanel[3]);
				shapeDisplay5.add(shapePanel[4]);
				shapeDisplay6.add(shapePanel[5]);
				shapeDisplay1.validate();
				shapeDisplay1.repaint();
				shapeDisplay2.validate();
				shapeDisplay2.repaint();
				shapeDisplay3.validate();
				shapeDisplay3.repaint();
				shapeDisplay4.validate();
				shapeDisplay4.repaint();
				shapeDisplay5.validate();
				shapeDisplay5.repaint();
				shapeDisplay6.validate();
				shapeDisplay6.repaint();
				
			}
		});
		buttonPanel.add(btnNewButton_1);
		contentPane.setLayout(gl_contentPane);
	}
}
