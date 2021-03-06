package src.sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import javax.sound.sampled.*;

public class Sound
{//sounds
	public static synchronized void playPlayerHit()
	{
        new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/sounds/playerhit.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        clip.start();
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}
	
	public static synchronized void playWalking()
	{
		new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/sounds/footsteps.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        clip.start();
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}
	
	public static synchronized void playEnemyGrunt()
	{
	new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/sounds/enemygrunt.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        clip.start();
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}
	
	public static synchronized void playEnemyHit()
	{
		new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/sounds/enemyhit.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        clip.start();
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}
	
	public static synchronized void playGameOver()
	{
		new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/soundsgameover.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        clip.start();
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}
	
	public static synchronized void playGameWon()
	{
		new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/sounds/gamewon.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        clip.start();
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}
	
	public static synchronized void playEnterSmileZone()
	{
		new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/sounds/smilezoneenter.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        clip.start();
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}

	public static synchronized void playBackground()
	{
		new Thread(new Runnable()
        {
            public void run()
            {
		        try 
   	 	        {
    		        File file = new File("res/sounds/LavenderTownSlowforgame.wav");
         
     	   	        Clip clip = AudioSystem.getClip();
        	        clip.open(AudioSystem.getAudioInputStream(file));
        	        //clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
        
        	        Thread.sleep(clip.getMicrosecondLength()/1000);
   		        } 

    	        catch(Exception ex) 
    	        {
        	        System.out.println("Error with playing sound.");
        	        ex.printStackTrace();
   		        }
            }
        }).start();
	}
}
