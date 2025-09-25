class LightOffCommand implements Command {
    private SmartDevice light;

    public LightOffCommand(SmartDevice light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.execute("turn off");
    }
}
