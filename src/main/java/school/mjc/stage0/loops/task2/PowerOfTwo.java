package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        int sum=1;
        if(power>0){
            int i = 1;
            System.out.println(1);
            while(i<=power)
            {
                sum = sum * 2;
                i++;
                System.out.println(sum);
            }}else if(power==0)
            System.out.println(1);
        else
        {
            System.out.println("too much power");
        }
    }
}