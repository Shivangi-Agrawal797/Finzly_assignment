package forloop;

public class sumof_oddandeven_nos {

	public static void main(String[] args) {
		
		int sum =0;
		for(int i = 0 ; i<= 50; i++) {
			if(i%2 == 0 || i%2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of odd and even nos is =  " + sum);
	}
}
