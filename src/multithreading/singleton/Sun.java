package multithreading.singleton;
public class Sun implements CelestialBody {
    public static Sun uniqueSun;
    private Sun() {
    }
    public static Sun getInstance() {
        if (uniqueSun == null) {
            uniqueSun = new Sun();
        }
        return uniqueSun;
    }
}
