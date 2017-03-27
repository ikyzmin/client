package proxy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by Илья on 27.03.2017.
 */
public class Proxy {

    public float request(float a, float b) throws IOException {
        String address = "127.0.0.1";
        Socket socket = new Socket(address, 5000);
        DataOutputStream toServerStream = new DataOutputStream(socket.getOutputStream());
        DataInputStream fromServerStream = new DataInputStream(socket.getInputStream());
        toServerStream.writeFloat(a);
        toServerStream.writeFloat(b);
        float result = fromServerStream.readFloat();
        toServerStream.close();
        fromServerStream.close();
        socket.close();
        return result;
    }
}
