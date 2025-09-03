package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int rounded = (numberToBeRounded - (int) numberToBeRounded) * 10 >= 5?
                (int) numberToBeRounded + 1 : (int) numberToBeRounded;
        System.out.println(rounded);
    }
}
