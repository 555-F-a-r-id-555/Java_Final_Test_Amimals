package final_test.model_layer;

public class Camels extends PackAnimals {

    private String name;
    private String type;
    private String birthDate;
    private String commands;

    public Camels(String name, String type , String birthDate, String commands) {
        //    super();
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }
}

