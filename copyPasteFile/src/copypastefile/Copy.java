package copypastefile;

import java.io.*;

public class Copy {
    public static Cars[] copy(String originalPath, String copyPath) {
        Cars[] result = new Cars[0];

        try (BufferedReader in = new BufferedReader(new FileReader(originalPath))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] tokens = line.split(",");
                ArrayManager am = new ArrayManager();
                result = am.addCar(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

//    public static void writeFile() {
//        try(PrintWriter out = new PrintWriter(originalPath)) {
//            out.write(copyPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}