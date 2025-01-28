
public class Armstrong {
    public static void main(String[] args) {
        int lower= 1;
        int upper = 1000;

        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        Armstrong(lower, upper);
    }

    public static void Armstrong(int lower, int upper) {
        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}


