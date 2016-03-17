package com.facol.si.edoo.core.sort;

public class InsertionSort implements ISortAlgorithm {

	@Override
	public int[] sort(int[] data) {
		int temp, j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j=0;
			for (j = i-1; j >= 0 && temp < data[j]; j--) {
				data[j+1]=data[j];
			}
			data[j+1]=temp;
		}
		return data;
	}

	@Override
	public int[] sortStep(int[] data, int step) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] sort(float[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float[] sortStep(float[] data, int step) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] sort(double[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] sortStep(double[] data, int step) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] sort(char[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] sortStep(char[] data, int step) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sort(String[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sortStep(String[] data, int step) {
		// TODO Auto-generated method stub
		return null;
	}
	
}