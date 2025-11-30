public class CountOFDigit{

	public static void main(String[] args){
	
	int number = 1234;
	System.out.println(digit(number));
	}
	public static int digit(int num){
	int count = 0;
	while(num != 0){
		count++;
	   num = num/=10;
	}
	return count;
	}
}
	