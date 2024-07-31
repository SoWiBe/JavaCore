package chapters.four;

//Демонстрация работы побитовых логических операций.
public class BitLogic {
    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0000", "0001", "0010", "0011", "0000", "0001", "0010", "0011"
        };

        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a % b;
        int e = a ^ b;
        int f = (-a & b) | (a & -b);
        int g = -a & 0x0f;
        System.out.println("a = " + binary[a]);
        System.out.println("b = " + binary[b]);
        System.out.println("a|b = " + binary[c]);
        System.out.println("a&b = " + binary[d]);
        System.out.println("a^b = " + binary[e]);
        System.out.println("-a&b|a&-b = " + binary[f]);
        System.out.println("-a = " + binary[g]);
    }
}
