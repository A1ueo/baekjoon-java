package s1.b1991;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int n = Integer.parseInt(br.readLine());

		
		String[] tmp = br.readLine().split(" ");
		
		Node a = new Node(tmp[0]);
		Node b = new Node(tmp[1]);

		System.out.println(a.equals(b));


		// for (int i = 0; i < n; i++) {
		// 	String[] tmp = br.readLine().split(" ");

		// 	if (i == 0) root.value = tmp[0];
		// 	if (!".".equals(tmp[1])) root.left = new Node(tmp[1]);
		// 	if (!".".equals(tmp[2])) root.right = new Node(tmp[2]);
		// }

		// StringBuilder pre = new StringBuilder();
		// StringBuilder in = new StringBuilder();
		// StringBuilder post = new StringBuilder();
		// for (int i = 0; i < n; i++) {

		// }
	}
}

class Node {
	String value;
	Node left;
	Node right;

    public Node() {
    }

    public Node(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
		if (this == obj) return true;

		if (obj instanceof Node) {
			Node other = (Node) obj;
			return Objects.equals(this.value, other.value);
		}
		return false;
    }
}

class tree {

	Node root;
	Node curr = root;

	void add(String a, String b, String c) {
		if (root == null){
			root = new Node(a);
			root.left = new Node(b);
			root.right = new Node(c);
		} else {
				
		}
	}
}
