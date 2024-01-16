package Problem6;

public abstract class WebPageDecorator implements Webpage {
    protected Webpage decorededPage;

    public WebPageDecorator(Webpage decorededPage) {
        this.decorededPage = decorededPage;
    }

    @Override
    public void display() {
        decorededPage.display();
    }
}
