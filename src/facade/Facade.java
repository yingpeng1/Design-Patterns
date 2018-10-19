package facade;

public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTv();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
