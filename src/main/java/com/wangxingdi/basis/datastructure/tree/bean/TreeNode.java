package com.wangxingdi.basis.datastructure.tree.bean;

/**
 * 树结构
 * @author wangxd
 * @param <T>
 */
public class TreeNode<T> {
	
	private T val;
	private TreeNode<T> left;
	private TreeNode<T> right;
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}
	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

}
