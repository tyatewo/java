public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in); //スキャン 入力したものを入れとく箱 = 新規スキャン（入力内容）;
        int A, B; //それぞれ事前に型を指定しておく
        String op; //それぞれ事前に型を指定しておく

        A = scanner.nextInt(); //スキャン.次のものは整数型です（）数字打たれるまで処理停止
        op = scanner.next(); //スキャン.次のものは文字列型です（）文字打たれるまで処理停止
        B = scanner.nextInt(); //スキャン.次のものは整数型です（）数字打たれるまで処理停止

        if(op.equals("+")) { //(op == "+")は文字列を見る時には適さない。文字列の比較する時はequals()メソッドだとopの入力した内容を見てくれる。
            System.out.println(A+B);
        }else if(op.equals("-")) {
            System.out.println(A-B);
        }else if(op.equals("*")) {
            System.out.println(A*B);
        }else if(op.equals("/") && B!= 0) {
            System.out.println(A/B);
        }else{
            System.out.println("error");
        }


        }
    }



// javaの標準入力はScanner（クラス） scanner（オブジェクト） = new Scanner(System.in);
// Scanner（スキャンができる） scanner（スキャンしたものを入れとく箱） = new Scanner(System.in)新規スキャン（引数入力されたもの材料）;
//