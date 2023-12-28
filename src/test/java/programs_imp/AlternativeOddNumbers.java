package programs_imp;

import java.util.ArrayList;
import java.util.List;

public class AlternativeOddNumbers {

    public static void main(String[] args){
        List<Integer> oddNumbers = new ArrayList<>();
        System.out.println("Alternative Odd Number from 1 to 100 are: ");
        for(int num = 1;num<=100;num++){
            if (num%2 != 0){
                oddNumbers.add(num);
            }
        }
        for (int i=1;i<oddNumbers.size();i++){
            System.out.print(oddNumbers.get(i)+",");
            i=i+1;
        }
    }
}
