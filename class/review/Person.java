class Person {
 public static void printData(String firstName, String lastName, int age, double height, double weight) {
   System.out.println("名前は"+fullName(firstName, lastName)+"です");
   System.out.println("年齢は"+age+"歳です");
    if(age>=20){
      System.out.println("成年者です");
    }else{
      System.out.println("未成年者です");
    }

    System.out.println("身長は"+height+"mです");

    System.out.println("体重は"+weight+"kgです");

    //入力にbmiという引数がない（入力しようがない）から、計算結果をここでbmiという引数を設定してあげている。
    //（）の中身はbmiの計算に必要な材料を持たせてあげる
    double bmi = bmi(height, weight);
    System.out.println("BMIは"+Math.round(bmi)+"です");

    //（）の中身はisHealthyが持ってる材料を持たせてあげる
    //isHealthy(bmi)はtrueという情報を持っている。
    if(isHealthy(bmi)){
      System.out.println("健康です");
    }else{
      System.out.println("健康ではありません");
    }

  }

  public static String fullName(String firstName, String lastName){
    return firstName+" "+lastName;
  }

  public static double bmi(double height, double weight){
    return weight/height/height;
  }

  public static boolean isHealthy(double bmi) {
    return bmi>=18.5 && bmi<25.0;
  }
}