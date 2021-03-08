import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerSide {

    public static void main(String[] args) {
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8181))
        {

            System.out.println("Server start");
            socket = serverSocket.accept();
            System.out.println("Client is ready");
            DataInputStream dis =  new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String clientMessage = dis.readUTF();
                System.out.println(clientMessage);
                if (clientMessage.equals("/end")) {
                    break;
                }
                dos.writeUTF("Эхо: " + clientMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void cloeConnection(Socket s, DataInputStream dis, DataOutputStream dos) throws IOException {
        s.close();
        dis.close();
        dos.flush();
        dos.close();
    }

}


