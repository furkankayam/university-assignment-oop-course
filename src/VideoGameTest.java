/**
 * @since 2023.04.13
 */
public class VideoGameTest {

    public static void main(String[] args) {

        ShoppingSite shoppingSite = new ShoppingSite("Game Studio");

        //VideoGame1
        VideoGame videoGame1 = new VideoGame("The Last of Us 1",
                100,
                VideoGame.gameTypeList.Adventure,
                100);
        ShoppingSite.addVideoGame(videoGame1);

        //VideoGame2
        VideoGame videoGame2 = new VideoGame("Minecraft",
                1000,
                VideoGame.gameTypeList.Adventure,
                10);
        ShoppingSite.addVideoGame(videoGame2);

        //VideoGame3
        VideoGame videoGame3 = new VideoGame("Euro Truck Simulator 2",
                560,
                VideoGame.gameTypeList.Simulation,
                55);
        ShoppingSite.addVideoGame(videoGame3);

        System.out.println("Name of the game store: " + shoppingSite.getStoreName());

        System.out.println("****************************************");

        for (int i=0; i<ShoppingSite.getVideoGameList().length; ++i) {
            System.out.println("Name of the game: " + ShoppingSite.getVideoGameList()[i].getGameName());
            System.out.println("Price of the game: $" + ShoppingSite.getVideoGameList()[i].getGamePrice());
            System.out.println("Type of the game: " + ShoppingSite.getVideoGameList()[i].getGameType());
            System.out.println("Stock of the game: " + ShoppingSite.getVideoGameList()[i].getHomeStock());
            System.out.println();
        }

        System.out.println("****************************************");

        System.out.println("Total game stack of the shopping site: " + ShoppingSite.totalGameStock);

    }
    
}