// 3問目
// 1〜10までの整数をカンマ区切りで横並びで表示させる
// （10にはカンマをつけない）

class Main {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    for(int number: numbers) {
      if(number!=10) {
        System.out.print(number+",");
      }else{
        System.out.print(number);
      }
    }

  }
}
