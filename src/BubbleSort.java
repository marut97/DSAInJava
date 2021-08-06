import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] array = new int[n1];
        for(int i=0; i<n1; i++)
        {
            array[i]=sc.nextInt();
        }
        sort(array);
        for(int i=0; i<n1; i++)
        {
            System.out.println(array[i]);
        }

    }

    private static void sort(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if(array[j-1] > array[j]){
                    //swap elements
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
