package com.facol.si.edoo.core.sort;

public class MergeSort implements ISortAlgorithm {
	

	@Override
	public int[] sort(int[] data) {
		/*if (fim <= inicio) {
			return;
		}
		int meio = (inicio + fim) / 2;
		sort(array, inicio, meio);
		sort(array, meio + 1, fim);
		int[] A = new int[meio - inicio + 1];
		int[] B = new int[fim - meio];
		for (int i = 0; i <= meio - inicio; i++) {
			A[i] = array[inicio + i];
		}
		for (int i = 0; i <= fim - meio - 1; i++) {
			B[i] = array[meio + 1 + i];
		}
		int i = 0;
		int j = 0;
		for (int k = inicio; k <= fim; k++) {
			if (i < A.length && j < B.length) {
				if (A[i] < B[j]) {
					array[k] = A[i++];
				} else {
					array[k] = B[j++];
				}
			} else if (i < A.length) {
				array[k] = A[i++];
			} else if (j < B.length) {
				array[k] = B[j++];
			}
		}*/
		return null;
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
