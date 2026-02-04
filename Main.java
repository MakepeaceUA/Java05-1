import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();

        zoo.add(new Tiger("Tiger01"));
        zoo.add(new Tiger("Tiger02"));
        zoo.add(new Wolf("Wolf01"));
        zoo.add(new Rabbit("Rabbit01"));
        zoo.add(new Kangaroo("Kangaroo01"));
        zoo.add(new Wolf("Wolf02"));

        int predatorCount = 0;
        double totalMeat = 0;
        double totalPlants = 0;

        for (Animal animal : zoo)
        {
            System.out.println(animal.getName() + " издаёт: " + animal.getSound());

            if (animal.isPredator())
            {
                predatorCount++;
            }

            if ("Мясо".equals(animal.getFoodType()))
            {
                totalMeat += animal.getFoodAmount();
            } else if ("Растения".equals(animal.getFoodType()))
            {
                totalPlants += animal.getFoodAmount();
            }
        }

        System.out.println("Количество хищников: " + predatorCount);
        System.out.println("Необходимо мяса: " + totalMeat + " кг");
        System.out.println("Необходимо растений: " + totalPlants + " кг");
    }
}