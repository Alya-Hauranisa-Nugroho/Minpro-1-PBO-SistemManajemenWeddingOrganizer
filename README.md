# 💍 Sistem Manajemen Wedding Organizer

### Houry do Wedds

**Nama:** Houry do Wedds

---

## 📌 Deskripsi Program

**Houry do Wedds** merupakan program berbasis bahasa pemrograman **Java** yang digunakan untuk mengelola data pada layanan **Wedding Organizer** secara sederhana.

Program ini dibuat dengan menerapkan konsep **Object-Oriented Programming (OOP)** serta fitur **CRUD (Create, Read, Update, Delete)**. Pengguna dapat mengelola beberapa data yang berkaitan dengan penyelenggaraan acara pernikahan, seperti data pelanggan, paket wedding, vendor, dan jadwal kegiatan.

Program dijalankan melalui **Command Line Interface (CLI)** dengan menu yang dapat dipilih oleh pengguna sesuai kebutuhan.

---

## 🛠️ Teknologi dan Konsep yang Digunakan

* **Bahasa Pemrograman:** Java
* **Konsep:** Object-Oriented Programming (OOP)
* **Struktur Data:** `ArrayList`
* **Input:** `Scanner`
* **Interface:** Command Line Interface (CLI)
* **Fitur:** CRUD

---

## 📂 Struktur Class

Program **Houry do Wedds** terdiri dari beberapa class dengan fungsi yang berbeda.

### 1. `SistemHouryDoWedds.java`

Merupakan **class utama (main class)** yang menjadi entry point program. Class ini digunakan untuk menjalankan program, menampilkan menu utama, menerima input pilihan pengguna, serta memanggil fungsi yang terdapat pada `WeddingCRUD.java`.

### 2. `PaketWedding.java`

Merupakan **class entitas** yang digunakan untuk menyimpan data paket wedding yang tersedia.

Data yang disimpan meliputi:

* ID paket
* Nama paket
* Harga paket

Class ini menerapkan **constructor, getter, setter, dan encapsulation**.

### 3. `Vendor.java`

Merupakan **class entitas** yang digunakan untuk menyimpan informasi mengenai vendor yang bekerja sama dengan Wedding Organizer.

Data vendor meliputi informasi seperti:

* ID vendor
* Nama vendor
* Jenis vendor
* Kontak vendor

Class ini juga menerapkan **constructor, getter, setter, dan encapsulation**.

### 4. `Pelanggan.java`

Merupakan **class entitas** yang digunakan untuk menyimpan informasi mengenai pelanggan yang menggunakan layanan Wedding Organizer.

Data yang disimpan meliputi:

* ID pelanggan
* Nama pelanggan
* Nomor telepon
* Alamat

Class ini menerapkan **constructor, getter, setter, dan encapsulation**.

### 5. `JadwalKegiatan.java`

Merupakan **class entitas** yang digunakan untuk menyimpan data jadwal kegiatan dalam penyelenggaraan acara.

Data yang disimpan meliputi:

* ID jadwal
* Nama kegiatan
* Tanggal
* Waktu
* Keterangan

Class ini juga menerapkan **constructor, getter, setter, dan encapsulation**.

### 6. `WeddingCRUD.java`

Merupakan class yang menangani proses **CRUD** dalam program.

Class ini menggunakan `ArrayList` untuk menyimpan data:

* Paket Wedding
* Vendor
* Pelanggan
* Jadwal Kegiatan

`WeddingCRUD.java` menyediakan fungsi untuk menambahkan, menampilkan, mengubah, dan menghapus data.

---

# 🔄 Alur Program

Alur program dimulai ketika `SistemHouryDoWedds.java` dijalankan. Sistem akan menampilkan menu utama yang dapat digunakan pengguna untuk mengelola data Wedding Organizer.

Secara umum, alur program adalah:

```text
Program dijalankan
       ↓
   Menu Utama
       ↓
Pilih Menu CRUD
       ↓
Pilih Jenis Data
       ↓
Input / Proses Data
       ↓
Data Disimpan atau Diubah
       ↓
Kembali ke Menu Utama
       ↓
      Keluar
```

---

## ➕ 1. Tambah Data

Menu **Tambah Data** digunakan untuk menambahkan data baru ke dalam sistem.

Pengguna dapat memilih jenis data yang ingin ditambahkan, yaitu:

* Paket Wedding
* Vendor
* Pelanggan
* Jadwal Kegiatan

Setelah memilih jenis data, sistem akan meminta pengguna memasukkan informasi yang diperlukan. Data yang berhasil ditambahkan akan disimpan ke dalam `ArrayList`.

Contoh paket wedding yang tersedia:

| ID | Nama Paket                   |        Harga |
| -: | ---------------------------- | -----------: |
|  1 | Paket Bismillah Lancar       | Rp15.000.000 |
|  2 | Paket Gas Nikah              | Rp25.000.000 |
|  3 | Paket Akhirnya Sah           | Rp40.000.000 |
|  4 | Paket Cinta Sampai Tua       | Rp55.000.000 |
|  5 | Paket Dari Chat ke Pelaminan | Rp75.000.000 |

---

## 👀 2. Tampilkan Data

Menu **Tampilkan Data** digunakan untuk melihat data yang telah tersimpan dalam sistem.

Pengguna dapat memilih data yang ingin ditampilkan, seperti:

* Data Paket Wedding
* Data Vendor
* Data Pelanggan
* Data Jadwal Kegiatan

Sistem kemudian menampilkan seluruh data yang tersimpan pada `ArrayList` sesuai dengan pilihan pengguna.

---

## ✏️ 3. Update Data

Menu **Update Data** digunakan untuk mengubah data yang telah tersimpan.

Pengguna terlebih dahulu memilih jenis data yang ingin diubah, kemudian memasukkan ID data yang akan diperbarui.

Jika ID ditemukan, sistem akan meminta data baru dan memperbarui informasi tersebut.

Contohnya, pengguna dapat mengubah:

* Nama atau harga paket wedding
* Informasi vendor
* Data pelanggan
* Jadwal kegiatan

---

## 🗑️ 4. Hapus Data

Menu **Hapus Data** digunakan untuk menghapus data yang sudah tidak diperlukan.

Pengguna memilih jenis data yang ingin dihapus, kemudian memasukkan ID dari data tersebut.

Sistem akan melakukan pencarian berdasarkan ID. Jika data ditemukan, sistem akan menghapus data dari `ArrayList` dan menampilkan informasi bahwa data berhasil dihapus.

---

## 🚪 5. Keluar

Menu **Keluar** digunakan untuk mengakhiri program.

Apabila pengguna memilih menu ini, sistem akan menampilkan pesan bahwa program telah selesai dan kemudian menghentikan program.

---

# ⭐ Nilai Tambah

Program **Houry do Wedds** juga menerapkan beberapa nilai tambah yang mendukung penerapan konsep dasar OOP.

## 🔐 1. Access Modifier

Program menerapkan **access modifier `private`** pada atribut yang terdapat di dalam class entitas.

Contoh:

```java
private int idPaket;
private String namaPaket;
private double harga;
```

Penggunaan `private` membuat atribut tidak dapat diakses secara langsung dari luar class.

Atribut tersebut dapat diakses melalui method **getter** dan diubah melalui **setter**.

---

## 📦 2. Encapsulation

Konsep **encapsulation** diterapkan dengan membatasi akses langsung terhadap atribut class menggunakan `private`.

Contohnya:

```java
public String getNamaPaket() {
    return namaPaket;
}

public void setNamaPaket(String namaPaket) {
    this.namaPaket = namaPaket;
}
```

Dengan demikian, data pada object dapat dikontrol melalui method yang telah disediakan oleh class.

Penerapan encapsulation terdapat pada class:

* `PaketWedding`
* `Vendor`
* `Pelanggan`
* `JadwalKegiatan`

---

## ✅ 3. Validasi Input

Program juga menerapkan **validasi input** untuk mengurangi kesalahan ketika pengguna memasukkan data.

Validasi digunakan untuk beberapa kondisi, seperti:

* Memastikan input angka sesuai dengan tipe data yang dibutuhkan.
* Memastikan pilihan menu sesuai dengan pilihan yang tersedia.
* Memastikan ID data ditemukan sebelum melakukan update.
* Memastikan ID data ditemukan sebelum melakukan delete.
* Menampilkan pesan kesalahan apabila input tidak sesuai.

Dengan adanya validasi, program dapat berjalan dengan lebih terkontrol dan mengurangi kemungkinan terjadinya error akibat input pengguna.

---

# 🖥️ Dokumentasi Program

## 1. Tampilan Menu Utama

Menu utama merupakan tampilan pertama ketika program dijalankan. Menu ini digunakan sebagai pusat navigasi untuk mengakses berbagai fitur yang tersedia pada sistem.

> 📷 *Masukkan screenshot menu utama di sini.*

---

## 2. Tambah Data

Pada menu ini, pengguna dapat memilih jenis data yang ingin ditambahkan, yaitu **Paket Wedding, Vendor, Pelanggan, atau Jadwal Kegiatan**.

> 📷 *Masukkan screenshot menu tambah data di sini.*

### Tambah Data Paket Wedding

Pengguna dapat memasukkan ID, nama paket, dan harga paket wedding.

> 📷 *Masukkan screenshot tambah paket wedding di sini.*

### Tambah Data Vendor

Pengguna dapat memasukkan informasi vendor yang digunakan dalam layanan Wedding Organizer.

> 📷 *Masukkan screenshot tambah vendor di sini.*

### Tambah Data Pelanggan

Pengguna dapat memasukkan informasi pelanggan yang menggunakan layanan Wedding Organizer.

> 📷 *Masukkan screenshot tambah pelanggan di sini.*

### Tambah Data Jadwal Kegiatan

Pengguna dapat memasukkan informasi mengenai kegiatan dan jadwal acara.

> 📷 *Masukkan screenshot tambah jadwal di sini.*

---

## 3. Tampilkan Data

Menu ini digunakan untuk menampilkan data yang telah tersimpan dalam sistem berdasarkan jenis data yang dipilih.

> 📷 *Masukkan screenshot tampil data di sini.*

---

## 4. Update Data

Menu ini digunakan untuk memperbarui data yang telah tersimpan. Pengguna memilih jenis data, memasukkan ID, kemudian memasukkan informasi baru.

> 📷 *Masukkan screenshot proses update data di sini.*

---

## 5. Hapus Data

Menu ini digunakan untuk menghapus data berdasarkan ID. Sistem akan melakukan pengecekan terlebih dahulu sebelum menghapus data.

> 📷 *Masukkan screenshot proses hapus data di sini.*

---

## 6. Keluar

Menu keluar digunakan untuk mengakhiri penggunaan sistem.

> 📷 *Masukkan screenshot program ketika keluar di sini.*

---

# 📋 Ringkasan Fitur

| Fitur          | Fungsi                             |
| -------------- | ---------------------------------- |
| Tambah Data    | Menambahkan data ke dalam sistem   |
| Tampilkan Data | Menampilkan data yang tersimpan    |
| Update Data    | Mengubah data yang telah tersimpan |
| Hapus Data     | Menghapus data berdasarkan ID      |
| Keluar         | Mengakhiri program                 |

---

# 🎯 Kesimpulan

**Houry do Wedds** merupakan program sederhana berbasis Java yang dibuat untuk membantu pengelolaan data pada layanan **Wedding Organizer**.

Program ini menerapkan konsep dasar **Object-Oriented Programming (OOP)** melalui penggunaan beberapa class entitas serta class yang menangani proses CRUD. Data disimpan menggunakan `ArrayList` dan input pengguna diproses menggunakan `Scanner`.

Selain itu, program telah menerapkan **access modifier, encapsulation, dan validasi input** sebagai nilai tambah dalam penerapan konsep Pemrograman Berorientasi Objek.

---

# 📁 Repository

Repository ini dibuat sebagai bagian dari **Mini Project Pemrograman Berorientasi Objek (PBO)**.

### Format Nama Repository

```text
Minpro-angka-PBO-NamaProgram
```

### Contoh

```text
Minpro-1-PBO-HouryDoWedds
```
