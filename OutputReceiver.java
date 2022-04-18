class OutputReceiver implements IOutputReciever {// Класс приемника

    public void Handler(Object arg) {
        if (Lib.isNumeric(arg)) {
            int condition = Integer.parseInt(arg.toString());
            if (condition == 10) {
                Output.Write("На входе было зафиксировано число 10!\n");
            }
        }
    }

}
