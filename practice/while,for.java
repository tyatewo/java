// while文

while(条件){
　処理
｝

class Main {
  public static void main(String[] args) {
    int number = 10;

    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
    while(number>0){
      System.out.println(number);
      number--;
    }

  }
}

// ####################################################

// for文
// for文を用いて、10回ループする繰り返し処理を書いてみましょう。

class Main {
  public static void main(String[] args) {
    // for文を用いて、繰り返し処理をつくってください
    for(int i =1; i<=10; i++){
      System.out.println(i+"回目のループです");
    }

  }
}

//breakで処理停止
class Main {
  public static void main(String[] args) {
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if(i%5==0){
        break;
      }

      System.out.println(i);
      i++;
    }

//continueで処理スキップ
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数のとき、処理をスキップしてください
      if(j%3==0) {
        continue;
      }

      System.out.println(j);
    }
  }
}


// ####################################################
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

// 拡張for文
// 配列専用の書き方があるらしい

for(データ型　変数名：配列名）　｛
　処理
｝


class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
    for(String name: names){
      System.out.println("私の名前は"+name+"です");
    }

  }
}


// ###################################################

// 拡張for文
// 配列専用の書き方があるらしい

for(データ型　変数名：配列名）　｛
　処理
｝


class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
    for(String name: names){
      System.out.println("私の名前は"+name+"です");
    }

  }
}