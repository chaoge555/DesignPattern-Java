package mode.template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game circket = new Cricket();
        circket.play();
        System.out.println("");
        Game football =new Football();
        football.play();
    }
}
