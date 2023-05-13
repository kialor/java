public class Animal {
    private String name;
    private boolean isDog;
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }
    public Animal(boolean isDog) {
        this.name = "Unknown";
        this.isDog = isDog;
    }
    public String getName() {
        return name;
    }
    public boolean isDog() {
        return isDog;
    }
    @Override
    public String toString() {
        return name+ " is a dog = " +isDog;
    }
}
