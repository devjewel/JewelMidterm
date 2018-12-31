package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < array.length; i++) {
            int a = array[i];
            int b = i - 1;
            while (b >= 0 && a < array[b]) {
                int temp = array[b];
                array[b] = array[b + 1];
                array[b + 1] = temp;
                b--;
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 0; b < array.length - 1 - a; b++) {
                if (array[b] > array[b + 1]) {
                    int temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }


        return list;
    }


    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here





        return list;
    }


    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
