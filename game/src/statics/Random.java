package statics;

public class Random {

    public static int randomWholeNumber(int maxValue) {
        return (int) Math.floor(Math.random() * maxValue);
    }

    public static int randomWholeNumberPlusOne(int maxValue) {
        return (int) Math.floor((Math.random() * maxValue) + 1);
    }

    public static double random() {
        return Math.random();
    }

}
