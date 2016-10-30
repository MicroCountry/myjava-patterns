package MyJava.patterns.command;

public interface MacroCommand extends Command {
	void execute();
	void remove(Command toRemove);
	void add(Command toAdd);
}
