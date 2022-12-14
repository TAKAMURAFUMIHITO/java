// switch文とは、変数の値を条件にして処理を分岐する制御文
// 変数とcaseの値が一致する場合、ブロック内の処理を実行する
// break文が処理されると、それ以降のcase文は評価されずに、switch文の分岐処理を終了する
// 全てcase文の値と一致しない場合、default内のブロックの処理が実行される

public class Switch01 {
  public static void main(String[] args) {
    int val = 2;
    switch (val) {
      case 3:
        System.out.println("よくできました！");
        break;
      case 2:
        System.out.println("ふつうでした！");
        break;
      default:
        System.out.println("がんばろう！");
    }
  }
}