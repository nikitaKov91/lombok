package learn.lombok.cleanup;

import lombok.Cleanup;

import java.io.*;

public class CleanupExample {

    public static void example0(String[] args) throws IOException {
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }

    static class CoolBar {

        public void dispose() {
            System.out.println("clean up");
        }

    }

    public static void example1() throws IOException {
        @Cleanup("dispose") CoolBar coolBar = new CoolBar();
    }

    public static void main(String[] args) throws IOException {
        example0(args);
        example1();
    }

}
