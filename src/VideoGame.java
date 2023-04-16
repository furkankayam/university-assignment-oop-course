public class VideoGame {

    //FIELDS
    public String setGameName;
    private String gameName;
    private int homeStock;
    private gameTypeList gameType;
    private int gamePrice;

    //ENUM
    enum gameTypeList{
        Sports,
        Strategy,
        Simulation,
        Fighting,
        Adventure,
        Racing,
        Puzzle
    }

    //CONSTRUCTOR
    public VideoGame(String gameName, int homeStock,
                     gameTypeList gameType,
                     int gamePrice) {
        this.gameName = gameName;
        this.homeStock = homeStock;
        this.gameType = gameType;
        this.gamePrice = gamePrice;

    }

    //GETTER-SETTER
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getHomeStock() {
        return homeStock;
    }

    public void setHomeStock(int homeStock) {
        this.homeStock = homeStock;
    }

    public String getSetGameName() {
        return setGameName;
    }

    public void setSetGameName(String setGameName) {
        this.setGameName = setGameName;
    }

    public gameTypeList getGameType() {
        return gameType;
    }

    public void setGameType(gameTypeList gameType) {
        this.gameType = gameType;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }
}
