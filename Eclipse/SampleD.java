public class SampleD {
	public static void main (String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
			if(number[i] != 10) {
				System.out.print(",");
			}
		}
	}
}

//1〜10までの整数をカンマ区切りで横並びで表示させる
//（10にはカンマをつけない）
//System.out.printlnは改行を含む出力
//System.out.printは改行は含まない


//System.out.println(number[i]);
//if(number[i] != 10) {
//	System.out.println(",");
//}

//これだと出力は
//1
//,
//2
//,
//3
//,
//になる

//System.out.print(number[i]);
//if(number[i] != 10) {
//	System.out.println(",");
//}

//これだと
//1,2,3,と改行されずに続く

//i < number.length
//で=<じゃなくて<にする理由は、
//配列の数えが０始まりだから。