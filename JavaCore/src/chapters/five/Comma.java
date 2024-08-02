package chapters.five;

//Использование запятой
public class Comma {
    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 2; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
