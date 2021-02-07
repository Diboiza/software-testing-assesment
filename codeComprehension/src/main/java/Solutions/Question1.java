package Solutions;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 * All Questions are answered with this solution
 */
public class Question1
{
    public void minMax(int[] arr)
    {
        //get the sum of the first 4 value of the array
        int min = IntStream.of(arr).limit(4).sum();

        //copy the last 4 values of the array to a new array
        int[] newArr = Arrays.copyOfRange(arr,1, arr.length);

        //get the sum of the new array
        int max = IntStream.of(newArr).sum();

        //use string format to print both Min and Max in a single line
        String msg = String.format("%s %s", min, max);
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        int[] arr = new int[5];
        Question1 question1 = new Question1();
        System.out.println("Please enter 5 numbers:");
        InputStream numbers = System.in;
        Scanner scanner = new Scanner(numbers);
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i <5 ; i++)
        {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        question1.minMax(arr);

    }
}
