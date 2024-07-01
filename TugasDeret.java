public class TugasDeret {
  public static void main(String[] args) {
    int sukuPertama = 1;
    int sukuKedua = 2;
    int sukuKetiga;
    int sukuKeempat = sukuKedua;
    int sukuKelima = 4;
    int sukuKeenam;
    System.out.print(sukuPertama + ", " + sukuKedua + ", ");
    for (int i = 3; i <= 6; i++) {
      if (i == 3) {
        sukuKetiga = sukuPertama + sukuKedua;
        System.out.print(sukuKetiga + ", ");
        System.out.print(sukuKeempat + ", ");
      } else if (i == 4) {
        System.out.print(sukuKelima + ", ");
      } else {
        sukuKeenam = sukuKeempat + sukuKelima;
        System.out.print(sukuKeenam + ", ");
        sukuKeempat = sukuKelima;
        sukuKelima = sukuKeenam;
      }
    }
  }
}
    