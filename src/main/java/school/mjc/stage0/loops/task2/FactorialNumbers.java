package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i<=printToInclusive){
            if (i == 0){
                System.out.println(++i);
            }else {
                System.out.println(i);
                i = i*++i;
            }
        }
    }
}
