
public class NewCaesar {
    public static void main(String[] args) {

        String str = "abc_xyz";

        System.out.println(NewCaesar.encode(str, 3));
        System.out.println(NewCaesar.decode(NewCaesar.encode(str, 3), 3));
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static String encode(String enc, int offset) {
//        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}