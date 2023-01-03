package queueimp;


public class Queuedatastructure {
	int SIZE = 5;
	int items[] = new int[SIZE];
	int front, rear;

   Queuedatastructure() {
	  front = -1;
	  rear = -1;
	}
   

   //checking if the queue is full
   
   void enQueue(int element) {

     
     if (isFull()) {
       System.out.println("Queue is full");
     }
     else {
       if (front == -1) {
         
         front = 0;
       }

       rear++;
       
       items[rear] = element;
       System.out.println("Insert " + element);
     }
   }

   private boolean isFull() {
	// TODO Auto-generated method stub
	return false;
}



   
   
//deleting


   int deQueue() {
     int element;

     
     if (isEmpty()) {
       System.out.println("Queue is empty");
       return (-1);
     }
     else {
      
       element = items[front];

      
       if (front >= rear) {
         front = -1;
         rear = -1;
       }
       else {
         
         front++;
       }
       System.out.println( element + " Deleted");
       return (element);
     }
   }
private boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}
   

	
	//printing/displaying the queue


void display() {
  int i;
  if (isEmpty()) {
    System.out.println("Empty Queue");
  }
  else {
    
    System.out.println("\nFront index: " + front);

  
    System.out.println("Items: ");
    for (i = front; i <= rear; i++)
      System.out.print(items[i] + "  ");

    
    System.out.println("\nRear index: " + rear);
  }
}

	
	
	
	
}
