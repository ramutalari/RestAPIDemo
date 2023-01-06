package workspace_03;

public class Polindrome_Ex0003 {

    public static void main(String[] args) {

        int num = 454;
        int r,temp,sum=0;

        temp = num;

        while(num>0)
        {
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }

        if (temp==sum)
        {
            System.out.println("Number "+temp + " is polindrome");
        }
        else
        {
            System.out.println("Number "+temp+" is not polindrome");
        }


    }
}
