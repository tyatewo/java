// public static void　メソッド名（引数）は
// public はどこでもメソッドが使える再利用可にする
// static　はメソッド呼び出してくれる
// void　　は処理を行うだけのテンプだけ渡すよっていう意味


class Main {
  public static void main(String[] args) {
    // printDataメソッドを呼び出してください
    printData();

  }

  // printDataメソッドを定義してください
  public static void printData() {
    System.out.println("私の名前はKate Jonesです");
  }

}







// ####################################################
// 引数について
// printDataに情報が入っていて、
// 情報を受け取れるように
// メソッド名（引数）
// printData(String name)
// (String（データ型） name（仮引数）)とかく

class Main {
  public static void main(String[] args) {
    // 引数に「Kate Jones」を渡してください
    printData("Kate Jones");

    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith");

  }

  // 引数を受け取るようにしてください
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は"+name+"です");

  }
}



// ####################################################
// 複数の引数の書き方
// printData(String name, int age)
// 渡すほうも名前、年齢の順で渡さないといけない。

class Main {
  public static void main(String[] args) {
    // それぞれ年齢に関する引数を追加してください
    printData("Kate Jones", 27);
    printData("John Christopher Smith", 65);
  }

  // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は"+age+"歳です");

  }
}

// ####################################################

// 処理の流れ
// fullName("Kate","Jones");って来て、
// まずfullNameメソッドに行って、
// 「Kate　Jones」って加工してもらって、
// 「Kate　Jones」をname変数に代入して、
// name変数を使ってるprintDataメソッドで使われていて、
// System.out.println("私の名前は" + name + "です");で使われる。



class Main {
  public static void main(String[] args) {
    // fullNameメソッドの結果を変数nameに代入してください
    String name = fullName("Kate","Jones");

    // printDataの引数を書き換えてください
    printData(name, 27);

    // こちらは書き換えないでください
    printData("John Christopher Smith", 65);

  }

  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

}

// ####################################################

// printData(fullName("John", "Christopher", "Smith"), 65);
// 引数の中に引数を入れる。こういう書き方もできる↑
// fullNameに引数を渡す


class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27);

    // fullNameメソッドを用いて、printDataの引数を書き換えてください
    printData(fullName("John", "Christopher", "Smith"), 65);
  }

  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

}

// ####################################################

class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");

    // 変数bmiに、bmiメソッドを用いてBMIを代入してください
    double bmi = bmi(height, weight);
    //気が付いたこと）heightとweightをbmiの数値としてくくってあげないといけない。

    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
    System.out.println("BMIは"+bmi+"です");

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  // bmiメソッドを定義してください
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

}

// ####################################################

class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    double bmi = bmi(height, weight);
    System.out.println("BMIは" + bmi + "です");

    // isHealthyメソッドの結果で条件分岐を行ってください
    if(isHealthy(bmi)) {
      System.out.println("健康です");
    }else{
      System.out.println("健康ではありません");
    }

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  // isHealthyメソッドを定義してください
  public static boolean isHealthy(double bmi) {
        return bmi>= 18.5 && bmi<25.0;
  }

}


//boolean型はtrueかfolseを返すものだからifは使わなくても大丈夫

