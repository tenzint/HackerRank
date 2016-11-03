/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
	 Tenzin's Note: This is my logical solution to the problem to see if the tree is a BST.
	 Optimal solution (Editor's solution): checkAllNodes method receives 3 parameters, root, min value and max value.
					Using min value and max value boundary in a recursive way, each ancestor nodes 
					(from root to it's parent) contribute in narrowing the boundary.
					Optimal solution will have less code to write
*/
    boolean checkAllNodes (Node root, Node c, boolean lTree) {          // lTree == true means c in left 'family' of root
        boolean flag = true;
        if (root == null)           
            return true;
        if (c == null)           
            return true;
        if (lTree) {                    // left side of root passed from checkBST
            if (c.left != null) {
                if(c.left.data >= root.data)
                    return false;
                flag = checkAllNodes(root, c.left, true);
                if (!flag)                  return false;
            }
            if (c.right != null) {
                if(c.right.data >= root.data)
                    return false;
                flag = checkAllNodes(root, c.right, true);
                if (!flag)                  return false;
            }
        } else {                        // right side of root passed from checkBST
            if (c.left != null) {
                if(c.left.data <= root.data)
                    return false;
                flag = checkAllNodes(root, c.left, false);
                if (!flag)                  return false;
            }
            if (c.right != null) {
                if(c.right.data <= root.data)
                    return false;
                flag = checkAllNodes(root, c.right, false);
                if (!flag)                  return false;
            }
        }
        return true;
    }
    boolean checkBST(Node root) {
        boolean flag = true;
        if (root == null)
            return true;
        if (root.left != null) {
            if(root.left.data >= root.data)
                return false;
            flag = checkAllNodes(root, root.left, true);           // flag ensures return value of 'true' won't mean anything
            if (!flag)          return false;
            flag = checkBST(root.left);
            if (!flag)          return false;
        }
        if (root.right != null) {
            if(root.right.data <= root.data)
                return false;
            flag = checkAllNodes(root, root.right, false);
            if (!flag)          return false;
            flag = checkBST(root.right);
            if (!flag)          return false;
        }
        return true;
    }
