package Linkedlistimp;

public class Linkedlistnode {
	private Integer data;
	private Linkedlistnode next;
	

	public Linkedlistnode(Integer data) {
		// TODO Auto-generated constructor stub
		super();
		this.data = data;
		this.setNext(null);
		
	}
	
	
	public class Node {
        int data;
        Node next;
  
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }


	public Integer getData() {
		return data;
	}


	public void setData(Integer data) {
		this.data = data;
	}


	public Linkedlistnode getNext() {
		return next;
	}


	public void setNext(Linkedlistnode next) {
		this.next = next;
	}
	
	
	

}
