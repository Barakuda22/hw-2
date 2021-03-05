public class NameEncoderDecoder {
    public static void main(String[] args) {
        NameEncoderDecoder first = new NameEncoderDecoder();
        System.out.println(first.encode("vasiliy"));
        System.out.println(first.decode("NOTFORYOUvasiliyYESNOTFORYOU"));
    }

    public String encode(String name) {
        String secondName = name.replace("e", "1").replace("u", "2").replace("i", "3")
                .replace("o", "4").replace("a", "5");
        return "NOTFORYOU" + secondName + "YESNOTFORYOU";
    }

    public String decode(String name) {
        name = name.replace("NOTFORYOU", "").replace("YES", "").replace("1", "e")
                .replace("2", "u").replace("3", "i").replace("4", "o")
                .replace("5", "a");
        return name;
    }
}
