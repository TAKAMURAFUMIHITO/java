// if文とは、指定した条件により処理を分岐する制御文

public class If01 {
  public static void main(String[] args) {
    int number = 7;
    if (number < 5) {
      System.out.println(number + "は5未満です。");
    }
    if (number < 10) {
      System.out.println(number + "は10未満です。");
    }
    if (number < 15) {
      System.out.println(number + "は15未満です。");
    }
  }
}