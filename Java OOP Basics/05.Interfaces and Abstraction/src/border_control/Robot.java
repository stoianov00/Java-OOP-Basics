package border_control;

import border_control.contracts.Identifable;

public class Robot implements Identifable {
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
