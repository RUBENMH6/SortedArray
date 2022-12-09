public class Main {
    public static void main(String[] args) {
        SortedArray array = new SortedArray(10);

        array.putNumber(2);
        array.putNumber(1);
        array.putNumber(6);
        array.putNumber(5);
        array.putNumber(2);
        array.putNumber(0);
        array.putNumber(7);
        array.putNumber(10);
        array.putNumber(11);
        array.putNumber(12);

        System.out.println(array);

        array.removeElementAt(9);


        System.out.println(array);

        System.out.println(array.existElement(11));
        System.out.println(array.getElementAt(6));

    }
}
