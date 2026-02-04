public class Kangaroo extends Animal {
    public Kangaroo(String newName)
    {
        super(newName, 2.0, "Растения", false);
    }

    @Override
    public String getSound()
    {
        return "Звук кенгуру";
    }
}
