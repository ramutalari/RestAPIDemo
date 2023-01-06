package workspace_03;

public class SecondHighestLargest001 {

    public static void main(String[] args) {

        int arr[] = {4,1,25,15,42,30};
        int largest = 0 ;
        int secondHighest = 0;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>largest)
            {
                secondHighest = largest;
                largest = arr[i];
            }
            else
            {
                secondHighest = arr[i];
            }
        }
        System.out.println("largest number is: "+largest);
        System.out.println("Second highest number is: "+secondHighest);
    }
}
