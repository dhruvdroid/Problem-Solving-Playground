package problemSolving;

public class Programs {


    public static void main(String[] args) {
        switch (2) {
            case 1:
                System.out.println("Factorial is = " + factorial(5));
                break;
            case 2:
                System.out.println("Factorial is = " + factorialRecursive(5));
                break;
        }
    }

    private static int factorial(int num) {
        int fact = num;

        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 2;
        }

        while (num > 1) {
            System.out.println("Num is = " + num);
            fact = fact * (num - 1);
            num--;
        }

        return fact;
    }

    private static int factorialRecursive(int num) {
        System.out.println("factorialRecursive = " + num);

        if (num == 2) {
            return 2;
        }

        return num * factorialRecursive(num - 1);
    }
}
