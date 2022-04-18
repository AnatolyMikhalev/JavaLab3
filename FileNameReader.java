import java.util.Scanner;

public class FileNameReader {
    IFileNameReaderReciever iEv;
    Scanner scanner;
    String filename;

    FileNameReader(FileNameReaderReciever iEv){
        this.iEv = iEv;
    }

    public String GetFileName(){
        genEv();
        scanner = new Scanner(System.in);
        filename = scanner.next();

        return filename;
    }

    public void genEv(){
        iEv.Handler();
    }
}
