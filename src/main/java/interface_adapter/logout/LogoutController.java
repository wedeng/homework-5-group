package interface_adapter.logout;

import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInputData;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    private final LogoutInputBoundary logoutUseCaseInteractor;

    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        // Save the interactor in the instance variable.
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     * @param username the username of the user logging out
     */
    public void execute(String username) {
        // 1. instantiate the `LogoutInputData`, which should contain the username.
        final LogoutInputData requestModel = new LogoutInputData(username);
        // 2. tell the Interactor to execute.
        logoutUseCaseInteractor.execute(requestModel);
    }
}
