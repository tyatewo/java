public class SampleE {
	public static void main (String[] args) {

	import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int number[] = new int[20];
        String str ="";
		number[0] = 0;


		for(int i = 0; i < number.lenght; i++) {
			number[i] = number[i-1] + 5;//要素0から5ずつnumber[i]に加算
		}

		for(int i = 0; i < 20; i++) {
			System.out.print(number[i]);
		}

		System.out.print("奇数：");
		for(int i = 0; i < 11; i++){
		    if(number[i] % 2 != 0) {
		        str += String.valueOf(number[i]) + ",";
		    }
		}

		    System.out.print(str.substring(0, str.length() - 1));
		    System.out.print("偶数:");
		    str = "";
		    for(int i = 11; i < 20; i++) {
		        str += String.valueOf(number[i]) + ",";
		    }

	}
}





//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる

//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる




//byteはデータの大きさを表すときに使います。
//整数を表したい時は、short,int,longを使いましょう。

// 【整数型のまとめ】
// ・byteはデータの大きさを代入するときに使う
// ・short、int、longの違いは表現できる値の範囲だけ
// ・基本的にはint型を使う