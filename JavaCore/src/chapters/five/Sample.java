package chapters.five;

public class Sample {
    public static void main(String[] args) {
        int a, b;

        b = 4;
        for (int i = b; i < b; i++) {
            System.out.println("i = " + i);
            System.out.println("b = " + b);
            b--;
        }
    }
}

