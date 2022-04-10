//Дана строка. Преобразовать в ней все прописные латинские буквы в строчные

public class two {
    public static void main(final String[] args) {
        for (char i = 0x41; i < 0x5a; i++) {
            System.out.printf(" %s ", i);
        }

        System.out.println();

        for (char i = 0x41; i < 0x5a; i++) {
            System.out.printf("%h ", i);
        }

        System.out.println("\n");

        for (char i = 0x61; i < 0x7a; i++) {
            System.out.printf(" %s ", i);
        }

        System.out.println();

        for (char i = 0x61; i < 0x7a; i++) {
            System.out.printf("%h ", i);
        }
    }
}