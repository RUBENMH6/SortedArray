import java.util.Arrays;

public class SortedArray {
    private int[] array;
    private int numElements;

    public SortedArray(int size) {
        numElements = 0;
        array = new int[size];
        Arrays.fill(array, -1);
    }

    public int getNumElements() {
        return numElements;
    }

    public void putNumber(int number) {
        if (isEmpty()) {
            array[0] = number;
            numElements = 1;
            return;
        }
        for (int i = numElements - 1; i >= 0; i--) {
            if (array[i] > number) {
                array[i + 1] = array [i];
                array[i] = number;
            } else {
                array[i + 1 ] = number;
                break;
            }
        }
        numElements++;
    }

    public int getSize() {
        return array.length;
    }

    public boolean isEmpty() {
        if (numElements == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (numElements == array.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean existElement(int number) {
        for (int i = 0; i < numElements; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int getElementAt(int position) {
        return array[position];
    }

    public void removeElementAt(int position) {
        if (position >= numElements ||  position < 0 ){
            throw new ArrayIndexOutOfBoundsException("This position is empty or don't exist");
        }

        for (int i = position; i < numElements-1; i++) {
            array[i] = array[i+1];
        }
        numElements--;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < numElements; i++) {
            s += array[i] + ", ";
        }
        return s.substring(0,s.length()-2);
    }
}

