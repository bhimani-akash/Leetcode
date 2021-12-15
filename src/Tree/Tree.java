package Tree;

public class Tree {
    private Node root;

    public Tree () {
        root = null;
    }

    public void insert(int data) {
        Node tempNode = new Node();
        tempNode.data = data;

        if (root == null) {
            root = tempNode;
        } else {
            Node current = root;
            Node parent = null;

            while (true) {
                parent = current;

                if (data < parent.data) {
                    current = current.leftChild;

                    if (current == null) {
                        parent.leftChild = tempNode;
                        return;
                    }
                } else {
                    current = current.rightChild;

                    if (current == null) {
                        parent.rightChild = tempNode;
                        return;
                    }
                }
            }
        }
    }

    public Node search(int data) {
        Node current = root;
        System.out.print("Visiting elements: ");

        while (current.data != data) {
            System.out.print(current.data + " ");

            if (current.data > data)
                current = current.leftChild;
            else
                current = current.rightChild;

            if (current == null)
                return null;
        }

        return current;
    }

    public void traverse(int traversalType){
        switch (traversalType) {
            case 1 -> {
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
            }
            case 2 -> {
                System.out.print("\nInorder traversal: ");
                inOrder(root);
            }
            case 3 -> {
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
            }
        }
    }

    private void preOrder(Node root){
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    private void inOrder(Node root){
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.data + " ");
            inOrder(root.rightChild);
        }
    }

    private void postOrder(Node root){
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }
}
