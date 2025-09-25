public class Main {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice thermostat = new Thermostat();
        SmartDevice musicPlayer = new MusicPlayer();

        SmartHomeHub hub = new SmartHomeHub();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command lightBrighten = new LightAdjustBrightnessCommand(light, true, 10);
        Command thermostatSetTemp = new ThermostatSetTemperatureCommand(thermostat, 22);
        Command musicPlay = new MusicPlayPlaylistCommand(musicPlayer, "Jazz Classics");

        hub.addCommand(lightOn);
        hub.addCommand(lightBrighten);
        hub.addCommand(thermostatSetTemp);
        hub.addCommand(musicPlay);

        System.out.println("Executing commands from hub:");
        hub.executeCommands();

        System.out.println("\nExecuting individual command:");
        lightOff.execute();
    }
}
