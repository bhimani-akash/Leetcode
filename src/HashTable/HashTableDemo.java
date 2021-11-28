package HashTable;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(20);

        hashTable.insert(new DataItem(1, 20));
        hashTable.insert(new DataItem(2, 70));
        hashTable.insert(new DataItem(42, 80));
        hashTable.insert(new DataItem(4, 25));
        hashTable.insert(new DataItem(12, 44));
        hashTable.insert(new DataItem(14, 32));
        hashTable.insert(new DataItem(17, 11));
        hashTable.insert(new DataItem(13, 78));
        hashTable.insert(new DataItem(37, 97));

        hashTable.display();

        DataItem item =  hashTable.search(37);
        if (item != null)
            System.out.println("Element found: " + item.getData());
        else
            System.out.println("Element not found");

        hashTable.delete(item);
        item = hashTable.search(37);

        if (item != null)
            System.out.println("Element found: " + item.getData());
        else
            System.out.println("Element not found");
    }
}
