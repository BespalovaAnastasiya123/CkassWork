package collectionStack;

public class ThreeDemo {
    public static void main(String[] args) {
        Three<Integer> three = new Three<>(1);
        Three.Node root = three.getRoot();
        root.addChild(
                three.new
                        Node(root,2));
        root.addChild(three.new Node(root,3));
        root.addChild(
                three.new
                        Node(root,4));
        root.preOrder(root);

    }
}

