package manajemenhewan;

public class Kucing extends Hewan implements SuaraHewan,Bermain {
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }

    public void bersuara() {
        System.out.println(getNama() + " mengeong: Meong");
    }
    
    public void bermain() {
    	System.out.println(getNama() + " sedang bermain dengan bola benang");
    }
}
