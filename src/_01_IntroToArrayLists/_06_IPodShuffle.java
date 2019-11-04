package _01_IntroToArrayLists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements MouseListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton suprise = new JButton();
	ArrayList<Song> song = new ArrayList<Song>();
	int r = new Random().nextInt(7);
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				Song s = new Song("demo.mp3");
				//s.setDuration(30);
				s.play();
				//s.stop();
				
				
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		
		_06_IPodShuffle h = new _06_IPodShuffle();
		h.randomMusic();
		
	}
	
	public void randomMusic() {
		frame.setVisible(true);
		//frame.setSize(50, 50);
		frame.add(panel);
		panel.add(suprise);
		suprise.setText("Suprise Me!");
		suprise.addMouseListener(this);
		
		//ArrayList<Song> song = new ArrayList<Song>();
		Song a = new Song("fantasyorchestra.wav");
		song.add(a);
		Song b = new Song("musicaldrone.wav");
		song.add(b);
		Song c = new Song("musicbox.wav");
		song.add(c);
		Song d = new Song("musicboxmelody.wav");
		song.add(d);
		Song e = new Song("snowfall.mp3");
		song.add(e);
		Song f = new Song("musical");
		song.add(f);
		Song g = new Song("musicsession.flac");
		song.add(g);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.equals(suprise)) {
			song.get(r).play();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}