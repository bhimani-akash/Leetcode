package HashTable;

public class HashTable {
    private DataItem[] hashArray;
    private int size;
    private DataItem dummyItem;

    public HashTable(int size) {
        this.size = size;
        hashArray = new DataItem[size];
        dummyItem = new DataItem(-1, -1);
    }

    public int hashCode(int key) {
        return key % size;
    }

    public void insert(DataItem item) {
        int key = item.getKey();

        int hashIndex = hashCode(key);

        while (hashArray[hashIndex] != null && hashArray[hashIndex].getKey() != -1) {
            ++hashIndex;
            hashIndex %= size;
        }

        hashArray[hashIndex] = item;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (hashArray[i] != null)
                System.out.print(" (" + hashArray[i].getKey() + "," + hashArray[i].getData() + ") ");
            else
                System.out.print(" ~~ ");
        }
        System.out.println();
    }

    public DataItem search(int key) {
        int hashIndex = hashCode(key);

        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].getKey() == key)
                return hashArray[hashIndex];

            ++hashIndex;
            hashIndex %= size;
        }
        return null;
    }

    public DataItem delete(DataItem item) {
        int key = item.getKey();

        int hashIndex = hashCode(key);

        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].getKey() == key) {
                DataItem temp = hashArray[hashIndex];
                hashArray[hashIndex] = dummyItem;
                return temp;
            }

            ++hashIndex;
            hashIndex %= size;
        }
        return null;
    }
}
