package com.company;
import java.util.Scanner;
public class q9_binary_search {
    // now we create binary search method
    public static int bianrySearch(int array[],int size_of_array,int key){
        int start = 0;
        int end  = size_of_array -1;
        int mid  =  start +(end -start)/2;
        while (start<=end){

            if (array[mid] == key){
                return mid;
            }if (array[mid]>key){
                end  = mid -1;
            }if (array[mid]<key){
                start  = mid +1;
            }
            mid  =  start +(end -start)/2;
         //this will return index
        }return mid;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //we take sorted array beacuse binary search is only applicable in sorted aaray
        System.out.println(("Enter size of sorted array"));
        int size_of_array  = input.nextInt();
        int []array = new int[size_of_array];
        System.out.println("Now put elemnets in array");
        for (int i = 0;i<size_of_array;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter key which you have to find");
        int key = input.nextInt();

        System.out.println("index of key is at index "+ bianrySearch(array,size_of_array,key));

    }
}
