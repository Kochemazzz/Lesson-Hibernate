package multithreading.singleton;
public class Moon implements CelestialBody {
    public static Moon uniqueMoon;
    private Moon() {
    }
    public static Moon getInstance() {
        if (uniqueMoon == null) {
            uniqueMoon = new Moon();
        }
        return uniqueMoon;
    }
}
