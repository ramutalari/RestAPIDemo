package programs_imp;

public class ArraySubSet {

    public static boolean isSubset(int arr1[], int arr2[]){
        int i=0;
        int j=0;
        for (i=0;i<arr2.length;i++){
            for (j=0;j<arr1.length;j++){
                if (arr2[i] == arr1[j]){
                    System.out.print(arr2[i]+"\t");
                    break;
                }
            }
            if (j==arr1.length)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        int arr1[] = {2, 3, 4, 5, 8, 10, 20};
        int arr2[] = {10, 20, 2, 3};

        if (isSubset(arr1, arr2)){
            System.out.println();
            System.out.println("arr2 is subset of arr1");
        }
        else{
            System.out.println();
            System.out.println("arr2 is not subset of arr1");
        }

    }
}
