public class SampleC {
	public static void main(String[] args) {
		int[] result = number();

		System.out.println("偶数の数は"+result[0]);
		System.out.println("偶数の和は"+result[1]);
	}

	public static int[] number() {
		int count = 0;
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				count++;
				sum+= i;
			}
		}

		int[] result = {count, sum};
		return result;
	}
}

//count++;は数を数えるために使い、偶数の数を1ずつ増やす
//sum+=;は合計を計算するために使い、偶数の値をsumに加算する