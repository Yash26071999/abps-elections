package core;

import kuusisto.tinysound.Sound;
import kuusisto.tinysound.TinySound;

public class Play {
        
        /**
         *
         *@inputFileType Works well for .wav and .ogg 
         *@requires 3 Libraries - jorbis, tritonus_share, vorbisspi 
         *@param boolean noError 
         */
    
        public void playSound(boolean noError){
            String file = noError ? "assets/correct_answer.wav" : "assets/wrong_answer.wav";
            TinySound.init();
            Sound song = TinySound.loadSound(file);
            song.play();
            try {
                Thread.sleep(750);
            } catch (InterruptedException e){
                new Repo().log(e.toString());
            }
            TinySound.shutdown();
        }

	public static void main(String[] args) {
            new Play().playSound(true);
	}
        
	
}