import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("何人分の情報を入力しますか：");
    int n = scanner.nextInt();

    //最高年齢を管理するための変数maxAgeを用意し、初期値を0に設定します。
    int maxAge = 0;
    //合計年齢を管理するための変数totalAgeを用意し、初期値を0に設定します。
    int totalAge = 0;

    for(int i = 0; i < n; i++){

      System.out.println(i + 1 + "人目");

      System.out.print("名前：");
      String firstName = scanner.next();

      System.out.print("名字：");
      String lastName = scanner.next();

      System.out.print("年齢：");
      int age = scanner.nextInt();

      System.out.print("身長(m)：");
      double height = scanner.nextDouble();

      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();

      Person.printData(firstName, lastName, age, height, weight);
      //入力されたデータがこの並びで来るよって指示してあげる。
      //そうするとprintDataのほうでも同じ並びで引数を設定してあげるとデータが渡される。


      //繰り返し処理の中で、受け取った年齢（age）とその時点での最高年齢を比較するif文を作ります。
      //のif文の中で、受け取った年齢（age）のほうが大きい場合は最高年齢を受け取った値に更新します。
      if(age > maxAge) {
       maxAge = age;
     }
     //繰り返し処理の中で、受け取った年齢（age）を合計年齢に足します。
     totalAge += age;

    }
    //繰り返し文の後表示
    System.out.println("最高年齢は"+maxAge+"歳です");
    //合計年齢を人数で割る
    System.out.println("平均年齢は"+totalAge/n+"歳です");
  }
}