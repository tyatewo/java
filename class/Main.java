// クラスについて
// 1つのクラスにメソッドが多いと管理が大変。
// mainクラス（実行用）とPersonクラス（ロジック用）に分けてやる。


Main.javaファイル

class Main {
  public static void main(String[] args) {
    Person.hello();
  }
}
