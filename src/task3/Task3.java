package task3;

public class Task3 {
    public static void main(String[] args) {
        int[] scores=new int[7];
        scores[0]= 85;
        scores[1]= 75;
        scores[2]=99;
        scores[3]=100;
        scores[4]=55;
        scores[5]=62;
        scores[6]=49;

        for(int i = 0; i< scores.length; i++){
            if (scores[i]>75){
                System.out.println("ქულა არის" + scores[i]);
            }
        }
    }
}
