import java.io.*;

public class DataExchangeSimulator {
    public void byteStreamExample(String filename) throws IOException{
        byte[] data ={1,2,3,4,5};
        FileOutputStream fos = new
                FileOutputStream(filename);
                fos.write(data);
                fos.close();
    }

    public void characterStreamExample(String filename, String content) throws IOException{
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}
