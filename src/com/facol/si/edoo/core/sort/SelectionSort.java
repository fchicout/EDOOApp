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
		for (int fixo = 0; fixo < data.length - 1; fixo++) {
			int menor = fixo;
			int i=menor;
			for (; i < data.length; i++) {
				if (data[i] < data[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = data[fixo];
				data[fixo] = data[menor];
				data[menor] = t;
			}
			if (fixo*i) == step){
				return data;
			}
		}
		return data;
	}

	@Override
	public float[] sort(float[] data) {
		for (int fixo = 0; fixo < data.length - 1; fixo++) {
			int menor = fixo;
			for (int i = menor; i < data.length; i++) {
				if (data[i] < data[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				float t = data[fixo];
				data[fixo] = data[menor];
				data[menor] = t;
			}
		}
		return data;
	}

	@Override
	public float[] sortStep(float[] data, int step) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] sort(double[] data) {
		for (int fixo = 0; fixo < data.length - 1; fixo++) {
			int menor = fixo;
			for (int i = menor; i < data.length; i++) {
				if (data[i] < data[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				double t = data[fixo];
				data[fixo] = data[menor];
				data[menor] = t;
			}
		}
		return data;
	}

	@Override
	public double[] sortStep(double[] data, int step) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] sort(char[] data) {
		for (int fixo = 0; fixo < data.length - 1; fixo++) {
			int menor = fixo;
			for (int i = menor; i < data.length; i++) {
				if (data[i] < data[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				char t = data[fixo];
				data[fixo] = data[menor];
				data[menor] = t;
			}
		}
		return data;
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
