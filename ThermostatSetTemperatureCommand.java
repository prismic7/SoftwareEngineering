class ThermostatSetTemperatureCommand implements Command {
    private SmartDevice thermostat;
    private int temperature;

    public ThermostatSetTemperatureCommand(SmartDevice thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.execute("set temperature", temperature);
    }
}
