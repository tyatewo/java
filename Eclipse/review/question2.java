// 2問目
// 1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる

class Main {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    int count = 0;
    int sum = 0;

    for(int i = 0; i < numbers.length; i++) {
      if(numbers[i]%2==0){
        count++;
        sum+= numbers[i];
      }
    }

    System.out.println("偶数の数は"+count+"です");
    System.out.println("偶数の合計は"+sum+"です");
  }
}

// for文の中でint countやint sumを宣言しちゃいけない理由
// ループが１回回るたびに０にリセットされてしまうから。