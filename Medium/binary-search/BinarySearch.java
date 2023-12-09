import java.util.List;

class BinarySearch {
    private List<Integer> items;
    BinarySearch(List<Integer> items) {
        this.items = items;
    }

    int indexOf(int item) throws ValueNotFoundException {
        int left = 0;
        int right = items.size() - 1;

        while (left <= right) {
            int middlePointer = ((right - left) / 2) + left;
            int numInMiddle = items.get(middlePointer);

            if (numInMiddle == item)
                return middlePointer;
            else if (item > numInMiddle)
                left = middlePointer + 1;
            else
                right = middlePointer - 1;

        }
        throw new ValueNotFoundException("Value not in array");
    }
}


