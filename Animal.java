public abstract class Animal {
    private String name;
    private double foodAmount;
    private String foodType;
    private boolean predator;

    public Animal(String newName, double newFoodAmount, String newFoodType, boolean isPredator) {
        name = newName;
        foodAmount = newFoodAmount;
        foodType = newFoodType;
        predator = isPredator;
    }

    public abstract String getSound();

    public String getName()
    {
        return name;
    }

    public double getFoodAmount()
    {
        return foodAmount;
    }

    public String getFoodType()
    {
        return foodType;
    }

    public boolean isPredator()
    {
        return predator;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setFoodAmount(double newFoodAmount)
    {
        foodAmount = newFoodAmount;
    }

    public void setFoodType(String newFoodType)
    {
        foodType = newFoodType;
    }

    public void setPredator(boolean isPredator)
    {
        predator = isPredator;
    }
}