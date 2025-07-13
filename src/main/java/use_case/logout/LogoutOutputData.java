package use_case.logout;

/**
 * Output Data for the Logout Use Case.
 */
public class LogoutOutputData {

    private String username;
    private boolean useCaseFailed;

    public LogoutOutputData(String username, boolean useCaseFailed) {
        this.username = username;
        this.useCaseFailed = useCaseFailed;
        // TODO: save the parameters in the instance variables.
    }

    public String getUsername() {
        return username;
    }

    public boolean isUseCaseFailed() {
        return useCaseFailed;
    }
}
