package gestion.parc.auto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.getContentPane().setBackground(new Color(0, 100, 0));
	    frame.getContentPane().setForeground(new Color(0, 255, 0));
	    frame.setBackground(Color.DARK_GRAY);
	    frame.setBounds(100, 50, 600, 500);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(new BorderLayout(0, 0));

	    JLabel lblNewLabel = new JLabel("Gestion Parc Auto");
	    lblNewLabel.setForeground(new Color(230, 230, 250));
	    lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 24));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);

	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(50, 205, 50));
	    frame.getContentPane().add(panel, BorderLayout.CENTER);
	    GridBagLayout gbl_panel = new GridBagLayout();
	    gbl_panel.columnWidths = new int[]{0, 0, 0};
	    gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
	    gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
	    gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
	    panel.setLayout(gbl_panel);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(50, 205, 50));
	    GridBagConstraints gbc_panel_2 = new GridBagConstraints();
	    gbc_panel_2.insets = new Insets(0, 0, 5, 5);
	    gbc_panel_2.fill = GridBagConstraints.BOTH;
	    gbc_panel_2.gridx = 0;
	    gbc_panel_2.gridy = 0;
	    panel.add(panel_2, gbc_panel_2);
	    
	    JButton btnNewButton = new JButton("Carnets");
	    btnNewButton.setPreferredSize(new Dimension(120,70));
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	}
	    });
	    panel_2.add(btnNewButton);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(50, 205, 50));
	    GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	    gbc_panel_1.insets = new Insets(0, 0, 5, 0);
	    gbc_panel_1.fill = GridBagConstraints.BOTH;
	    gbc_panel_1.gridx = 1;
	    gbc_panel_1.gridy = 0;
	    panel.add(panel_1, gbc_panel_1);
	    
	    JButton btnNewButton_1 = new JButton("Souches");
	    btnNewButton_1.setPreferredSize(new Dimension(120,70));
	    panel_1.add(btnNewButton_1);
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(new Color(50, 205, 50));
	    GridBagConstraints gbc_panel_4 = new GridBagConstraints();
	    gbc_panel_4.insets = new Insets(0, 0, 5, 5);
	    gbc_panel_4.fill = GridBagConstraints.BOTH;
	    gbc_panel_4.gridx = 0;
	    gbc_panel_4.gridy = 1;
	    panel.add(panel_4, gbc_panel_4);
	    
	    JButton btnNewButton_2 = new JButton("Conducteurs");
	    btnNewButton_2.setPreferredSize(new Dimension(120,70));
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    panel_4.add(btnNewButton_2);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(50, 205, 50));
	    GridBagConstraints gbc_panel_3 = new GridBagConstraints();
	    gbc_panel_3.insets = new Insets(0, 0, 5, 0);
	    gbc_panel_3.fill = GridBagConstraints.BOTH;
	    gbc_panel_3.gridx = 1;
	    gbc_panel_3.gridy = 1;
	    panel.add(panel_3, gbc_panel_3);
	    
	    JButton btnNewButton_3 = new JButton("Missions");
	    btnNewButton_3.setPreferredSize(new Dimension(120,70));
	    panel_3.add(btnNewButton_3);
	    
	    JPanel panel_6 = new JPanel();
	    panel_6.setBackground(new Color(50, 205, 50));
	    GridBagConstraints gbc_panel_6 = new GridBagConstraints();
	    gbc_panel_6.insets = new Insets(0, 0, 5, 5);
	    gbc_panel_6.fill = GridBagConstraints.BOTH;
	    gbc_panel_6.gridx = 0;
	    gbc_panel_6.gridy = 2;
	    panel.add(panel_6, gbc_panel_6);
	    
	    JButton btnNewButton_4 = new JButton("Vehicules");
	    btnNewButton_4.setPreferredSize(new Dimension(120,70));
	    panel_6.add(btnNewButton_4);
	    
	    JPanel panel_5 = new JPanel();
	    panel_5.setBackground(new Color(50, 205, 50));
	    GridBagConstraints gbc_panel_5 = new GridBagConstraints();
	    gbc_panel_5.insets = new Insets(0, 0, 5, 0);
	    gbc_panel_5.fill = GridBagConstraints.BOTH;
	    gbc_panel_5.gridx = 1;
	    gbc_panel_5.gridy = 2;
	    panel.add(panel_5, gbc_panel_5);
	    
	    JButton btnNewButton_5 = new JButton("Quitter");
	    btnNewButton_5.setPreferredSize(new Dimension(120,70));
	    panel_5.add(btnNewButton_5);
		
		

}}
