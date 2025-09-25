class LightOnCommand implements Command {
    private SmartDevice light;

    public LightOnCommand(SmartDevice light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.execute("turn on");
    }
}