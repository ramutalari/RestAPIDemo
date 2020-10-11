package programspractice;

public class LargestFourthNumber {

        public static int getFourthLargest(int[] a, int total){
            int temp;
            for (int i = 0; i < total; i++)
            {
                for (int j = i + 1; j < total; j++)
                {
                    if (a[i] > a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            return a[total-4];
        }
        public static void main(String args[]){
            int a[]={1,2,3,4,5,6,7,8};
            //int b[]={44,66,99,77,33,22,55,88,105};
            System.out.println("Fourth Largest:"+getFourthLargest(a,7));
           // System.out.println("Fourth Largest:"+getFourthLargest(b,8));
        }
}






