public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            int insert = a[i]; // the element to insert
            int index = i; // the index of element to insert

            while (index > 0 && a[index - 1] > insert) { // while the index is greater than zero and the element is greater

                a[index] = a[index - 1]; // move the element to the left
                index = index - 1;

            }

            a[index] = insert; // insert the element

        }

    }

}