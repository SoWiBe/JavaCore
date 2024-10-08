package chapters.four;

//Беззнаковый сдвиг вправо значения типа byte.
public class ByteUShift {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5',
                '0', '1', '2', '3', '4', '5',
                '0', '1', '2', '3', '4', '5',
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b>>4);
        byte d = (byte) (b>>>4);
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println("b = 0x" + hex[(b>>4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("c = 0x" + hex[(c>>4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("d = 0x" + hex[(d>>4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("e = 0x" + hex[(e>>4) & 0x0f] + hex[e & 0x0f]);
    }
}
