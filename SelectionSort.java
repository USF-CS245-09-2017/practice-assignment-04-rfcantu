public class SelectionSort implements SortingAlgorithm {

    public void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) { // loop over array

            int min = i; // set minimum as current index

            for (int j = i + 1; j < a.length; j++) { // loop over every element in array

                if (a[j] < a[min]){ // and if element is smaller than i index, minimum is now j

                        min = j;

                }

            }

            if (min != i) { // if min is not the same anymore

                swap(a[min], a[i]);

            }

        }

    }

    void swap(int x, int z) {

        int temp = x;
        z = x;
        x = temp;

    }

}