package noload.tree;

import noload.explorer.bo.Char;

/**
 * @author Anurag Awasthi
 *
 * @param <T>
 */
public class NArrayTree<T extends Char> {

	TreeNode<T> root;
	
	public NArrayTree() throws InstantiationException, IllegalAccessException {
		root = TreeNode.class.newInstance();
	}
	
	
	
}
