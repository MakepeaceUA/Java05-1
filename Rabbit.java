public class Rabbit extends Animal {
    public Rabbit(String newName)
    {
        super(newName, 0.5, "Растения", false);
    }

    @Override
    public String getSound() {
        return "Звук кролика";
    }
}