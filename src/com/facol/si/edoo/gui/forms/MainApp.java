package com.facol.si.edoo.gui.forms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainApp {

	private JFrame frmEdooappFacol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frmEdooappFacol.setVisible(true);
					window.frmEdooappFacol.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEdooappFacol = new JFrame();
		frmEdooappFacol.setResizable(true);
		frmEdooappFacol.setTitle("EDOOApp - FACOL");
		frmEdooappFacol.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmEdooappFacol.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEdooappFacol.dispose();
			}
		});
		mnArquivo.add(mntmSair);
		
		JMenu mnOrdenamento = new JMenu("Ordenamento");
		menuBar.add(mnOrdenamento);
		
		JMenuItem mntmSelectSort = new JMenuItem("Select Sort");
		mnOrdenamento.add(mntmSelectSort);
		
		JMenuItem mntmInsertSort = new JMenuItem("Insert Sort");
		mnOrdenamento.add(mntmInsertSort);
		
		JMenuItem mntmMergeSort = new JMenuItem("Merge Sort");
		mnOrdenamento.add(mntmMergeSort);
		
		JMenuItem mntmBubbleSort = new JMenuItem("Bubble Sort");
		mnOrdenamento.add(mntmBubbleSort);
		
		JMenuItem mntmQuickSort = new JMenuItem("Quick Sort");
		mnOrdenamento.add(mntmQuickSort);
	}

}
