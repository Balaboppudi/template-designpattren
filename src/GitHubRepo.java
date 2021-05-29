
public class GitHubRepo extends Repo {
	
	public GitHubRepo() {
		// TODO Auto-generated constructor stub
		super();
		pushCode();
	}

	@Override
	public void validateUser() {
		// TODO Auto-generated method stub
		System.out.println("Validated User");

	}

	@Override
	public void addFiles() {
		// TODO Auto-generated method stub
		System.out.println("Added Files to GITLAB");
	}

	@Override
	public void commitFilesWithMessage() {
		// TODO Auto-generated method stub
		System.out.println("Commited files with message");

	}

	@Override
	public void pushTheChanges() {
		// TODO Auto-generated method stub
		System.out.println("Pushed files to local repo");
	}

	@Override
	public void printTheStatus() {
		// TODO Auto-generated method stub
		System.out.println("Files PUSHED to GITLAB");
	}

}
