package model;

public class PemesananWedding {
    private int idBooking;
    private Pelanggan pelanggan;
    private PaketWedding paketWedding;
    private String venue;
    private String tanggalAcara;
    private int pax;

    public PemesananWedding(int idBooking, Pelanggan pelanggan, PaketWedding paketWedding, String venue, String tanggalAcara, int pax) {
        this.idBooking = idBooking;
        this.pelanggan = pelanggan;
        this.paketWedding = paketWedding;
        this.venue = venue;
        this.tanggalAcara = tanggalAcara;
        this.pax = pax;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public PaketWedding getPaketWedding() {
        return paketWedding;
    }

    public String getVenue() {
        return venue;
    }

    public String getTanggalAcara() {
        return tanggalAcara;
    }

    public int getPax() {
        return pax;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setTanggalAcara(String tanggalAcara) {
        this.tanggalAcara = tanggalAcara;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }
}