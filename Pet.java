public class Pet {
    int id;
    String name;
    int age;
    String type;

    // Constructor to create a new Pet
    public Pet(int id, String name, int age, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    // Method to display a pet's info
    public void showPet() {
        System.out.println(id + ". " + type + " - " + name + ", Age: " + age);
    }
}

