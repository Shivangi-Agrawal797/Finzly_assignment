package forloop;

public class countof_evennos_1to25 {
	public static void main(String[] args) {
		int count =0 ;
		for(int i=1; i<=25; i++) {
			if(i % 2 ==0 ) {
				count++ ;
			}
		}
		System.out.println("count of all even nos is = "+ count);
	}

}
