package mainpackage;
import javax.sound.midi.*;

public class MiniMV {
	public static void main(String[] args) {
		
		MiniMV mini = new MiniMV();
		//mini.play(instrument,note);
		mini.play(4,30);
		
		/*
		MoveCircle obj = new MoveCircle();
		obj.go();
		*/
		
		/*
		if(args.length < 2) {
			System.out.print("don't forget 2");
		}else {
			int instrument = Integer.parseInt(args[0]);
			int note = Integer.parseInt(args[1]);
			mini.play(instrument,note);
		}
		*/
	}
	public void play(int instrument,int note) {	
		
		
		
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ,4);
			Track track = seq.createTrack();
			
			MidiEvent event = null;
			
			ShortMessage first = new ShortMessage();
			first.setMessage(192,1,instrument,0);
			MidiEvent changeInstrument = new MidiEvent(first,1);
			track.add(changeInstrument);
			
			for(int x = note; x < 50; x++) {
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144,3,note+x,50);
			MidiEvent noteOn = new MidiEvent(a,1+x);//the second one is position
			track.add(noteOn);
			
			
			ShortMessage a1 = new ShortMessage();
			a1.setMessage(144,1,note+x,50);
			MidiEvent noteOn1 = new MidiEvent(a,10+x);//the second one is position 慢10，二重奏哈哈
			track.add(noteOn1);
			
			
			/*
			ShortMessage b = new ShortMessage();
			b.setMessage(128,1,note,0);
			MidiEvent noteOff = new MidiEvent(b,16);
			track.add(noteOff);
			*/
			//noteOff can be deleted,why
			
			player.setSequence(seq);
			player.start();
			
			Thread.sleep(100);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}//close try-catch
	}//close play() 
}
