package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;

        while (i <= power){
            i++;
            System.out.println(Math.pow(2, i));
        }
    }
}
