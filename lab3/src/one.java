//Дан символ C. Вывести два символа, первый из которых предшествует символу C в кодовой таблице, а второй следует за символом C.

public class one {
    public static void main(String[] args) {
        char charC = 'c';
        System.out.printf("Символ \'%c\' перед ним %c после него %c", charC, (char) (charC - 1), (char) (charC + 1));
    }
}
