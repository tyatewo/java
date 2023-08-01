// 1問目
// 1〜10までの数字のうち偶数のみを昇順で表示させる
class Main {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    for(int i = 0; i <= 10; i++) {
      if(i%2==0){
        System.out.println(i);
      }
    }
  }
}


// Javaエラー発見：全角の空白文字（'\u3000'）
