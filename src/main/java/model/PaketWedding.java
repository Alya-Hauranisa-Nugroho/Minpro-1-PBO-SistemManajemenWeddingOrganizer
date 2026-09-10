package model;

public class PaketWedding {
    private int idPaket;
    private String namaPaket;
    private int harga;

    public PaketWedding(int idPaket, String namaPaket, int harga) {
        this.idPaket = idPaket;
        this.namaPaket = namaPaket;
        this.harga = harga;
    }

    public int getIdPaket() {
        return idPaket;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}