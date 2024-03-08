import java.util.List;

public class OddPositions {
public static void main(String[] args){
	
	int [] numbers = {3,4,5,7,8,9,6,8,9,5,6,7,8,3}; 

		
	int count = 0; 
	while(count != numbers.length){  
	int number= numbers[count];
	
	if (count % 2 != 0){
		System.out.println(number);
      }
	count++;
}

  }


  }
  

