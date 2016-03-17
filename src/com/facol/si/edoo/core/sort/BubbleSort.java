package com.facol.si.edoo.core.sort;

public class BubbleSort implements ISortAlgorithm {
	@Override
	public int[] sort(int[] data) {
		int aux = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[j] < data[j + 1]) {
					aux = data[j];
					data[j] = data[j + 1];
					data[j + 1] = aux;
				}
			}
		}
		return data;
	}

	@Override
	public int[] sortStep(int[] data, int step) {
		int aux = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[j] < data[j + 1]) {
					aux = data[j];
					data[j] = data[j + 1];
					data[j + 1] = aux;
				}
				if (i*j == step){
					return data;
				}
			}
		}
		return data;
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
