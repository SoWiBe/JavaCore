package chapters.four;

//Максирование расширения знака.
public class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '0', '1', '2', '3', '4'
        };
        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b>>4) & 0x0f] + hex[b & 0x0f]);
    }
}
