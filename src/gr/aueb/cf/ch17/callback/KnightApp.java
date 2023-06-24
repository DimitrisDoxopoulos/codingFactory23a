package gr.aueb.cf.ch17.callback;

public class KnightApp {
    public static void main(String[] args) {
        IKnight kingArthur = new Knight();
        IKnight saintGeorge = new Knight();
        // Lamda Expressions
//        kingArthur.embarkOnMission(() -> System.out.println("Save the princess"));
//        saintGeorge.embarkOnMission(() -> killTheDragon());

        // Method References
        kingArthur.embarkOnMission(KnightApp::saveThePrincess);
        saintGeorge.embarkOnMission(KnightApp::killTheDragon);
    }

    public static void killTheDragon() {
        System.out.println("Kill the dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the princess");
    }
}
