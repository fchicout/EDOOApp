package com.facol.si.edoo.core.sort;

public class QuickSort implements ISortAlgorithm {

	private int[] sort(int[] data, int start, int end) {
		if (start < end) {
			int pivotPosition = split(data, start, end);
			sort(data, start, pivotPosition - 1);
			sort(data, pivotPosition + 1, end);
		}
		return data;
	}

	private int split(int[] data, int start, int end) {
		int pivot = data[start];
		int i = start;
		int e = end;

		while (i <= e) {
			if (data[i] <= pivot) {
				i++;
			} else if (pivot < data[e]) {
				e--;
			} else {
				int swap = data[i];
				data[i] = data[e];
				data[e] = swap;
				i++;
				e--;
			}
		}
		data[start] = data[e];
		data[e] = pivot;

		return e;
	}

	@Override
	public int[] sort(int[] data) {
		return sort(data, 0, data.length - 1);
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
