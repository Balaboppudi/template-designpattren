
public abstract class Repo {
	
	public final void pushCode() {
		validateUser();
		addFiles();
		commitFilesWithMessage();
		pushTheChanges();
		printTheStatus();
	}

	public abstract void validateUser();
	public abstract void addFiles();
	public abstract void commitFilesWithMessage();
	public abstract void pushTheChanges();
	public abstract void printTheStatus();



}
