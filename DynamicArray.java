
/**
 * Created by APuente on 10/9/2015.
 */
public class DynamicArray {
    protected String[] array;
    protected int logicalSize;

    protected DynamicArray() {
        this.array = new String[10];
        this.logicalSize = 0;
    }

   protected void add(String s) {
       // if the logical size of the array is less than the actual size, just add the string
       if (logicalSize + 1 < array.length) {
           array[logicalSize] = s;
           logicalSize++;
       } else {
           // if the logical size of the array is equal to the length of the array
           // double the array and copy all of the strings into the new one
           String[] temp = new String[array.length *2];
           for (int i = 0; i < logicalSize; i++) {
               temp[i] = array[i];
           }
           this.array = temp;
           array[logicalSize] = s;
           logicalSize++;
       }
   }

    protected String get(int i) {
        return array[i];
    }
}
