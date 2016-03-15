package Search;

class searchMinAndMax {
    int min(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        return minNum;
    }

    int max(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }
}