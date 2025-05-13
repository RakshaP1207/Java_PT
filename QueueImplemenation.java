/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java61;

/**
 *
 * @author SMV
 */
public class QueueImplemenation {
    int[] queue=new int[5];
    int front=-1;
    int rear=-1;
    int size=5;
    void enQueue(int x){
        if(front==0&&rear==size-1){
            System.out.println("Queue is Full");
            }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            queue[rear]=x;
            System.out.println(x+" "+"Inserted into the Queue");
        }
    }
    void Dqueue(){
        if(front==-1&&rear==-1){
            System.out.println("Empty");}
        else if(front==rear){
            System.out.println(queue[front]+" "+"Deleted");
            front=-1;
            rear=-1;
          
           
        }
        else{
            System.out.println(queue[front]+" "+"Deleted");
            front++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueImplemenation q=new QueueImplemenation();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);
        q.enQueue(60);
        q.Dqueue();
        q.Dqueue();
        q.Dqueue();
        q.Dqueue();
        q.Dqueue();
        q.Dqueue();
    }
        // TODO code application logic here
    }
    

