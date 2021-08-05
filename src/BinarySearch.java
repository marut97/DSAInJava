import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] array = new int[n1];
        for(int i=0; i<n1; i++)
        {
            array[i]=sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(search(array, key));
    }

    private static int search(int[] array, int key){
        int l = 0, r = array.length -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(array[mid] == key)
                return mid;
            else if(array[mid]>key)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
