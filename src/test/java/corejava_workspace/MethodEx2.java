package corejava_workspace;

class Dispaly{

    public void play(){
        System.out.println("Play Badminton");
    }

    public String purhasePen(int price){

        if (price>=25)
            return "pen";

        return "nothing";
    }
}
public class MethodEx2 {

    public static void main(String[] args) {

        Dispaly dispaly = new Dispaly();
        dispaly.play();

      String result =  dispaly.purhasePen(25);
        System.out.println(result);
    }
}
