package test;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Clienttest {

     

    public static void main(String[] args) throws IOException {
        // need host and port, we want to connect to the ServerSocket at port 27000
        Socket socket = new Socket("localhost", 40000);
        System.out.println("Connected!");

        // get the output stream from the socket.
        OutputStream outputStream = socket.getOutputStream();
        // create an object output stream from the output stream so we can send an object through it
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // make a bunch of messages to send.

        System.out.println("Sending messages to the ServerSocket");
        CBase testObject = new CBase("test object");
        objectOutputStream.writeObject(testObject);
        objectOutputStream.flush();
        
        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}