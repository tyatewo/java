class Person {
  public static void hello() {
    // "Hello World"を、"Hello Java"に書き換えてください
    System.out.println("Hello Java");
  }
}



// この時mainクラスの方でメソッドを呼び出すときは、
// Person.hello();とする
// クラス名.メソッド名();にする

// ####################################################

public class Main {
  public static void main(String[] args) {
    // printDataメソッドとfullNameメソッドの呼び出しを書き換えてください
    Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
    Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }
}

// Personクラスから呼び出すときは、
// Person.printData
// Person.fullNameという風に書く。


// ####################################################

// java.lang.Mathを読み込んでください
import java.lang.Math;

 // Mathクラスのroundメソッドを用いて、BMIを四捨五入して出力するようにしてください
    System.out.println("BMIは" + Math.round(bmi) + "です");

// Mathをインポートして、使うときは Math.round(引数) でかく。

