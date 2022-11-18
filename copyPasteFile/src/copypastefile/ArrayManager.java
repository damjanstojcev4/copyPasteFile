package copypastefile;

public class ArrayManager {
    public Cars[] addCar(Cars[] arr) {
        Cars[] tempArray = new Cars[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        Cars cars = arr[arr.length - 1];
        return tempArray;
    }
}

