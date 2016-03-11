package com.facol.si.edoo.core.sort;

public class SelectionSort implements ISortAlgorithm {

	@Override
	public int[] sort(int[] data) {
		for (int fixo = 0; fixo < data.length - 1; fixo++) {
			int menor = fixo;
			for (int i = menor; i < data.length; i++) {
				if (data[i] < data[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = data[fixo];
				data[fixo] = data[menor];
				data[menor] = t;
			}
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
