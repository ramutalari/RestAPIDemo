package Workspace_01;

public class FindUniqueEleInArray {

    public static void main(String[] args) {

        //int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int arr[] = {1, 2, 3, 4, 5, 5};
        // int arr[] = {1, 1, 1, 1, 1};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print(arr[i] + " ");
        }
    }
}
