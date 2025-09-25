class Light implements SmartDevice {
    private boolean isOn = false;
    private int brightness = 50;

    @Override
    public void execute(String command, Object... args) {
        switch (command.toLowerCase()) {
            case "turn on":
                isOn = true;
                System.out.println("Light turned on, brightness: " + brightness);
                break;
            case "turn off":
                isOn = false;
                System.out.println("Light turned off");
                break;
            case "increase brightness":
                if (isOn && args.length > 0 && args[0] instanceof Integer) {
                    brightness = Math.min(100, brightness + (Integer) args[0]);
                    System.out.println("Light brightness increased to: " + brightness);
                }
                break;
            case "decrease brightness":
                if (isOn && args.length > 0 && args[0] instanceof Integer) {
                    brightness = Math.max(0, brightness - (Integer) args[0]);
                    System.out.println("Light brightness decreased to: " + brightness);
                }
                break;
            default:
                System.out.println("Unknown command for Light: " + command);
        }
    }
}
