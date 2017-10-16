package Romans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * A simple Java sound file example (i.e., Java code to play a sound file).
 * AudioStream and AudioPlayer code comes from a javaworld.com example.
 * @author alvin alexander, devdaily.com.
 */
public class Musicsounds extends start{
  public Musicsounds() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
  public void startedmusic2() throws IOException{
		// TODO Auto-generated method stub
		// open the sound file as a Java input stream
	    // create an audiostream from the inputstream
	    InputStream inputStream = getClass().getResourceAsStream("jazz.wav");
	    AudioStream audioStream3 = new AudioStream(inputStream);
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream3);
		// TODO Auto-generated catch block
	    
	    }
  public void startedmusic() throws IOException{
		// TODO Auto-generated method stub
		// open the sound file as a Java input stream
	    // create an audiostream from the inputstream
	    InputStream inputStream = getClass().getResourceAsStream("Wyatt_s_song_2.wav");
	    AudioStream audioStream1 = new AudioStream(inputStream);
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream1);
		// TODO Auto-generated catch block
	    
	    }
public void playSound() throws IOException{
  
    // open the sound file as a Java input stream
	    // create an audiostream from the inputstream
    InputStream inputStream = getClass().getResourceAsStream("firstsong.wav");
    AudioStream audioStream1 = new AudioStream(inputStream);
    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream1);	    
		//don't try and do things with a null object!
	   
  }

  public void storemusic() throws IOException{
	
		
  }
  //method for stepping sound 
  public void stepsound() throws IOException{
	  
  }

}