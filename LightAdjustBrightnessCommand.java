class LightAdjustBrightnessCommand implements Command {
    private SmartDevice light;
    private boolean increase;
    private int amount;

    public LightAdjustBrightnessCommand(SmartDevice light, boolean increase, int amount) {
        this.light = light;
        this.increase = increase;
        this.amount = amount;
    }

    @Override
    public void execute() {
        String command = increase ? "increase brightness" : "decrease brightness";
        light.execute(command, amount);
    }
}
