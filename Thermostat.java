class Thermostat implements SmartDevice {
    private int temperature = 20;

    @Override
    public void execute(String command, Object... args) {
        switch (command.toLowerCase()) {
            case "turn on":
                System.out.println("Thermostat is on, set to: " + temperature + "°C");
                break;
            case "turn off":
                System.out.println("Thermostat turned off");
                break;
            case "set temperature":
                if (args.length > 0 && args[0] instanceof Integer) {
                    temperature = (Integer) args[0];
                    System.out.println("Thermostat set to: " + temperature + "°C");
                }
                break;
            case "increase temperature":
                if (args.length > 0 && args[0] instanceof Integer) {
                    temperature += (Integer) args[0];
                    System.out.println("Thermostat temperature increased to: " + temperature + "°C");
                }
                break;
            case "decrease temperature":
                if (args.length > 0 && args[0] instanceof Integer) {
                    temperature -= (Integer) args[0];
                    System.out.println("Thermostat temperature decreased to: " + temperature + "°C");
                }
                break;
            default:
                System.out.println("Unknown command for Thermostat: " + command);
        }
    }
}
