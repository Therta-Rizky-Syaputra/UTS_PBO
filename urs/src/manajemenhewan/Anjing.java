package manajemenhewan;

public class Anjing extends Hewan implements SuaraHewan, Bermain {
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    public void bersuara() {
        System.out.println(getNama() + " mengong-gong: Guk guk");
    }
    public void bermain() {
    	System.out.println(getNama() + " sedang bermain dengan tulang");
    }
}
