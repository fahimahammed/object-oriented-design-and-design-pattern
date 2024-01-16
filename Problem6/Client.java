package Problem6;

public class Client {
    public static void main(String[] args) {
        String htmlContent = "<html><body><h1>Hello, World!</h1></body></html>";
        String styleSheet = "body { font-family: Arial, sans-serif; }";
        String script = "console.log('Script executed!');";

        // Step 1: Create a basic web page
        Webpage basicWebPage = new BasicWebPage(htmlContent, styleSheet, script);

        // Step 2: Decorate with Authentication
        Webpage authenticatedPage = new AuthenticatedWebPageDecorator(basicWebPage);

        // Step 3: Decorate with Authorization
        Webpage authorizedPage = new AuthorizedWebPageDecorator(authenticatedPage);
        authorizedPage.display();
    }
}
