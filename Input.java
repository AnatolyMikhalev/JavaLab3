import java.io.*;

public class Input {
    IReaderReciever iEv;

    Input(IReaderReciever iEv) {
        this.iEv = iEv;
    }

    public String[] Read(String filename) { //TODO: чтение всего файла
        //Чтение из файла -------------------------------------------------------
        File file = new File(filename);
        StringBuilder sb = new StringBuilder();

        if (file.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                String s;
                Output.InitPrintWriter(br.readLine());
                while ((s = br.readLine()) != null) {//построчное чтение
                    genEv(s);
                    sb.append(s);
                    sb.append("\n");
                }
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
        return sb.toString().split("\n");
    }

    public void genEv(String arg) {
        iEv.Handler(arg);
    }
}
