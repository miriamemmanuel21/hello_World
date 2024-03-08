import java.util.List;


public class OddPosition1 {
    public static void main(String[] args) {

   int[] numbers = {3, 4, 5, 7, 8, 9, 6, 8, 9, 5, 6, 7, 8, 3};

    for (int count = 1; count < numbers.length; count += 2) {
       System.out.println(numbers[count]);

    }

   }
}
      