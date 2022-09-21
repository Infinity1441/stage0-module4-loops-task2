18 lines (16 sloc)  422 Bytes

        package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        if(printToInclusive>0){
            int fact = 1;
            int i = 1;
            System.out.println(1);
            while(i<=printToInclusive)
            {
                fact = fact * i;
                i++;
                System.out.println(fact);
            }}else
            System.out.println(1);
    }
}