// javaの出力命令はSystem.out.println();

class Main {
  public static void main(String[] args) {

    //この文章をコメントにしてください

    // 「こんにちは、Java」と出力してください
    System.out.println("こんにちは、Java");

  }
}


// ####################################################

// 同じ名前の変数は定義できない

class Main {
  public static void main(String[] args) {
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);

    // 変数numberを9で上書きしてください
    number = 9;

    // 変数numberを出力してください
    System.out.println(number);

    // 変数textを「Java」で上書きしてください
    text = "Java";

    // 変数textを出力してください
    System.out.println(text);

  }
}

// ####################################################

// 自己代入の書き方

class Main {
  public static void main(String[] args) {
    int number = 8;

    // 変数numberに7をかけて、変数numberを上書きしてください
    number = number * 7 ;

    // 変数numberを出力してください
    System.out.println(number);

    // 変数numberの値に1を足して、変数numberを上書きしてください
    number++;

    // 変数numberを出力してください
    System.out.println(number);

  }
}


// ####################################################
// 小数の型はdouble

class Main {
  public static void main(String[] args) {
    // double型の変数number1を定義し、8.5を代入してください。
    double number1 = 8.5;

    // double型の変数number2を定義し、3.4を代入してください。
    double number2 = 3.4;

    // number1にnumber2を足した値を出力してください
    System.out.println(number1 + number2);

    // number1からnumber2を引いた値を出力してください
    System.out.println(number1 - number2);

  }
}


// 5/2をしたとき、int型同士の計算のため、出力は2になる。
// 5.0/２にして、片方でも少数にしたら、出力は2.5と少数で出してくれる。

// 変数がint型の時、処理で、double型にすれば少数で計算してくれるようになる。（キャストするという。）
class Main {
  public static void main(String[] args) {
    int number1 = 7;
    int number2 = 2;
    System.out.println(number1 / number2);

    // number1をdouble型にキャストし、number2で割った値を出力してください
    System.out.println((double)number1 / number2);

  }
}
