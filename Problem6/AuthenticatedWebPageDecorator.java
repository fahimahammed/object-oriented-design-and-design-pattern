package Problem6;

public class AuthenticatedWebPageDecorator extends WebPageDecorator {
    public AuthenticatedWebPageDecorator(Webpage decorededPage) {
        super(decorededPage);
    }

    public void display() {
        this.authenticateUser();
        super.display();
    }

    private void authenticateUser() {
        System.out.println("Authenticating user...");
        // Additional logic for authentication
    }
}
