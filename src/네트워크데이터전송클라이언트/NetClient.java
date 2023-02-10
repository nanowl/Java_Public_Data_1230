package 네트워크데이터전송클라이언트;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class NetClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        System.out.println("[연결 요청]");
        socket.connect(new InetSocketAddress("localhost", 5001));
        System.out.println("[연결 성공]");

        byte[] bytes = null;
        String message = null;

        OutputStream os = socket.getOutputStream(); // 바이트 기반의 출력스트림
        message = "Hello Server";
        bytes = message.getBytes("UTF-8");
        os.write(bytes);
        os.flush();
        System.out.println("[데이터 보내기 성공]");

        InputStream is = socket.getInputStream(); // 바이트 기반의 입력스트림의 최상위클래스
        bytes = new byte[100];
        int readByteCount = is.read(bytes);
        message = new String(bytes, 0, readByteCount, "UTF-8");
        os.close();
        is.close();
        socket.close();
    }
}
