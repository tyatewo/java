// スキャナーについて
// scanner.next()でコンソールに入力されたものを受け取ることができる。
// その為にはまず、スキャナーを作って、スキャナーを初期化する
// 　→Scanner scanner = new Scanner(System.in);
// 文字列を表示して、
// 　→System.out.print("名前： ");
// scanner.next();で受け取ったものをString型のname変数に代入する
// 　→String name = scanner.next();
// 「こんにちは◯◯さん」と出力する
// 　→System.out.println("こんにちは"+name+"さん");



// java.util.Scannerを読み込んでください
import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前： ");

    // 変数nameを定義し、コンソールから文字列を受け取って代入してください
    String name = scanner.next();

    // 「こんにちは◯◯さん」と出力してください
    System.out.println("こんにちは"+name+"さん");
  }
}


// ####################################################

// スキャナーを使うにはimport java.util.Scanner;
// で取り入れないといけない。

// 文字列受け取り　scanner.next();
// 整数受け取り　　scanner.nextInt();
// 小数受け取り　　scanner.nextDouble();

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前：");
    // 文字列の入力を受け取ってください
    String firstName = scanner.next();

    System.out.print("名字：");
    // 文字列の入力を受け取ってください
    String lastName = scanner.next();

    System.out.print("年齢：");
    // 整数の入力を受け取ってください
    int age = scanner.nextInt();

    System.out.print("身長(m)：");
    // 小数の入力を受け取ってください
    double height = scanner.nextDouble();

    System.out.print("体重(kg)：");
    // 小数の入力を受け取ってください
    double weight = scanner.nextDouble();

    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }
}
