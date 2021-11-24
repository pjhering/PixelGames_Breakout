package breakout;

import pixel.App;
import pixel.Assets;

public class Main {
  public static void main (String[] args) throws Exception {
    Assets assets = Assets.load ("/assets.json");
    SplashScene initial = new SplashScene (assets);
    App app = new App (initial, "Breakout!", 500, 600);
    app.start ();
  }
}
