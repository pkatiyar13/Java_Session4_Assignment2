
public class Assignment2 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Elements of array");
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
		numbers[3]=3000;
		System.out.println("Elements of modified array");
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
	}
}
