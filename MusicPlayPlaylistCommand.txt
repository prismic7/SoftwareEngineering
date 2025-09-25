class MusicPlayPlaylistCommand implements Command {
    private SmartDevice musicPlayer;
    private String playlist;

    public MusicPlayPlaylistCommand(SmartDevice musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public void execute() {
        musicPlayer.execute("play playlist", playlist);
    }
}