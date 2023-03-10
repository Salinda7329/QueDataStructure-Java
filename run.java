class run{
    public static void main(String[] args){
        //create a new queue called myQueue
        Queue myQueue=new Queue();

        //use Enqueue method to insert one element
        myQueue.enqueue(10);
        //2 use Enqueue method to insert second element
        myQueue.enqueue(20);
        //2 use Enqueue method to insert second element
        myQueue.enqueue(30);
        //  insert  element
        myQueue.enqueue(40);
        //  insert  element
        myQueue.enqueue(50);
        
        //print all elements of a queue
        // myQueue.show();
        //use dequeue method to delete front element
        // myQueue.dequeue();
        // //print all elements of a queue
        myQueue.show();
        // //print the queue size
        // System.out.println(myQueue.size());
        // //print the front value of queue
        System.out.println(myQueue.peek());

    }
    
}

class Queue{

    //Make an Array for a queue in type of int
    int[] queue=new int[5];

    //Initialize useful variables
    int size,//default value 0
        front,//default value 0
        rear;//default value 0

    //Make Enqueue method to insert a data to front
    void enqueue(int data){

        //we use rear to refer the index 0 of array
        queue[rear]=data;
        //now the rear increased by one
        rear=rear+1;
        //queue size increased by one
        size=size+1;
    }

    //Make Dequeue method to remove first element from front
    int dequeue(){
        //assign the first element of the queue to data variable
        int data=queue[front];
        //now the newFront=previousFront+1
        front=front+1;
        //the queue size reduced by 1
        size=size-1;
        //print first element
        return data;
    }

    //Make method to return the size of the queue
    int size(){
        //return queueSize
        return size;
    }
    
    //Mehod to return the front value in the queue
    int peek(){
        //return the current front value 
        return queue[front];
    }

    //Method to print all elements in the queue
    void show(){
        //use a loop to print elements in the queue
        //type variable:arrayName
        for(int n:queue){
            System.out.print(n+", ");
        }
    }


}