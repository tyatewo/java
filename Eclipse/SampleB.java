public class SampleB {
	public static void main (String[] args) {
		int sum = number();

		System.out.println("偶数の和は"+sum);
	}

	public static int number() {

		int sum = 0;

		for(int i = 0; i <= 10; i++) {
			if(i%2==0) {
				sum += i;
			}
		}

		return sum;
	}
}

//1-10までの間にある偶数の和を出力