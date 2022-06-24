package Ishikawa;
//15日目 break 文を使おう

public class WhileLoopBreaker {
    public static void main(String[] args) {

        int counter = 0;
        boolean isNotEnd = true;

        while (isNotEnd) {

            counter++;
            System.out.println(counter);

            if (counter == 10) {
                isNotEnd = false;
            } else if (counter == 4)
                break;
            {

            }

        }

        System.out.format("counter = %d %n", counter);

    }
}