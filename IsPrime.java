package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 14;
		int flag = 0;
		for (int i = 2; i < input-1; i++) {

			if (input%i ==0 ) {

				flag = 1;
				break;

			} 

		}
		if (flag == 0) {
			System.out.println("Prime");
			
		} else {
			System.out.println("Not Prime");
		}

	}

}
