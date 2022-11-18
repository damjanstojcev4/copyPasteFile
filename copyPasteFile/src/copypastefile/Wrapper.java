package copypastefile;

public class Wrapper {
    public static Integer parseInt(String str) {
        Integer result = null;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            // do noting, result remains null
        }
        return result;
    }
}
