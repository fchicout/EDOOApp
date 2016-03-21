package com.facol.si.edoo.core.sort;

public class InsertionSort implements ISortAlgorithm {

	@Override
	public int[] sort(int[] data) {
		int temp, j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
		}
		return data;
	}

	@Override
	public int[] sortStep(int[] data, int step) {
		int temp, j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
			if ((i * j) == step) {
				return data;
			}
		}
		return data;
	}

	@Override
	public float[] sort(float[] data) {
		float temp;
		int j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
		}
		return data;
	}

	@Override
	public float[] sortStep(float[] data, int step) {
		float temp;
		int j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
			if ((i * j) == step) {
				return data;
			}
		}
		return data;
	}

	@Override
	public double[] sort(double[] data) {
		double temp;
		int j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
		}
		return data;
	}

	@Override
	public double[] sortStep(double[] data, int step) {
		double temp;
		int j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
			if ((i * j) == step) {
				return data;
			}
		}
		return data;
	}

	@Override
	public char[] sort(char[] data) {
		char temp;
		int j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
		}
		return data;
	}

	@Override
	public char[] sortStep(char[] data, int step) {
		char temp;
		int j;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			j = 0;
			for (j = i - 1; j >= 0 && temp < data[j]; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = temp;
			if ((i * j) == step) {
				return data;
			}
		}
		return data;
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