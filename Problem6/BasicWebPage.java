package Problem6;

public class BasicWebPage implements Webpage {
    public String html;
    public String styleSheet;
    public String script;

    public BasicWebPage(String html, String styleSheet, String script) {
        this.html = html;
        this.styleSheet = styleSheet;
        this.script = script;
    }

    @Override
    public void display() {
        System.out.println("Displaying Web Page:");
        System.out.println("HTML: " + html);
        System.out.println("Stylesheet: " + styleSheet);
        System.out.println("Script: " + script);
    }
}
