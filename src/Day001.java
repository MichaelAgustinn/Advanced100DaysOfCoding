public class Day001 {
    public static void main(String[] args) {
        System.out.println(loop(1, 5));
    }

    public static String loop(int mulai, int selesai) {
        if (mulai > selesai) {
            return "";
        }
        return mulai + (mulai < selesai ? " " + loop(mulai + 1, selesai) : "");
    }

}
