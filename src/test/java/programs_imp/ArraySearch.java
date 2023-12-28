package programs_imp;

public class ArraySearch {

    public static boolean contains(int myarr[], int item){

        for (int n: myarr){
            if (item == n){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args){
        int arr[] = {10, 20, 5, 40, 34, 44, 22, 100, 50, 66, 11};
        System.out.println(contains(arr, 44));
    }
}
