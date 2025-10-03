package manajemenhewan;

public class Burung extends Hewan implements SuaraHewan,Bermain {
    public Burung(String nama, int umur) {
        super(nama, umur);
    }

    public void bersuara() {
        System.out.println(getNama() + " berkicau: cit cuit");
    }
    
    public void bermain() {
    	System.out.println(getNama() + " sedang terbang di dalam kandang");
    }
}
