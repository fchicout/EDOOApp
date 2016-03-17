package com.facol.si.edoo.gui.forms;

import com.facol.si.edoo.core.sort.SelectionSort;

public class Console {

	public static void main(String[] args) {
		int[] vector = new int[10];
		vector[0] = 4;
		vector[1] = 1;
		vector[2] = 0;
		vector[3] = 9;
		vector[4] = 8;
		vector[5] = 7;
		vector[6] = 6;
		vector[7] = 3;
		vector[8] = 2;
		vector[9] = 9;
		SelectionSort is = new SelectionSort();
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + ", ");
		}
		System.out.println("\n");
		int[] orderedData = is.sort(vector);
		for (int j = 0; j < orderedData.length; j++) {
			System.out.print(orderedData[j] + ", ");
		}
		System.out.println("\n");
	}

}
