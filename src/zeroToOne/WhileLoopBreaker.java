package zeroToOne;

public class WhileLoopBreaker {

    public static void main(String[] args) {

        int counter = 0;
        boolean isNotEnd = true;

        while (isNotEnd) {

            counter++;
            System.out.println(counter);

            if (counter == 4) {
                break;
            }

            if (counter == 10) {
                isNotEnd = false;
            }
        }

        System.out.format("counter = %d %n", counter);
    }
}