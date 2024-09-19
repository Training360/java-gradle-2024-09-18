package training;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setName("John Doe");

        System.out.println(new Main().sayHello("John Doe 3"));

        new Main().writeCodeToFile("John Doe", Path.of("barcode.png"));
    }

    public String sayHello(String name) {
        return "Hello %s!".formatted(name);
    }

    @SneakyThrows
    public void writeCodeToFile(String text, Path path) {
        BitMatrix matrix = null;
        matrix = new MultiFormatWriter()
                .encode(text, BarcodeFormat.QR_CODE, 200, 200);
        MatrixToImageWriter.writeToPath(matrix, "png", path);
    }
}