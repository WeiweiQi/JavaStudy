package com.duweri.interview.datastructure;

import java.util.Stack;

public class TraversalBinaryTree {

	public void printNode(Node node) {
		System.out.print(node.getData());
	}

	/**
	 * �������---�ݹ�
	 */
	public void theFirstTraversal(Node root) {
		printNode(root); // ��
		if (root.getLeftNode() != null) { // ��
			theFirstTraversal(root.getLeftNode());
		}
		if (root.getRightNode() != null) { // ��
			theFirstTraversal(root.getRightNode());
		}
	}

	/**
	 * �������---�ݹ�
	 */
	public void theInOrderTraversal(Node root) {
		if (root.getLeftNode() != null) { // ��
			theInOrderTraversal(root.getLeftNode());
		}
		printNode(root); // ��
		if (root.getRightNode() != null) {
			theInOrderTraversal(root.getRightNode());// ��
		}
	}

	/**
	 * �������---�ݹ�
	 */
	public void thePostOrderTraversal(Node root) {
		if (root.getLeftNode() != null) {
			thePostOrderTraversal(root.getLeftNode());
		}
		if (root.getRightNode() != null) {
			thePostOrderTraversal(root.getRightNode());
		}
		printNode(root);
	}
	/**
	 * ǰ�����---�ǵݹ��㷨
	 */
	public void theFirstTraversal_Stack(Node root) {
		Stack<Node> stack = new Stack<Node>();//��ʼ��ջ
		Node node = root;					//�����������ƶ��˽ڵ�
		while (node != null || stack.size() > 0) { // ����������ѹջ
			if (node != null) { //�ڵ㲻Ϊ�գ�
				printNode(node);// ����ýڵ�
				stack.push(node);//�ڵ���ջ
				node = node.getLeftNode();//ָ������
			} else {		//�ڵ�Ϊ��
				node = stack.pop();//��ջ���أ�ȥ�����Һ���
				node = node.getRightNode();
			}
		}
	}
	/**
	 * �������---�ǵݹ��㷨
	 */
	public void theInOrderTraversal_Stack(Node root) { 
		Stack<Node> stack = new Stack<Node>();//��ʼ��ջ
		Node node = root;						//��ʱָ��ڵ�
		while (node != null || stack.size() > 0) {//ջ���ջ��߽ڵ㲻��
			if (node != null) {					//�ڵ㲻�յ����
				stack.push(node); 
				node = node.getLeftNode();
			} else {						//ջ���յ����
				node = stack.pop(); 
				printNode(node);
				node = node.getRightNode();
			}
		}
	}
	/**
	 * �������---�ǵݹ��㷨
	 */
	public void thePostOrderTraversal_Stack(Node root) { 
		Stack<Node> stack = new Stack<Node>();
		Stack<Node> output = new Stack<Node>();// ����һ���м�ջ���洢���������Ľ��
		Node node = root;
		while (node != null || stack.size() > 0) {
			if (node != null) {
				output.push(node);
				stack.push(node);
				node = node.getRightNode();
			} else {
				node = stack.pop();
				node = node.getLeftNode();

			}
		}
		while (output.size() > 0) {
			printNode(output.pop());
		}
	}

	public static void main(String[] args) {
		TraversalBinaryTree tree = new TraversalBinaryTree();
		Node root = tree.init();
		System.out.println("�������");
		tree.theFirstTraversal(root);
		System.out.println("");
		System.out.println("�������");
		tree.theInOrderTraversal(root);
		System.out.println("");
		System.out.println("�������");
		tree.thePostOrderTraversal(root);
		System.out.println("");
	}

	public Node init() {// ע��������������Ƚ����ӽڵ㣬���������Ͻ�������Ϊ��Ҷ�ӽ���ʹ�õ�����Ľڵ㣬����ʼ���ǰ�˳���ʼ���ģ����������ᱨ��
		Node J = new Node(8, null, null);
		Node H = new Node(4, null, null);
		Node G = new Node(2, null, null);
		Node F = new Node(7, null, J);
		Node E = new Node(5, H, null);
		Node D = new Node(1, null, G);
		Node C = new Node(9, F, null);
		Node B = new Node(3, D, E);
		Node A = new Node(6, B, C);
		return A; // ���ظ��ڵ�
	}

	public class Node {
		private int data;
		private Node leftNode;
		private Node rightNode;

		public Node(int data, Node leftNode, Node rightNode) {
			this.data = data;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeftNode() {
			return leftNode;
		}

		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}

		public Node getRightNode() {
			return rightNode;
		}

		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}
	}

}
