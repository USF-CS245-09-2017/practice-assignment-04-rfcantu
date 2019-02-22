public class BubbleSort implements SortingAlgorithm {

    public void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) { // each element of array

            for (int j = 0; j < a.length - i - 1; j++) { // compared to every other element

                if (a[i] > a[i + 1]) { // swap the elements if smaller

                    swap(a[i], a[i + 1]);

                }

            }

        }

    }

    void swap(int x, int z) {

        int temp = x;
        z = x;
        x = temp;

    }

}