package com.facol.si.edoo.core.tree;

public class Node {
	private Node leftChild;
	private Node rightChild;
	private String content;

	public void addContent(String value) {
		this.setContent(value);
	}

	public boolean addLeftChild(Node leftNode) {
		if (this.leftChild == null) {
			this.leftChild = leftNode;
			return true;
		} else {
			return false;
		}

	}

	public boolean addRightChild(Node rightNode) {
		if (this.rightChild == null) {
			this.rightChild = rightNode;
			return true;
		} else {
			return false;
		}
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public int degree() {
		if ((this.leftChild == null) & (this.rightChild == null)) {
			return 0;
		} else if ((this.leftChild != null) | (this.rightChild != null)) {
			return 1;
		} else {
			return 2;
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
