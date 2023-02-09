package 입출력스트림예제9;

import java.io.*;

/*
    기본타입 입출력 보조 스트림 :
 */
public class TypeAssistStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("우영우");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("동그라미");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for(int i = 0; i < 2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }
        dis.close();
    }
}
