package Constructor.test2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setId(10);
        System.out.println("id: " + animal.getId());
    }
}
