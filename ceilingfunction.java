import java.util.ArrayList;
import java.util.Scanner;
public class ceilingfunction {
	static node tempRoot;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), n = sc.nextInt();
		ArrayList<node> roots = new ArrayList<node>();
		nodeLoop : for(int i = 0; i < c; i++){
			tempRoot = new node(sc.nextInt());
			for(int j = 1; j < n; j++){
				int tempValIn = sc.nextInt();
				addNode(tempRoot, tempValIn);
			}
			for(node compareRoot : roots){
				if(tempRoot.areSameShape(compareRoot)) continue nodeLoop;
			}
			roots.add(tempRoot);
		}
		System.out.println(roots.size());
	}
	static void addNode(node parentIn, int valIn){
		if(valIn < parentIn.val){
			if(parentIn.left == null) parentIn.left = new node(valIn);
			else addNode(parentIn.left, valIn);
		}
		else{
			if(parentIn.right == null) parentIn.right = new node(valIn);
			else addNode(parentIn.right, valIn);
		}
	}
}
class node{
	node left, right;
	int val;
	public node(int valIn){
		val = valIn;
	}
	public boolean areSameShape(node nodeIn){
		if(nodeIn.left == null && this.left != null) return false;
		if(nodeIn.left != null && this.left == null) return false;
		
		if(nodeIn.right == null && this.right != null) return false;
		if(nodeIn.right != null && this.right == null) return false;
		
		if(nodeIn.left != null && !this.left.areSameShape(nodeIn.left)) return false;
		if(nodeIn.right != null && !this.right.areSameShape(nodeIn.right)) return false;
		
		return true;
	}
}