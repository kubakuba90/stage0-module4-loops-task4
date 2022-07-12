package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int counter = 3;
        for (int i =1; i <= lastPrinted; i++) {
            if (i==counter) {
                counter += 3;
                continue;
            }
            System.out.println(i);
        }

    }
}
