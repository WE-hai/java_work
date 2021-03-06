import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        try (InputStream is = new FileInputStream("有中文的文件.txt")) {
            try (Reader reader = new InputStreamReader(is, "UTF-8")) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int c = reader.read();
                    if (c == -1) {
                        break;
                    }

                    sb.append((char) c);
                }

                System.out.println(sb.toString());
            }
        }
    }
}
