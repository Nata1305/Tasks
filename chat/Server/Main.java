package Server;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

           public static void main(String[] args) {

        ArrayList<Socket> clients = new ArrayList<>();
        ArrayList <String> nameClients=new ArrayList<>();



               Socket socket =null;
        try {
            ServerSocket serverSocket=new ServerSocket(9988);
            System.out.println("Сервер запущен");
            while (true){
                socket= serverSocket.accept();// ожидает подключения клиента
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                System.out.println("Клиент подключился");
                clients.add(socket);

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            out.writeUTF("Напишите свое имя:");
                            String nameClient = in.readUTF();
                            nameClients.add(nameClient);
                        while (true){

                            System.out.println("Ожидаем сообщение...");
                                 String request = in.readUTF();


                                     for (Socket socket:clients) {
                                         DataOutputStream out =new DataOutputStream(socket.getOutputStream());
                                         out.writeUTF("Клиент "+nameClient+" прислал сообщение "+ request);
                                     }

                             }
                            }catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
