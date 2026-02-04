public class Wolf extends Animal {
    public Wolf(String newName)
    {
        super(newName, 5.0, "Мясо", true);
    }

    @Override
    public String getSound() {
        return "Звук волка";
    }
}
