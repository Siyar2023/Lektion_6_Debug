/*Breakpoint.
Breakpoint på line 9.Man trycker bredvid 9 och det blir röd punkt, sedan trycker man på Debug knappen
bredvid play knappen och kör programmet i debug mode. Längre ner bredvid RUN finns Debug mode där koden körs.
Console visar Debugged kod. */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i); //Breakpoint here
        }
    }
}