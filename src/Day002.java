import java.util.Scanner;

public class Day002 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Day002.hitung(in.nextDouble(),  in.next().charAt(0), in.nextDouble());
  }

  public static void hitung(double angka1, char operator, double angka2){
    switch (operator) {
      case '+':
        System.out.println("Hasil: "+(angka1+angka2));        
        break;
      case '-':
        System.out.println("Hasil: "+(angka1-angka2));
        break;
      case '*':
        System.out.println("Hasil: "+(angka1*angka2));
        break;
      case '/':
        System.out.println("Hasil: "+(angka1/angka2));
        break;
      case '%':
        System.out.println("Hasil: "+(angka1%angka2));
        break;
      default:
        System.out.println("Operator Tidak Diketahui Atau Ada Masalah Saat Menghitung");
        break;
    }
  }
}
