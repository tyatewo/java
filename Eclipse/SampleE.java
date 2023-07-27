public class SampleE {
	public static void main (String[] args) {

		numbers = new int[20];
		numbers[0] = 0;


		for(int i = 0; i < numbers.lenght; i++) {
			numbers[i] = numbers[i-1] + 5;//要素0から5ずつnumber[i]に加算
		}

		for(int i = 0; i < 20; i++) {
			System.out.print(numbers[i]);
		}

	}
}





//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる