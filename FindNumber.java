package TEST1;
import java.util.Scanner;
public class FindNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array>> ");
        
        int size = input.nextInt();
        int[] numbers = new int[size];
	
        System.out.println("Enter the elements of the array>> ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int keyNumber = input.nextInt();

        int count = 0;
        for (int i =0; i<numbers.length;i++) {
            if (numbers[i] == keyNumber) {
                count++;
            }
           
        }

        if (count > 0) {
            System.out.println(keyNumber + " is found " + count + " times.");
        } else {
            System.out.println(keyNumber + " is not found");
        }

       
    }

}


