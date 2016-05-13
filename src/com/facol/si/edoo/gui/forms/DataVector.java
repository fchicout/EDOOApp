package com.facol.si.edoo.gui.forms;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

import sun.net.NetworkServer;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class DataVector extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataVector frame = new DataVector();
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
	public DataVector() {
		setClosable(true);
		setTitle("Data Vector");
		setBounds(100, 100, 582, 539);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 49, 550, 440);
		getContentPane().add(scrollPane);
		
		JTextArea teDataVector = new JTextArea();
		scrollPane.setViewportView(teDataVector);
		teDataVector.setLineWrap(true);
		
		JButton btnSaveData = new JButton("Save Data");
		btnSaveData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FileWriter fw = new FileWriter(new File("data.tmp"));
					fw.write(teDataVector.getText());
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSaveData.setBounds(12, 13, 97, 25);
		getContentPane().add(btnSaveData);
		
		JButton btnClearData = new JButton("Clear Data");
		btnClearData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				teDataVector.setText("");
			}
		});
		btnClearData.setBounds(115, 13, 97, 25);
		getContentPane().add(btnClearData);
		
		JButton btnCleanTempFile = new JButton("Clean Temp File");
		btnCleanTempFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new File("data.tmp")).delete();
			}
		});
		btnCleanTempFile.setBounds(217, 13, 135, 25);
		getContentPane().add(btnCleanTempFile);

	}
}
