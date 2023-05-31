public class Algorithms {
    public static void main(String[] args){
        //Example 1 bubble sort
        /*int N = 5;
        int[] arr = {4,1,3,9,7};
        bubbleSort(arr, N);
        System.out.println("Bubble sorted array: ");
        for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }*/

        //Example 2 bubble sort
        /*int N = 10;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr, N);
        System.out.println("Bubble sorted array: ");
        for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }*/

        //Example 1 quick sort
        /*int N = 5;
        int[] arr = {4, 1, 3, 9, 7};
        quickSort(arr, 0, N-1);
        System.out.println("Quick sorted array: ");
        for ( int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }*/

        //Example 2 quick sort
        /*int N = 9;
        int[] arr = { 2, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSort(arr, 0, N-1);
        System.out.println("Quick sorted array: ");
        for ( int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }*/


    }

    public static void bubbleSort(int[] arr, int N){
        for(int i = 0; i <N-1; i++)
            for(int j = 0; j <N-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
     public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j<high; j++){
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]= temp;
        return i+1;
     }

}
