package learn.lombok.sneakyThrows;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

public class SneakyThrowsExample implements Runnable {

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    public void run() {
        System.out.println(utf8ToString("Sneaky".getBytes()));
        throw new Throwable();
    }

    public static void main(String[] args) {
        new Thread(new SneakyThrowsExample())
                .start();
    }

}