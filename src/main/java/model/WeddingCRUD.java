package model;

import java.util.ArrayList;
import java.util.Scanner;

public class WeddingCRUD {
    private ArrayList<PaketWedding> daftarPaket;
    private ArrayList<Pelanggan> daftarPelanggan;
    private ArrayList<PemesananWedding> daftarPemesanan;
    private Scanner scanner;

    public WeddingCRUD(Scanner scanner) {
        this.daftarPelanggan = new ArrayList<>();
        this.daftarPemesanan = new ArrayList<>();

        this.daftarPaket = new ArrayList<>();
        daftarPaket.add(new PaketWedding(1, "Paket Bismillah Lancar", 15000000));
        daftarPaket.add(new PaketWedding(2, "Paket Gas Nikah", 25000000));
        daftarPaket.add(new PaketWedding(3, "Paket Akhirnya Sah", 40000000));
        daftarPaket.add(new PaketWedding(4, "Paket Cinta Sampai Tua", 55000000));
        daftarPaket.add(new PaketWedding(5, "Paket Lancar Sampai Hari H", 75000000));

        this.scanner = scanner;
    }

    public void tambahPelanggan() {
        System.out.println("=====================================");
        System.out.println("|          TAMBAH PELANGGAN          |");
        System.out.println("=====================================");
        System.out.print("ID Pelanggan: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean sudahAda = false;
        for (Pelanggan p : daftarPelanggan) {
            if (p.getIdPelanggan() == id) {
                sudahAda = true;
                break;
            }
        }
        if (sudahAda) {
            System.out.println("Yaahh.. ID Pelanggan sudah dipakai :(");
            return;
        }

        System.out.print("Nama Pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("No HP: ");
        String noHp = scanner.nextLine();

        daftarPelanggan.add(new Pelanggan(id, nama, noHp));
        System.out.println("YAYY!! Data pelanggan berhasil ditambahkan :D");
    }

    public void tampilkanPelanggan() {
        System.out.println("=====================================");
        System.out.println("|          DAFTAR PELANGGAN          |");
        System.out.println("=====================================");
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Yaaahh.. belum ada data pelanggan :(");
            return;
        }
        for (Pelanggan p : daftarPelanggan) {
            System.out.println("ID Pelanggan: " + p.getIdPelanggan());
            System.out.println("Nama Pelanggan: " + p.getNama());
            System.out.println("No HP: " + p.getNoHp());
            System.out.println("=====================================");
        }
    }

    public void updatePelanggan() {
        System.out.println("=====================================");
        System.out.println("|          UPDATE PELANGGAN          |");
        System.out.println("=====================================");
        System.out.print("Masukkan ID Pelanggan: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        Pelanggan p = null;
        for (Pelanggan pelanggan : daftarPelanggan) {
            if (pelanggan.getIdPelanggan() == idTarget) {
                p = pelanggan;
                break;
            }
        }
        if (p == null) {
            System.out.println("ID Pelanggan tidak ditemukan :(");
            return;
        }

        System.out.print("Nama Baru: ");
        String nama = scanner.nextLine();

        System.out.print("No HP Baru: ");
        String noHp = scanner.nextLine();

        p.setNama(nama);
        p.setNoHp(noHp);

        System.out.println("Data pelanggan berhasil diperbarui yah ^__^");
    }

    public void hapusPelanggan() {
        System.out.println("=====================================");
        System.out.println("|          HAPUS PELANGGAN           |");
        System.out.println("=====================================");
        System.out.print("Masukkan ID Pelanggan: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < daftarPelanggan.size(); i++) {
            if (daftarPelanggan.get(i).getIdPelanggan() == idTarget) {
                daftarPelanggan.remove(i);
                System.out.println("Data pelanggan berhasil dihapus yaa!!");
                return;
            }
        }
        System.out.println("ID Pelanggan tidak ditemukan :(");
    }

    public void tambahPaket() {
        System.out.println("=====================================");
        System.out.println("|        TAMBAH PAKET WEDDING        |");
        System.out.println("=====================================");
        System.out.print("ID Paket: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean sudahAda = false;
        for (PaketWedding pw : daftarPaket) {
            if (pw.getIdPaket() == id) {
                sudahAda = true;
                break;
            }
        }
        if (sudahAda) {
            System.out.println("Yaahh.. ID Paket sudah dipakai :(");
            return;
        }

        System.out.print("Nama Paket: ");
        String nama = scanner.nextLine();

        System.out.print("Harga: ");
        int harga = scanner.nextInt();
        scanner.nextLine();

        daftarPaket.add(new PaketWedding(id, nama, harga));
        System.out.println("YAYY!! Paket wedding berhasil ditambahkan :D");
    }

    public void tampilkanPaket() {
        System.out.println("=====================================");
        System.out.println("|        DAFTAR PAKET WEDDING        |");
        System.out.println("=====================================");
        if (daftarPaket.isEmpty()) {
            System.out.println("Yaaahh.. belum ada data paket wedding :(");
            return;
        }
        for (PaketWedding pw : daftarPaket) {
            System.out.println("ID Paket: " + pw.getIdPaket());
            System.out.println("Nama Paket: " + pw.getNamaPaket());
            System.out.println("Harga: Rp" + pw.getHarga());
            System.out.println("=====================================");
        }
    }

    public void updatePaket() {
        System.out.println("=====================================");
        System.out.println("|      UPDATE HARGA PAKET WEDDING    |");
        System.out.println("=====================================");
        System.out.print("Masukkan ID Paket: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        PaketWedding pw = null;
        for (PaketWedding paket : daftarPaket) {
            if (paket.getIdPaket() == idTarget) {
                pw = paket;
                break;
            }
        }
        if (pw == null) {
            System.out.println("ID Paket tidak ditemukan :(");
            return;
        }

        System.out.print("Harga Baru: ");
        int harga = scanner.nextInt();
        scanner.nextLine();

        pw.setHarga(harga);
        System.out.println("Harga paket wedding berhasil diperbarui yah ^__^");
    }

    public void hapusPaket() {
        System.out.println("=====================================");
        System.out.println("|         HAPUS PAKET WEDDING        |");
        System.out.println("=====================================");
        System.out.print("Masukkan ID Paket: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < daftarPaket.size(); i++) {
            if (daftarPaket.get(i).getIdPaket() == idTarget) {
                daftarPaket.remove(i);
                System.out.println("Paket wedding berhasil dihapus yaa!!");
                return;
            }
        }
        System.out.println("ID Paket tidak ditemukan :(");
    }

    public void tambahPemesanan() {
        System.out.println("=====================================");
        System.out.println("|      TAMBAH PEMESANAN WEDDING      |");
        System.out.println("=====================================");

        if (daftarPelanggan.isEmpty()) {
            System.out.println("Yaaahh.. belum ada data pelanggan, tambah dulu yuk :(");
            return;
        }
        if (daftarPaket.isEmpty()) {
            System.out.println("Yaaahh.. belum ada data paket wedding :(");
            return;
        }

        System.out.print("ID Booking: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean sudahAda = false;
        for (PemesananWedding pmw : daftarPemesanan) {
            if (pmw.getIdBooking() == id) {
                sudahAda = true;
                break;
            }
        }
        if (sudahAda) {
            System.out.println("Yaahh.. ID Booking sudah dipakai :(");
            return;
        }

        tampilkanPelanggan();
        System.out.print("Pilih ID Pelanggan: ");
        int idPelanggan = scanner.nextInt();
        scanner.nextLine();
        Pelanggan pelanggan = null;
        for (Pelanggan p : daftarPelanggan) {
            if (p.getIdPelanggan() == idPelanggan) {
                pelanggan = p;
                break;
            }
        }
        if (pelanggan == null) {
            System.out.println("ID Pelanggan tidak ditemukan :(");
            return;
        }

        tampilkanPaket();
        System.out.print("Pilih ID Paket: ");
        int idPaket = scanner.nextInt();
        scanner.nextLine();
        PaketWedding paket = null;
        for (PaketWedding pw : daftarPaket) {
            if (pw.getIdPaket() == idPaket) {
                paket = pw;
                break;
            }
        }
        if (paket == null) {
            System.out.println("ID Paket tidak ditemukan :(");
            return;
        }

        System.out.print("Venue: ");
        String venue = scanner.nextLine();

        System.out.print("Tanggal Acara: ");
        String tanggalAcara = scanner.nextLine();

        System.out.print("Jumlah Pax: ");
        int pax = scanner.nextInt();
        scanner.nextLine();

        daftarPemesanan.add(new PemesananWedding(id, pelanggan, paket, venue, tanggalAcara, pax));
        System.out.println("Pemesanan wedding berhasil ditambahkan, happy wedding :D");
    }

    public void tampilkanPemesanan() {
        System.out.println("=====================================");
        System.out.println("|      DAFTAR PEMESANAN WEDDING      |");
        System.out.println("=====================================");
        if (daftarPemesanan.isEmpty()) {
            System.out.println("Yaaahh.. belum ada data pemesanan wedding :(");
            return;
        }
        for (PemesananWedding pmw : daftarPemesanan) {
            System.out.println("ID Booking: " + pmw.getIdBooking());
            System.out.println("Pelanggan: " + pmw.getPelanggan().getNama());
            System.out.println("Paket: " + pmw.getPaketWedding().getNamaPaket());
            System.out.println("Venue: " + pmw.getVenue());
            System.out.println("Tanggal Acara: " + pmw.getTanggalAcara());
            System.out.println("Pax: " + pmw.getPax());
            System.out.println("=====================================");
        }
    }

    public void updatePemesanan() {
        System.out.println("=====================================");
        System.out.println("|      UPDATE PEMESANAN WEDDING      |");
        System.out.println("=====================================");
        System.out.print("Masukkan ID Booking: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        PemesananWedding pmw = null;
        for (PemesananWedding p : daftarPemesanan) {
            if (p.getIdBooking() == idTarget) {
                pmw = p;
                break;
            }
        }
        if (pmw == null) {
            System.out.println("ID Booking tidak ditemukan :(");
            return;
        }

        System.out.print("Venue Baru: ");
        String venue = scanner.nextLine();

        System.out.print("Tanggal Acara Baru: ");
        String tanggalAcara = scanner.nextLine();

        System.out.print("Pax Baru: ");
        int pax = scanner.nextInt();
        scanner.nextLine();

        pmw.setVenue(venue);
        pmw.setTanggalAcara(tanggalAcara);
        pmw.setPax(pax);

        System.out.println("Pemesanan wedding berhasil diperbarui yah ^__^");
    }

    public void hapusPemesanan() {
        System.out.println("=====================================");
        System.out.println("|       HAPUS PEMESANAN WEDDING      |");
        System.out.println("=====================================");
        System.out.print("Masukkan ID Booking: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < daftarPemesanan.size(); i++) {
            if (daftarPemesanan.get(i).getIdBooking() == idTarget) {
                daftarPemesanan.remove(i);
                System.out.println("Pemesanan wedding berhasil dihapus yaa!!");
                return;
            }
        }
        System.out.println("ID Booking tidak ditemukan :(");
    }
}