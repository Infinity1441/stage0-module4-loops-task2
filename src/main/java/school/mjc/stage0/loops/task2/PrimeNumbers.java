package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i, number = 1, count;

        while(number <= printToInclusive)
        {
            count = 0;
            i = 2;
            while(i <= number/2 )
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && number != 1 )
            {
                System.out.println(number);
            }
            number++;
        }
    }
}