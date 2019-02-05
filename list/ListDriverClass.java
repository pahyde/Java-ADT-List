package list;

public class ListDriverClass {
	public static void main(String[] args) {
		//0-indexed List ADT implemented with Linked List
		ListReferenceBased<Integer> ll = new ListReferenceBased<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(5);
		ll.add(2,3);
		ll.show();
	    ll.get(3);
	    ll.remove(3);
	    ll.show();
	    
	    System.out.println();
	    
	    ListReferenceBased<String> myList = new ListReferenceBased<String>();
	    myList.add("15");
	    myList.add("25");
	    myList.add("35");
	    myList.add("45");
	    myList.show();
	    myList.add(4, "55");
	    myList.show();
	    myList.remove(1);
	    myList.show();
	}
}
