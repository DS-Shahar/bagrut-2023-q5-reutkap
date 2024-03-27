public class OrderedList {

	private Node<NumCount> lst;

	public void insertNum(int x) {
		System.out.println("insert " + x);
	}

	public int valueN(int n) {		
		return -1;
	}
	public void removeNum(int x) {
		if (lst.getValue().getNum() == x){
			lst = lst.getNext();
			System.out.println("remove " + x);
			return;
		}
		Node <NumCount> p = lst;
		while (p != null) {
			if((p.getNext().getValue().getNum()) == x){
				p.setNext(p.getNext().getNext());
				System.out.println("remove " + x);
				return;
			}
			p = p.getNext();
		}
	}
}
