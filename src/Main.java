import proxy.Proxy;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Илья on 27.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        try {
            System.out.print(proxy.request(4.5f, 3.2f));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
