package Generic; 

import java.util.Random;
public class Generic{

      public static Integer[] createRandomArray(Integer arrayLength) {  
        Random randomnumbers = new Random();  
        Integer [] array = new Integer [arrayLength]; 
        for (Integer i = 0; i < arrayLength; i++) {
            array[i] = randomnumbers.nextInt(101);        
        }
        return array;
      }
    public static <T extends Comparable<T>> void bubbleSort(T[] item) {
        T swap; 
        for (int i = 0; i < item.length; i++){
            for (int h = i+1; h < item.length; h++){
                if ((item[i]).compareTo(item[h]) > 0){
                    swap = item[i];
                    item[i] = item[h]; 
                    item[h] = swap; 
                 }
              }
           }
                    for ( int k = 0; k < item.length; k++){
                        System.out.print(item[k] + " ");
                    }
        }

       
        public static <T extends Comparable<T>> void merge(T[] array, Integer left, Integer mid, Integer right) {

      
            int num1 = mid - left + 1;
            int num2 = right - mid;
          
           
            T [] Left = (T[]) new Comparable[num1];
            T [] Right = (T[]) new Comparable[num2];
          
           
            for (int i = 0; i < num1; ++i) {
              Left[i] = array[left+ i];
            }
          
            for (int j = 0; j < num2; ++j) {
              Right[j] = array[mid + 1 + j];
            }

            int left1 = 0;
            int right1 = 0;
            int index = left; 
            while (left1 < Left.length && right1 < Right.length){
                if (Left[left1].compareTo(Right[right1]) <= 0){
                    array[index] = Left[left1];
                    left1++; 
                }
                else {
                    array[index] = Right[right1];
                    right1 ++; 
                }
                index++;
            }
            while (left1 < Left.length) {
             array[index++] =  Left[left1++];
            }
            while (right1 < Right.length){
                array[index++] =  Right[right1++];
            }      
            
          
        }
          
        
          public static <T extends Comparable<T>> void sort(T[] array, Integer left, Integer right) {
    
            if (left < right) {
          
              int mid = (left + right) / 2; 
              sort(array, left, mid); 
              sort(array, mid + 1, right); 
              merge(array, left, mid, right); 
            }
          

          }
        
        
      
            
          

public static void main(String[] args){
    Integer [] array = createRandomArray(15);  
    System.out.print("Bubble Sort array:");    
    bubbleSort(array); 
    sort(array, 0, array.length - 1); 
    System.out.print("\n");
    System.out.print("\nMerge Sort array:");
    for ( int k = 0; k < array.length; k++){
        System.out.print(array[k] + " ");
    }  
}

}