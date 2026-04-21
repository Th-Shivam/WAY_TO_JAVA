public class squareSorted {

    // reverse an array
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] square(int[] arr) {

        int countneg = 0;

        // count negatives
        for (int num : arr) {
            if (num < 0) {
                countneg++;
            }
        }

        // create arrays
        int[] negarray = new int[countneg];
        int[] posarray = new int[arr.length - countneg];

        // fill negative array
        for (int i = 0; i < countneg; i++) {
            negarray[i] = arr[i];
        }

        // fill positive array (FIXED PART)
        for (int i = countneg; i < arr.length; i++) {
            posarray[i - countneg] = arr[i];
        }

        // case 1: all positive
        if (negarray.length == 0) {
            for (int i = 0; i < posarray.length; i++) {
                posarray[i] *= posarray[i];
            }
            return posarray;
        }

        // case 2: all negative
        if (posarray.length == 0) {
            for (int i = 0; i < negarray.length; i++) {
                negarray[i] *= negarray[i];
            }
            reverse(negarray);
            return negarray;
        }

        // square both arrays
        for (int i = 0; i < negarray.length; i++) {
            negarray[i] *= negarray[i];
        }

        for (int i = 0; i < posarray.length; i++) {
            posarray[i] *= posarray[i];
        }

        // reverse negative squares
        reverse(negarray);

        // merge two sorted arrays
        int[] result = new int[arr.length];
        int i = 0, j = 0, k = 0;

        while (i < negarray.length && j < posarray.length) {
            if (negarray[i] <= posarray[j]) {
                result[k++] = negarray[i++];
            } else {
                result[k++] = posarray[j++];
            }
        }

        while (i < negarray.length) {
            result[k++] = negarray[i++];
        }

        while (j < posarray.length) {
            result[k++] = posarray[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { -4, -2, -1, 0, 1, 3, 5, 7 };

        int[] result = square(arr);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
