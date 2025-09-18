public class FizzBuzz
{
    /**
     * Print the FizzBuzz sequence for 1..100 to standard output.
     * Rules:
     * - Multiples of 3 -> "Fizz"
     * - Multiples of 5 -> "Buzz"
     * - Multiples of both 3 and 5 -> "FizzBuzz"
     * - Otherwise -> the number itself
     * Output should be 100 whitespace-separated tokens (spaces or newlines are fine).
     */
    public static void main(String[] args)
    {
        // TODO
        int num = 0;
        for (int i=0; i<=100; i++)
        {
            if (num % 15 == 0)
            {
                System.out.println(num + "FizzBuzz");
            }
            else if (num % 3 == 0)
            {
                System.out.println(num + "Fizz");
            }
            else if (num % 5 == 0)
            {
                System.out.println(num + "Buzz");
            }
            else
            {
                System.out.println(num);
            }
            num = num + 1;

        }

    }
}

