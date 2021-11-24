package breakout;

import pixel.Assets;
import pixel.Scene;
import pixel.SceneManager;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class SplashScene extends Scene {
  private Assets a;
  private BufferedImage image;
  private boolean dismiss;

  public SplashScene (Assets assets) {
    this.a = assets;
    this.image = a.getImage (0);
    dismiss = false;
  }

  @Override
  public void update (SceneManager mgr, long elapsedMillis) {
    if (dismiss) {
      mgr.replace (new GameScene (a));
    }
  }

  @Override
  public void render (Graphics g) {
    g.drawImage (image, 0, 0, null);
  }

  @Override
  public void activate () {}

  @Override
  public void deactivate () {}

  @Override
  public void dispose () {}

  @Override
  public void keyPressed (KeyEvent e) {
    if (e.getKeyCode () == KeyEvent.VK_ENTER) {
      dismiss = true;
    }
  }

}
