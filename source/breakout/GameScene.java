package breakout;

import pixel.Assets;
import pixel.Scene;
import pixel.SceneManager;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameScene extends Scene {
  private Assets a;
  private boolean dismiss;

  public GameScene (Assets assets) {
    this.a = assets;
    dismiss = false;
  }

  @Override
  public void update (SceneManager mgr, long elapsedMillis) {
    if (dismiss) {
      mgr.replace (new SplashScene (a));
    }
  }

  @Override
  public void render (Graphics g) {
    g.setColor (Color.GREEN);
    g.fillRect (0, 0, 500, 600);
  }

  @Override
  public void activate () {}

  @Override
  public void deactivate () {}

  @Override
  public void dispose () {}

  @Override
  public void keyPressed (KeyEvent e) {
    if (e.getKeyCode () == KeyEvent.VK_ESCAPE) {
      dismiss = true;
    }
  }

}
