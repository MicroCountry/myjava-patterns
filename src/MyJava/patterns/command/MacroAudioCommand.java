package MyJava.patterns.command;

import java.util.Vector;

public class MacroAudioCommand implements MacroCommand {

	private Vector commandList = new Vector();
	
	@Override
	public void execute() {
		Command nextCommand;
		System.out.println("Automated playback of stored commands...");
		for(int i=0;i<commandList.size();i++){
			nextCommand = (Command) commandList.elementAt(i);
			nextCommand.execute();
		}
		System.out.println("Finished automated playback of stored commands...");
	}

	public void remove(int index){
		commandList.remove(index);
	}
	@Override
	public void remove(Command toRemove) {
		commandList.removeElement(toRemove);
	}

	@Override
	public void add(Command toAdd) {
		commandList.addElement(toAdd);
	}

}
