package multithreading.singleton;
public class Earth implements CelestialBody {
    public static Earth uniqueEarth;
    private Earth() {
    }
    public static Earth getInstance() {
        if (uniqueEarth == null) {
            uniqueEarth = new Earth();
        }
        return uniqueEarth;
    }
}
