package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        if(multiplyByAndToInclusive==0){
            System.out.print("");
        }else {
            while(i<=5){
                System.out.println(i*multiplyByAndToInclusive);
                i++;
            }
        }
    }
}