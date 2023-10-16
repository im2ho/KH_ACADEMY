package com.kh.treeMain;
/*
 노드를 삽입하고 돌아가며(순회) 출력하는 이진트리
 	전위 순회 : root(뿌리)를 가장 먼저 방문
 	중위 순회 : 왼쪽 하위 트리를 방문 후 root(뿌리) 방문
 	후위 순회 : 하위 트리 모두 방문 후 root(뿌리) 방문
 	층별 순회 : 위 쪽 node들 부터 아래 방향으로 차례대로 방문
 */
public class BinaryTree {
	
	TreeNode roott; //이게 무슨소리일까.. 암튼 파란 root는 내가 정의한 변수인듯
	
	/*
	public BinaryTree() { //생성자 > 필요없는데...?응?
		this.root = null;
	}
	*/
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(); //인스턴스 생성
		
		tree.insert(50);
		tree.insert(70);
		tree.insert(30);
		tree.insert(40);
		tree.insert(20);
		tree.insert(80);
		tree.insert(60);
		tree.insert(45);
		tree.insert(85);
		tree.insert(100);
		tree.insert(120);
		tree.insert(10);
		tree.insert(65);
		
		System.out.println("이진 트리의 중위 순회 결과 : ");
		tree.inOrderT(); 
	}
	
	/*
	 insert, insertRec 메서드는 이진 트리에 새로운 노드를 삽입하는데 사용
	 
	 insert : 외부에 노출되는 메서드
	 insertRec : 실제 삽입 작업 메서드	
	 */
	
	// insert 메서드
	public void insert(int data) {
		roott = insertRec(roott, data);
	}
	
	// intsertRec 메서드
	private TreeNode insertRec(TreeNode root, int data) {
		// 재귀적으로 노드를 삽입하고 적절한 위치를 찾아 새로운 노드를 생성
		// 재귀적 : 자기 자신을 포함하고, 다시 자기 자신을 사용해서 정의내림
		
		if(root == null) { //root가 null값일 경우 첫 data를 root로 결정
			root = new TreeNode(data);
			return root;
		}
		if(data<root.data) { //새로 들어온 데이터가 root보다 작으면 왼쪽으로
			root.left = insertRec(root.left, data);
		} else if(data>root.data) { // 크면 오른쪽으로
			root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	/*
	 inOrderT : 중위순회
	 inOrderTR : 중위순회를 수행하여 트리의 노드를 출력하는데 사용
	 왼쪽 서브트리 > 현재노드 > 오른쪽 서브트리 순서로 노드 출력
	 */
	
	public void inOrderT() { // inOrderTraversal : 중위순회
		// 외부에 노출되는 메서드
		inOrderTR(roott);
	}
	
	//root.data가 뭔데
	private void inOrderTR(TreeNode root) { //중위순회를 수행하여 트리의 노드를 출력하는데 사용..
		if(root != null) { // root 값이 null이 아니라면..
			inOrderTR(root.right); //왼쪽서브트리 참조 명령 왼쪽으로 갈 수 잇는만큼 가
			System.out.print(root.data + " "); //루트노트방문 도장~~~!
			inOrderTR(root.left); //오른쪽서브트리 참조 명령 오른쪽으로 갈 수 잇는만큼 가
			//System.out.print(root.data + " ");
		}
	}
	


}