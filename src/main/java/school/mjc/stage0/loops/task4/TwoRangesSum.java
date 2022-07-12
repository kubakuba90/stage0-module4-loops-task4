package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {


        int counterSum = 0;
        int counterSkipped = 0;

        if (numberToSkip > lastInRow && lastInRow > 0) {
            System.out.println("number to skip is bugger then the last");
        } else if(lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            for (int i = 0; i < lastInRow; i++) {
                if (i == numberToSkip) {
                    continue;
                }
                counterSum += i;
            }
            for (int i = 0; i <= numberToSkip; i++) {
                counterSkipped += i;
            }
            System.out.println("skipped sum is " +  counterSkipped);
            System.out.println("counted sum is " +  counterSum);
        }





    }
}
