public class Main {
    public static void main(String[] args) {
        MagicBox <String> magicBox = new MagicBox<String>(3);
        MagicBox <Integer> magicBox1 = new MagicBox<Integer>(3);
        magicBox.add("X");
        magicBox.add("Y");
        magicBox.add("U");
        magicBox1.add(5);
        magicBox1.add(4);
        magicBox1.add(3);
        magicBox.pick();
        magicBox1.pick();



    }

}
