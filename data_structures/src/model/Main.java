package model;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(4);
		list.append(6);
		list.append(7);
		list.append(3);
		list.append(5);
		list.prePend(9);
		
		list.setNode(1, 8);
		
		System.out.println("The element at given index is: "+list.getNode(1).value);		
		list.insertNode(1, 7);
		list.removeNode(4);
		
		System.out.println("Head value is: " +list.getHead().value);
		System.out.println("Tail value is: "+list.getTail().value);
		System.out.println("The lengtgh of this LinkedList is: "+list.getLength());
		System.out.println("Elements of the LinkedList are: ");
		list.printList();

		list.removeLast();
		System.out.println("Elements of the LinkedList after removing ONE item are: ");
		list.printList();
		
		list.removeFirst();
		System.out.println("Elements of the LinkedList after removing the FIRTS item are: ");
		list.printList();

		
		
		
		while(list.getHead()!=null)
		{
			list.removeLast();
			
		}
		System.out.println("Elements of the LinkedList after removing All are: ");
		list.printList();
		
		System.out.println("Null");
		
		
	}

}
