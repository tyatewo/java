public class SampleA {
	public static void main(String[] args) throws Exception {
		 int count = number();
		 System.out.println("偶数の数は"+count+"個です");
	}

	public static int number() {

		int count = 0;

		for(int i = 0; i <=10; i++) {
			if(i % 2 == 0) {
				count ++;
			}
		}
		return count;

	}
}

//１-１０までの中にある偶数の数を数える