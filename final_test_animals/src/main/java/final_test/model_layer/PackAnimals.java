package final_test.model_layer;

// Класс PackAnimals, реализующий интерфейс Animal
public class PackAnimals implements Animals {
    private int id;
    private String name;
    private String type;
    private String birthDate;
    private String commands;

    public PackAnimals(String name, String type , String birthDate, String commands) {
    }

    public PackAnimals(String name, String type, String birthDate) {
    }

    public PackAnimals(String name, String type) {
    }

    public PackAnimals() {

    }


    // Конструктор, геттеры и сеттеры для полей
    // ...

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getCommands() {
        return commands;
    }
}