package programs_imp;

public class ArrayIndexingForElement {

    public static int returnIndex(int arr[], int key){
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
               index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] arrayEx = {2, 5, 20, 45, 3, 44, 22, 10};
        System.out.println(returnIndex(arrayEx, 22));
    }
}
