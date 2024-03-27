public class OrderedQueue {

	private Queue<NumCount> q;
	
	public OrderedQueue() {
		q = new Queue<NumCount>();
	}

	public void insertNum(int x) {
		
	}
	
	public int valueN(int n) {
		return -1;
	}
	
	public void removeNum(int x) {
		boolean flag = false;
		while (q.head() != null) {
			if (!flag && q.head().getNum() == x) {
				q.remove();
				flag = true;
			}
			q.insert(q.remove());
		}
		q.remove();
	}
}
