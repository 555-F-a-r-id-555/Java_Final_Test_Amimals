package final_test.model_layer;

public class Pets implements Animals {
    private int id;
    private String name;
    private String type;
    private String birthDate;
    private String commands;

    public Pets(String name, String type , String birthDate, String commands) {
    }

    public Pets(String name, String type, String birthDate) {
    }

    public Pets(String name, String type) {
    }

    public Pets() {

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
