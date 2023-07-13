import java.util.Arrays;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Statistics\nBased on the double values you " +
                "enter, you will recieve:\nThe Mean, The Mode, The Median, The " +
                "Most\nLet's get started");
        Scanner input = new Scanner(System.in);
        System.out.println("\nHow many numbers will your data set have?");
        int size = input.nextInt();
        double[] statisticsInfo = new double[size];
        for (int i = 0; i < statisticsInfo.length; i++) {
            System.out.println("Enter your " + (i + 1) + " double value");
            Scanner numberInput = new Scanner(System.in);
            double number = numberInput.nextDouble();
            statisticsInfo[i] = number;
        }
        for (int i = 0; i < statisticsInfo.length; i++) {
            System.out.println("The " + (i + 1) + " number is " + statisticsInfo[i]);
        }
        System.out.println();
        System.out.println("The average is " + average(statisticsInfo));
        System.out.println("The median is " + median(statisticsInfo));
        System.out.println("The mode is ");
        ArrayHelper.display(mode(statisticsInfo));
        System.out.println("The most is ");
        ArrayHelper.display(most(statisticsInfo));
    }

    public static double average(double[] values) {
        double sum = 0;
        double mean;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        mean = sum / values.length;
        return mean;
    }

    public static double median(double[] values) {
        values = sort(values);
        if (values.length % 2 == 1) {
            int valuesIndex = (int) values.length / 2;
            return values[valuesIndex];
        } else {
            int valuesIndexLower = (int) values.length / 2;
            int valuesIndexHigher = ((int) values.length / 2) + 1;
            return ((values[valuesIndexLower] + values[valuesIndexHigher]) / 2);
        }
    }

    public static double[] mode(double[] values) {
        int modeIndex = 0;
        double[] mode = {};
        int arrayAdder = 0;
        double[] savedMode = {};
        for (int i = 0; i < values.length; i++) {
            int currentModeIndex = 0;
            for (int j = 0; j < values.length - 1; j++) {
                if (values[i] == values[j + 1]) {
                    currentModeIndex++;
                }
            }
            if (currentModeIndex > modeIndex) {
                modeIndex = currentModeIndex;
                arrayAdder++;
            }
            if (currentModeIndex == modeIndex) {
                mode = new double[1];
                mode[0] = values[i];
                if (!(ArrayHelper.contains(savedMode, mode[0]))) {
                    savedMode = ArrayHelper.merge(savedMode, mode);
                }
            }
        }
        return savedMode;
    }

    public static double[] most(double[] values) {
        double[] combined = {0};
        double[] savedCombined = {};
        double average = average(values);
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= average) {
                combined = new double[1];
                combined[0] = values[i];
                if (!(ArrayHelper.contains(savedCombined, combined[0]))) {
                    savedCombined = ArrayHelper.merge(combined, savedCombined);
                }
            }
        }
        return savedCombined;
    }
    // returns a sorted copy of values
    // does not modify values
    public static double[] sort(double[] values) {
        double[] temp = values.clone();
        Arrays.sort(temp);
        return temp;
    }
}