package model;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;
	
	
	public LinkedList(int value) {
	
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}


	public Node getHead() {
		return head;
	}


	public Node getTail() {
		return tail;
	}


	public int getLength() {
		return length;
	}


	
	//This method prints values in the linked list.
	public void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
			
		}
	}
	
	//This method adds items to the linked list
	
	public void append(int value)
	{
		Node newNode = new Node(value);
		
		//check if the linkedList is empty
		if(length ==0)
		{
			//if empty, set head and tail to point to the new node
			head = newNode;
			tail = newNode;
		}
		else
		{
			//assigning next variable on the Node to new Node(value just passed on as an argument).
			tail.next=newNode;
			tail = newNode;
		}
		length++;
	}
	
	//this method removes the node from the LinkedList
	
	public Node removeLast()
	{
		if(length==0)
		{
			return null;
		}
		else
		{
			Node temp = head;
			Node pre = head;
			
			while(temp.next !=null)
			{
				pre = temp;
				temp = temp.next;
			}
			tail = pre;
			tail.next = null;
			length--;
			if(length ==0)
			{
				head = null;
				tail = null;
			}
			return temp;
		}
	}
	
	//This method appends elements from the beginning of the LinkedList
	
	public void prePend(int value)
	{
		Node newNode = new Node(value);
		if(length==0)
		{
			head = newNode;
			tail = newNode;			
		}
		else
		{
			newNode.next= head;
			head = newNode;	
		}
		
		length++;
		
	}
	
	//This method removes the first node on the linked list
	
	public Node removeFirst()
	{
		if(head==null)
		{
			return null;
		}
		
		else
		{
			Node temp = head;
			head = head.next;
			temp.next = null;
			length--;
			if(length==0)
			{
				tail =null;
			}
			return temp;
		}
	}
	
	//This method fetches a node using an index
	public Node getNode(int index)
	{
		if(index <0 || index >= length)
		{
			return null;
		}
		else
		{
			Node temp = head;
			for(int i = 0; i<index; i++)
			{
				temp = temp.next;
			}
			return temp;
		}
	}
	//This method changes the value of the node at a given index
	public boolean setNode(int index, int value)
	{
		Node temp = getNode(index);
		if(temp !=null)
		{
			temp.value = value;
			return true;
		}
		
		return false;
	}
	
	
	//This method inserts the Node in a specific index
	public boolean insertNode(int index, int value)
	{
		if(index <0 && index >length)return false;
	
		if(index == 0){
			prePend(value);
			return true;}
		if(index == length)
		{
			append(value);
			return true;
		}

		
		Node newNode = new Node(value);
		Node temp = getNode(index-1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
		
	}
	
	//This method removes Node from a specific index
	public Node removeNode(int index)
	{
		if(index < 0 || index >=length) return null;
		if(index==0) return removeFirst();
		if(index==length-1) return removeLast();
		
		Node prev = getNode(index-1);
		Node temp = prev.next;
		
		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	}
}
