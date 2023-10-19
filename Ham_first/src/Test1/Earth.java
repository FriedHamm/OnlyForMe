package Test1;

public class Earth {



    private final static int EARTH_RADIUS;
    private final static double EARTH_SURFACE_AREA;

    static
    {
        EARTH_RADIUS = 6400;
        EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
    }

    @Override
    public String toString() {
        return "지구의 반지름은 : " +EARTH_RADIUS+", " + "지구의 표면적은 : " +EARTH_SURFACE_AREA;
    }
}
