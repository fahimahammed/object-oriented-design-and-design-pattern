package Problem6;

public class AuthorizedWebPageDecorator extends WebPageDecorator {
    public AuthorizedWebPageDecorator(Webpage decorededPage) {
        super(decorededPage);
    }

    @Override
    public void display() {
        authorizeUser();
        super.display();
    }

    private void authorizeUser() {
        System.out.println("Authorizing user...");
        // Additional logic for authorization
    }
}
