// 配列
// String[] name= ...
// int[] age= ...
// とかく。


class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

    // for文を用いて、「私の名前は◯◯です」と出力してください
    for(int i = 0; i<names.length; i++){
      System.out.println("私の名前は"+names[i]+"です");
    }

  }
}


// ####################################################


// 配列にある奇数の和と偶数の和を求める

class Main {
  public static void main(String[] args) {
    // 変数numbersに、与えられた数字の配列を代入してください
    int[] numbers = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;

    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
    for(int number: numbers){
      if(number%2==0){
        evenSum+=number;
      }else{
        oddSum+=number;
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}
