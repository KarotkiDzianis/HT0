import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class Room {
    private static final int WINDOWS_ILLUMINATION = 700;
    private static final int ILLUMINATION_FROM = 300;
    private static final int ILLUMINATION_TO = 4000;

    private String name;
    private double area;
    private int windows;
    private List<Lamp> lamps;
    private List <Furniture> furnitures;
    private int illumination;
    private double minEmptySquare;
    private double maxEmptySquare;


    public Room(String name, double area, int windows) throws IlluminanceTooMuchException {
        this.name = name;
        this.area = area;
        this.windows = windows;

        this.illumination = windows * WINDOWS_ILLUMINATION;

        if (this.illumination < ILLUMINATION_FROM || this.illumination > ILLUMINATION_TO) {
            throw new IlluminanceTooMuchException();
        }

        this.lamps = new ArrayList<Lamp> ();
        this.furnitures = new ArrayList<Furniture>();
    }


    public void addIlluminance(Lamp illumination) {
        lamps.add(illumination);
        }
     public void  getIllumination () {



     }

    public void addFurniture(Furniture furniture) {
        furnitures.add(furniture) ;
    }
    double  getMinEmprySquare (){
        return  minEmptySquare;
    }
    double getMaxEmptySquare () {
        return  maxEmptySquare;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}





