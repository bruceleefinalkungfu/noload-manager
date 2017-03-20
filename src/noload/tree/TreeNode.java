package noload.tree;

import java.util.Map;

import noload.explorer.bo.Char;

public class TreeNode<T> {

	private T t;
    
    private Map<Character, TreeNode<T>> leaves;
	
	public TreeNode(T t){
		this.t = t;
	}
    
    public Map<Character, TreeNode<T>> getLeaves() {
		return leaves;
	}
	public void setLeaves(Map<Character, TreeNode<T>> leaves) {
		this.leaves = leaves;
	}
	public void set(T t) { this.t = t; }
    public T get() { return t; }
    
}
