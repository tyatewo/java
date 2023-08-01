// 4問目
// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる

//考えてみたもの↓
class Main {
  public static void main(String[] args) {
    int[] number = number[i]

    for(int i = 0; i <= number[20]; i++) {
      number[i] = number[i + 5]
    }

    for(int n: number) { //中身全部取り出す。配列の中身をnにしようと思った。
      if(2 % n != 0){ //奇数の時。配列のインデックス番号をiにしようと思った。
        if(number[i] >= 10 && number[i] != 10 ){
          System.out.println(number[i] + ",");
        }else{
          System.out.println(number[i]);
        }
      }else if(2 % n == 0) { //偶数の時
        if(10 < number[i] <= 20 && number[i] !=20 ) { //11~20の時
          System.out.println(number[i] + ",");
        }else{
          System.out.println(number[i]);
        }
      }
  }
}




//修正

int[] numbers = new int[20];

    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 5; //0から5ずつ加算して代入
    }

    for(int i = 0; i < numbers.length; i++){
      if(i <= 10 && numbers[i] % 2 != 0){ //[0]~[10]かつ奇数
          System.out.print(numbers[i]); //書き出す
          if(i < 10) {
              System.out.print(","); //10以下の時カンマを付ける
          }
      } else if(i >= 11 && numbers[i] % 2 == 0){ //[11]~[20]かつ偶数
          System.out.print(numbers[i]); //書き出す
          if(i < 19) {
              System.out.print(","); // 19までカンマつけてね
          }
      }
    }

//出力
//5,7,9,11,13,1516,18,20,22,24





public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    int[] numbers = new int[20];

    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 5; //0から5ずつ加算して代入　numbers[i]にi+5を代入
    }

    for(int i = 0; i < numbers.length; i++){
      if(i <= 10 && numbers[i] % 2 != 0){ //[0]~[10]かつ奇数
          System.out.print(numbers[i]); //書き出す
          if(i == 10) { //追加
              System.out.println(); // 奇数と偶数の間で改行 //追加
          } //追加
          if(i < 10) {
              System.out.print(","); //10以下の時カンマを付ける
          }
      } else if(i >= 11 && numbers[i] % 2 == 0){ //[11]~[20]かつ偶数
          System.out.print(numbers[i]); //書き出す
          if(i < 19) {
              System.out.print(","); // 19までカンマつけてね
          }
      }
    }
    }
}

//出力 改行バージョン
//5,7,9,11,13,15
//16,18,20,22,24


//new int[20]の20は20個の整数の配列を作るっていう意味
//要素の中身とインデックス番号を分けて考えていたけど、
//その考えが必要なのは、今のところ拡張for文の時だけ
//numbers[i]はあくまでも処理された整数を入れておくだけの箱の名前