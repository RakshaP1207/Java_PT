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
public class BinarySearch {
    int binarysearch(int[] arr,int l,int r,int ele){
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                l=mid+1;}
            else if(arr[mid]>ele){
                r=mid-1;
                
        }
    }
        return -1;
}
    

public static void main(String[] args){
int[] arr={5,9,17,23,25,45,59,63,72,89};
int l=0;
int r=arr.length-1;
int ele=100;
BinarySearch b=new BinarySearch();
int res=b.binarysearch(arr,l,r,ele);
if(res!=-1){
    System.out.println("Element found");
}
else{
    System.out.println("Element not found");
}
}
}


    

