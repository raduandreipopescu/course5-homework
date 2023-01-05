import java.util.Arrays;
import java.util.Random;

public class Course5Homework {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 10, 100};
        int controlNumber = 5;
        int donationsTarget = 123;
        int maxNumberOfDonations = 5;
        String initialString = "We are collecting donations. The target is set really low. At least we hope for the minimum number of donations.";

        System.out.println("1) ");
        System.out.println("The sum of int array numbers is: " + intArraySum(intArray));

        System.out.println("2) ");
        System.out.println("The number of odd numbers is: " + countOddNumbers(intArray));

        System.out.println("3) ");
        System.out.println(Arrays.toString(returnLargerThanControl(intArray, controlNumber)));

        System.out.println("4) ");
        receivingDonations(donationsTarget);

        System.out.println("5) ");
        receivingLimitedDonations(donationsTarget, maxNumberOfDonations);

        System.out.println("6) ");
        splitPhrase(initialString);
    }

    private static void splitPhrase(String initialString) {
        String[] splittedString = initialString.split("\\.");
        for (String partOfSplittedString : splittedString) {
            System.out.println(partOfSplittedString);
        }
    }

    private static void receivingLimitedDonations(int donationsTarget, int maxNumberOfDonations) {
        int donatedAmount = 0;
        int numberOfDonations = 0;
        Random donation = new Random();

        while (donatedAmount < donationsTarget && numberOfDonations < maxNumberOfDonations) {
            donatedAmount += donation.nextInt(donationsTarget);
            numberOfDonations++;
        }
        System.out.printf("Successfully achieved the donations target of %d or %d donations, and collected %d from %d donations %n", donationsTarget, maxNumberOfDonations, donatedAmount, numberOfDonations);
    }

    private static void receivingDonations(int donationsTarget) {
        int donatedAmount = 0;
        Random donation = new Random();

        while (donatedAmount < donationsTarget) {
            donatedAmount += donation.nextInt(donationsTarget);
        }
        System.out.printf("Successfully passed the donation target of %d by collecting %d %n", donationsTarget, donatedAmount);
    }

    private static int[] returnLargerThanControl(int[] intArray, int controlNumber) {
        int returnedArrayLength = 0;
        for (int arrayElement : intArray) {
            if (arrayElement > controlNumber) {
                returnedArrayLength++;
            }
        }
        int[] returnedArray = new int[returnedArrayLength];
        int returnedArrayIndex = 0;
        for (int arrayElement : intArray) {
            if (arrayElement > controlNumber) {
                returnedArray[returnedArrayIndex] = arrayElement;
                returnedArrayIndex++;
            }
        }
        return returnedArray;
    }

    private static int countOddNumbers(int[] intArray) {
        int oddNumbersCounter = 0;
        for (int arrayElement : intArray) {
            if (arrayElement % 2 != 0) {
                oddNumbersCounter++;
            }
        }
        return oddNumbersCounter;
    }

    private static int intArraySum(int[] intArray) {
        int intArraySum = 0;
        for (int arrayElement : intArray) {
            intArraySum += arrayElement;
        }
        return intArraySum;
    }
}
