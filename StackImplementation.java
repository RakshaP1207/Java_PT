/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa1;

/**
 *
 * @author SMV
 */
public class StackImplementation{
    int[] stack;
    int capacity;
    int top;
    StackImplementation(int size){
        stack=new int[size];
        capacity=size;
        top=-1;
    
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("Overflow state");
        }
        else{
            top++;
            stack[top]=x;
            System.out.println("Inserted element is - "+x);
          
            
        }
        
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
        
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Underflow state");
        }
        else{
            System.out.println(stack[top]+" "+"popped");
            top--;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackImplementation s1=new StackImplementation(3);
            s1.push(10);
            s1.push(20);
            s1.push(30);
            s1.push(40);
            s1.pop();
            s1.pop();
            s1.pop();
            s1.pop();
        }
        // TODO code application logic here
    }
    

