class InputReceiver implements IReaderReciever {// Класс приемника
    String s = "";

    public void Handler(String arg){
            if (!s.equals(arg)){
                Output.Write("Изменилось значение переменной s: ");
                Output.Write(arg);
                Output.Write("\n");

                s = arg;
            }
    }
}
