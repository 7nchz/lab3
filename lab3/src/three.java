//Дан символ C и строки S, S0. Перед каждым вхождением символа C в строку S вставить строку S0.

public class three {
    public static void main(String[] args) {
        char c = 'o';
        String s = "Hello";
        String s0 = "oops";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (s.charAt(i) == c) System.out.print(s0);
        }

    }
}
