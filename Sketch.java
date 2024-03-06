import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
	int length;
  int width;
  Random myRand = new Random();
  double randheight;
  int timeOfDay;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    length = 400;
    width = 400;
    randheight = width * myRand.nextDouble(0.5)/2;
    size(length, width);
    timeOfDay = myRand.nextInt(24);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    if (timeOfDay >= 8 && timeOfDay <= 21){
      background(99, 195, 255);
    }
    else {
      background(0, 7, 107);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	// Field
    fill(0, 148, 7);
    ellipse((float)(length * 0.3125), (float)randheight + (float)(width * 1), (float)(length * 1), (float)(width * 0.625));

  // Draw house
  
    // base
    fill(117, 51, 0);
    rect((float)(length * 0.5), (float)(width * 0.5), (float)(length * 0.5), (float)(width * 0.5));

    // roof
    fill(168, 35, 12);
    triangle((float)(length * 0.5), (float)(width * 0.5), length, (float)(width * 0.5), (float)(length * 0.75), (float)(width * 0.3125));

    // windows
    fill(171, 200, 255);
    rect((float)(length * 0.55), (float)(width * 0.575), (float)(length * 0.125), (float)(width * 0.125));

    fill(171, 200, 255);
    rect((float)(length * 0.825), (float)(width * 0.575), (float)(length * 0.125), (float)(width * 0.125));

    line((float)(length * 0.6125), (float)(width * 0.575), (float)(length * 0.6125), (float)(width * 0.7));
    line((float)(length * 0.55), (float)(width * 0.6375), (float)(length * 0.675), (float)(width * 0.6375));

    line((float)(length * 0.8875), (float)(width * 0.575), (float)(length * 0.8875), (float)(width * 0.7));
    line((float)(length * 0.825), (float)(width * 0.6375), (float)(length * 0.95), (float)(width * 0.6375));

    // door
    fill(168, 95, 0);
    rect((float)(length * 0.6875), (float)(width * 0.75), (float)(length * 0.125), (float)(width * 0.2875));

    // doorknob
    ellipse((float)(length * 0.7875), (float)(width * 0.875), (float)(length * 0.0175), (float)(width * 0.0175));

  // Draw sun
  if (timeOfDay >= 8 && timeOfDay <= 21){
    fill(255, 230, 0);
  }
  else {
    fill(255, 235, 179);
  }
    ellipse((float)(length * 0.125), (float)(width * 0.125), (float)(length * 0.1875), (float)(width * 0.1875));
    
  // Define text size, color, and show time
    textSize(20);
    fill(0, 0, 0);

    int intHours = hour();
    int intMinutes = minute();

    text(intHours, 20, 55);
    text(intMinutes, 50, 55);
    text(":", 45, 55);
  }

  // define other methods down here.
}