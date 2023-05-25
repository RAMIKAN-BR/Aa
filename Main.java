import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            int input = System.in.read();
            if (input == -1) {
                break;
            }

            char c = (char) input;

            if (c == 'a') {
                System.out.print('A');
            } else {
                System.out.print(c);
            }
        }
    }
}