# Code Challenge 30 - Hash Table

The Hashtable class implements a hash table, which maps keys to values. To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.

## Challenge
Implement a Hashtable Class with these methods:
- add, remove, get, contains
- hashCode, getBucketIndex, getSize, isEmpty

## Approach & Efficiency

### Space Complexity
O(n)

### Time Complexity
Best Case: O(1), The Worst Case: O(n)

## API

### add
Arguments: key, value Returns: nothing This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

### remove
Arguments: key, Returns: value associated with that key, and Remove the node of the given key
### get
Arguments: key Returns: Value associated with that key in the table

### contains
Arguments: key Returns: Boolean, indicating if the key exists in the table already.

### hash
Arguments: key Returns: Index in the collection for that key

### getBucketIndex:
get the index for the key within the size of array

### getSize:
get the size of all nodes in the array

### isEmpty:
to check where the array is empty or not