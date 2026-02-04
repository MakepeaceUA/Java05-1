public class Tiger extends Animal {
    public Tiger(String newName)
    {
        super(newName, 10.0, "Мясо", true);
    }

    @Override
    public String getSound()
    {
        return "Звук тигра";
    }
}
