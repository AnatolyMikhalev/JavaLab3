import java.io.*;

public class Output {
    IOutputReciever iEv;

    int numEven = 0;
    int numOdd = 0;

    static File logfile;
    static boolean checkinitRW = false;
    static PrintWriter pw;

    Output(OutputReceiver iEv) {
        this.iEv = iEv;
    }

    public static void InitPrintWriter(String logfilename){
        if (!checkinitRW){
            logfile = new File(logfilename);
            try {
                if (!logfile.exists())
                    logfile.createNewFile();
                pw = new PrintWriter(logfile);
                checkinitRW = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
    }

    public void Func(String[] args) {
        InitPrintWriter(args[0]);

        for (int i = 1; i < args.length; i++) {
            if (Lib.isOdd(args[i]))
                numOdd++;
            else numEven++;
            genEv(args[i]);
        }
    }

    public void Results() {
        if (numEven == 0 && numOdd == 0) {
            Write("числа на вход не поданы");
        } else if (numEven > numOdd) {
            Write("чётных и положительных больше");
        } else if (numEven < numOdd) {
            Write("нечётных и положительных больше");
        } else if (numEven == numOdd) {
            Write("нечётных положительных и чётных положительных поровну");
        }

        ClosePrintWriter();
    }

    private void ClosePrintWriter(){
        pw.close();
    }

    public static void Write(String string) {
        System.out.print(string);
        if (checkinitRW)
            pw.append(string);
    }

    public void genEv(String arg) {
        iEv.Handler(arg);
    }


}
