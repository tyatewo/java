 // for文を用いて、「私の名前は◯◯です」と出力してください
 class Main {
   public static void main (String[], args) {
     String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
   }

   for(int i = 0; i < names.length; i++){
     System.out.println("私の名前は"+names[i]+"です。");
   }

 }


 // 配列にある奇数の和と偶数の和を求める

// 配列にある奇数の和と偶数の和を求める

class Main {
  public static void main(String[] args) {
    int[] numbers = {1, 4, 6, 9, 13, 16};


    int oddSum = 0;
    int evenSum = 0;

    for(int number: numbers) {
      if(number%2==0) {
        evenSum+=number;
      }else{
        oddSum+=number;
      }
    }

    System.out.println("奇数の和は"+oddSum+"です");
    System.out.println("偶数の和は"+evenSum+"です");
  }
}


// 配列にある奇数の和と偶数の和を求める

class Main {
  public static void main(String[] args) {
    int[] number = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;

    for(int number: numbers) {
      if(number%2==0) {
        oddSum += number;
      }else{
        evenSum += number;
      }
    }

    System.out.println("奇数の和は"+oddSum+"です");
    System.out.println("偶数の和は"+evenSum+"です");
  }
}

// 奇数の和は26です
// 偶数の和は23です

// for(int number: numbers)これは拡張for文で、
// こうすることによって、配列の中身の要素を取り出してループすることだ出来る。
// for(int 配列の中身の要素: 配列名)
// int[] number = {1, 4, 6, 9, 13, 16};この場合
// 1, 4, 6, 9, 13, 16の数値を取り出してくる。

// 通常の書き方for(int i = 0; i<n; i++)これは配列の中身の数を取り出すことになる。
// int[] number = {1, 4, 6, 9, 13, 16};この場合インデックス０から始まって、
// インデックス５までの0,1,2,3,4,5の数値を取り出してくる。
