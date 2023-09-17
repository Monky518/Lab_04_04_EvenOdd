public class Main
{
    public static void main(String[] args)
    {
        //A program that takes an integer (java int) and uses the modulo function to indicate if the number is odd or even
        //Since we can’t do input in java yet, just hard code the value for the input as a variable instantiation

        int userNumberEven = 42;
        int userNumberOdd = 37;
        int moduloCheck = 0;

        moduloCheck = userNumberEven % 2;
        System.out.println(moduloCheck);

        if (moduloCheck == 0)
        {
            //even number
            System.out.println("User number is even!");
        }
        else
        {
            System.out.println("User number is odd!");
        }

        moduloCheck = 0;
        moduloCheck = userNumberOdd % 2;
        System.out.println(moduloCheck);

        if (moduloCheck == 0)
        {
            //even number
            System.out.println("User number is even!");
        }
        else
        {
            System.out.println("User number is odd!");
        }
    }
}