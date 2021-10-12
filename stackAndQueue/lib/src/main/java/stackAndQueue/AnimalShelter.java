package stackAndQueue;

public class AnimalShelter {

    Queue cat = new Queue();
    Queue dog = new Queue();

    public void enqueue(Animal animal) {

        if (animal instanceof Cat) {
            cat.enqueue(animal.getPref());
        } else if (animal instanceof Dog) {
            dog.enqueue(animal.getPref());
        } else {
            System.out.println("Animal Shelter holds only dogs and cats.");
        }
    }

    public String dequeue(String pref) {

        if (pref.equals("cat") && !cat.isEmpty()) {
            return cat.dequeue();
        } else if (pref.equals("dog") && !dog.isEmpty()) {
            return dog.dequeue();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
