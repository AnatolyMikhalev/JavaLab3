import java.util.Observable;

class Lib {
    public static boolean isNumeric(Object arg) {
        if (arg == null || arg.equals("")) {
            return false;
        }
        try {
            Integer.parseInt(arg.toString());
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean isString(Object arg) {
        if (arg == null || arg.equals("")) {
            return false;
        }
        try {
            ((String) arg).toString();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean isOdd(Object arg){
        if (isNumeric(arg))
            if (Integer.parseInt(arg.toString()) % 2 == 1)
                return true;
        return false;
    }
}