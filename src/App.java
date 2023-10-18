public class App {
    public static void main(String[] args) throws Exception {
        display("This is my display.");
    }

    public static void display(String message) {
        int length = message.length();

        String border = "+";

        for(int x = 0; x < length + 2; x++){
            border+="-";
        }

        border+="+";

        System.out.println(border);
        System.out.println("|" + message + "|");
        System.out.println(border);
    }
}
