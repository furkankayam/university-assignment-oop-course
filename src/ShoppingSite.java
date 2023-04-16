public class ShoppingSite {

    //FIELDS
    private static int videoGameCount = 0;
    public static int totalGameStock = 0;
    private static final VideoGame[] videoGameList = new VideoGame[3];
    private final String storeName;

    //CONSTRUCTOR
    public ShoppingSite(String storeName) {
        this.storeName = storeName;
    }

    //SAVE
    public static void addVideoGame(VideoGame videoGame) {

        VideoGame videoGame1 = new VideoGame(videoGame.getGameName(),
                videoGame.getHomeStock(),
                videoGame.getGameType(),
                videoGame.getGamePrice());

        totalGameStock += videoGame.getHomeStock();
        videoGameList[videoGameCount] = videoGame1;
        ++videoGameCount;

    }

    //GETTER
    public String getStoreName() {
        return storeName;
    }
    public static VideoGame[] getVideoGameList() {
        return videoGameList;
    }
}
