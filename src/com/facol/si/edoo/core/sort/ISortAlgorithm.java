/**
 * 
 */
package com.facol.si.edoo.core.sort;

/**
 * @author Fábio
 *
 */
public interface ISortAlgorithm {
	/**
	 * Método que ordena completamente um vetor de inteiros
	 * @param data - um vetor de inteiros
	 * @return um vetor de inteiros
	 */
	public int[] sort(int[] data);
	/**
	 * Método que ordena parcialmente um vetor
	 * @param data - um vetor de inteiros
	 * @param step - o número do passo
	 * @return um vetor de inteiros parcialmente ordenado
	 */
	public int[] sortStep(int[] data, int step);
	/**
	 * Método que ordena completamente um vetor de float
	 * @param data - um vetor de float
	 * @return um vetor de float
	 */
	public float[] sort(float[] data);
	/**
	 * Método que ordena parcialmente um vetor
	 * @param data - um vetor de float
	 * @param step - o número do passo
	 * @return um vetor de float parcialmente ordenado
	 */
	public float[] sortStep(float[] data, int step);
	/**
	 * Método que ordena completamente um vetor de double
	 * @param data - um vetor de double
	 * @return um vetor de double
	 */
	public double[] sort(double[] data);
	/**
	 * Método que ordena parcialmente um vetor
	 * @param data - um vetor de double
	 * @param step - o número do passo
	 * @return um vetor de double parcialmente ordenado
	 */
	public double[] sortStep(double[] data, int step);
	/**
	 * Método que ordena completamente um vetor de char
	 * @param data - um vetor de char
	 * @return um vetor de char
	 */
	public char[] sort(char[] data);
	/**
	 * Método que ordena parcialmente um vetor
	 * @param data - um vetor de char
	 * @param step - o número do passo
	 * @return um vetor de char parcialmente ordenado
	 */
	public char[] sortStep(char[] data, int step);
	/**
	 * Método que ordena completamente um vetor de String
	 * @param data - um vetor de String
	 * @return um vetor de String
	 */
	public String sort(String[] data);
	/**
	 * Método que ordena parcialmente um vetor
	 * @param data - um vetor de String
	 * @param step - o número do passo
	 * @return um vetor de String parcialmente ordenado
	 */
	public String sortStep(String[] data, int step);
}
