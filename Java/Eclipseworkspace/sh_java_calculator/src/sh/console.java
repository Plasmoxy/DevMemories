package sh;
import java.io.*;

public class console {
	public static ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cls");
	
	public static void clear() throws IOException{
	
    builder.redirectErrorStream(true);
    builder.start();
    //BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	}
}
