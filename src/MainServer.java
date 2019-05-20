import java.io.IOException;

public class MainServer {
	private static final int PORT = 25000;

	public static void main(String[] args) throws IOException {
		new Server(PORT);
	}
}
