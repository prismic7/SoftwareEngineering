public class Main {
    public static void main(String[] args) {
        // Initialize devices
        SmartDevice light = new Light();
        SmartDevice thermostat = new Thermostat();
        SmartDevice musicPlayer = new MusicPlayer();

        // Initialize hub
        SmartHomeHub hub = new SmartHomeHub();

        // Create commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command lightBrighten = new LightAdjustBrightnessCommand(light, true, 10);
        Command thermostatSetTemp = new ThermostatSetTemperatureCommand(thermostat, 22);
        Command musicPlay = new MusicPlayPlaylistCommand(musicPlayer, "Jazz Classics");

        // Add commands to hub
        hub.addCommand(lightOn);
        hub.addCommand(lightBrighten);
        hub.addCommand(thermostatSetTemp);
        hub.addCommand(musicPlay);

        // Execute all commands
        System.out.println("Executing commands from hub:");
        hub.executeCommands();

        // Demonstrate individual command execution
        System.out.println("\nExecuting individual command:");
        lightOff.execute();
    }
}