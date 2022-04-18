// Выполнить первую лабораторную так, чтобы в описании требуеого класса учитывались (генерировались, перехватывались и обрабатывались) указанные ниже события

// События:
// 3. Равенство указанного объекта некоторому значению
// 4. Обращение к потоку ввода с консоли                
// 5. Изменение указанной переменной                    

// Все операции вывода на консоль должны дублироваться выводом в указанный файл «Журнала»

// Указание пути к файлу «журнала» - из файла
// Способ реализации событий - явное событие


public class Main {
    public static void main(String[] args) {
        String filename;
        String[] arr;

        FileNameReaderReciever fileNameReaderReciever = new FileNameReaderReciever(); // Создать объект приемника
        InputReceiver receiverInput = new InputReceiver(); // Создать объект приемника
        OutputReceiver receiverOutput = new OutputReceiver(); // Создать объект приемника

        FileNameReader fileNameReader = new FileNameReader(fileNameReaderReciever);
        Input input   = new Input(receiverInput);   // Создать объект источника
        Output output = new Output(receiverOutput); // Создать объект источника

        filename = fileNameReader.GetFileName();
        arr = input.Read(filename);
        output.Func(arr);

        output.Results();

    }
}


