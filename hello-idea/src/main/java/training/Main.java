package training;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        new Main().writeCodeToFile("John Doe", Path.of("barcode.png"));
    }

    public void writeCodeToFile(String text, Path path) {
        BitMatrix matrix = null;
        try {
            matrix = new MultiFormatWriter()
                    .encode(text, BarcodeFormat.QR_CODE, 200, 200);
            MatrixToImageWriter.writeToPath(matrix, "png", path);
        } catch (WriterException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}