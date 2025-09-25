class MusicPlayer implements SmartDevice {
    private boolean isPlaying = false;
    private int volume = 50;
    private String playlist = "Default";

    @Override
    public void execute(String command, Object... args) {
        switch (command.toLowerCase()) {
            case "turn on":
                isPlaying = true;
                System.out.println("Music Player turned on, playing: " + playlist + ", volume: " + volume);
                break;
            case "turn off":
                isPlaying = false;
                System.out.println("Music Player turned off");
                break;
            case "play playlist":
                if (args.length > 0 && args[0] instanceof String) {
                    playlist = (String) args[0];
                    isPlaying = true;
                    System.out.println("Music Player playing playlist: " + playlist);
                }
                break;
            case "increase volume":
                if (isPlaying && args.length > 0 && args[0] instanceof Integer) {
                    volume = Math.min(100, volume + (Integer) args[0]);
                    System.out.println("Music Player volume increased to: " + volume);
                }
                break;
            case "decrease volume":
                if (isPlaying && args.length > 0 && args[0] instanceof Integer) {
                    volume = Math.max(0, volume - (Integer) args[0]);
                    System.out.println("Music Player volume decreased to: " + volume);
                }
                break;
            default:
                System.out.println("Unknown command for Music Player: " + command);
        }
    }
}