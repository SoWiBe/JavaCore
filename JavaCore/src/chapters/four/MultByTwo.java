package chapters.four;

//Сдвиг влево как быстрый способ умножения на 2.
public class MultByTwo {
    public static void main(String[] args) {
        int num = 0xffffffe;
        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
