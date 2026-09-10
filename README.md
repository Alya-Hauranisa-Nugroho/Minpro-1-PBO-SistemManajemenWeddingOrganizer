# 💍 Sistem Manajemen Wedding Organizer

## Houry do Wedds

#### Alya Hauranisa Nugroho | 2509116005 | Sistem Informasi A 2025
#### Mata Kuliah: Pemrograman Berorientasi Objek

---

## 📌 Deskripsi Program

Sistem Manajemen Wedding Organizer merupakan program berbasis bahasa pemrograman Java yang digunakan untuk mengelola data pada usaha Wedding Organizer "Houry Do Wedds" secara sederhana.

Program ini dibuat dengan menerapkan konsep Object Oriented Programming atau OOP, serta fitur fitur sederhana yang mendukung CRUD (Create, Read, Update, Delete). Program ini memungkinkan pengguna untuk mengelola data pelanggan, paket wedding, serta pemesanan wedding yang mencatat informasi seperti pelanggan yang melakukan pemesanan, paket wedding yang dipilih, venue, pax, serta tanggal pelaksanaan acara.

---

## 📂 Struktur Class

Program Sistem Manajemen Wedding Organizer terdiri dari beberapa class dengan fungsi yang berbeda, diantaranya yaitu:

### 1. `WeddingOrganizer.java`
Class ini merupakan class utama yang menjadi _entry point_ program. Class ini digunakan untuk menjalankan program, menampilkan menu utama, serta memanggil fungsi yang terdapat pada `WeddingCRUD.java`.
Menu utama pada program ini terdiri dari:
1. Menu Tambah
2. Menu Tampilkan
3. Menu Update
4. Menu Hapus
5. Keluar >>>

### 2. `WeddingCRUD.java`
Class ini merupakan class service yang menangani proses utama CRUD pada program. Class ini menyediakan fungsi untuk menambahkan, menampilkan, mengubah, dan menghapus data.

Data yang dikelola pada class ini meliputi:
* Pelanggan
* Paket Wedding
* Pemesanan Wedding

Class ini juga menggunakan `ArrayList` untuk menyimpan data selama program berjalan.

### 3. `Pelanggan.java`
Class ini merupakan class data yang merepresentasikan pelanggan yang melakukan pemesanan pada wedding organizer Class ini memiliki informasi pelanggan yang berupa ID pelanggan, nama pelanggan, dan no HP.

Atribut yang diterapkan pada class ini meliputi:
* idPelanggan
* nama
* noHp

### 4. `PaketWedding.java`
Class ini merupakan class data yang merepresentasikan paket wedding yang tersedia. Setiap paket memiliki informasi berupa ID paket, nama paket, dan harga yang dapat digunakan dalam proses pemesanan.

Atribut yang diterapkan pada class ini meliputi:

* idPaket
* namaPaket
* harga

### 5. `PemesananWedding.java`
Class ini merupakan class data yang merepresentasikan data pemesanan wedding. Class ini menyimpan informasi mengenai pelanggan, paket yang dipilih, serta detail dari acara wedding yang telah dibooking.

Atribut yang diterapkan pada class ini meliputi:

* idBooking
* pelanggan
* paketWedding
* venue
* tanggalAcara
* pax

---

## 🔄 Dokumentasi Alur Program

Secara umum, alur program dimulai ketika pengguna menjalankan program selanjutnya dan akan diarahkan ke menu utama yang terdiri dari menu Tambah, Tampilkan, Update, Hapus, dan Keluar. Pengguna dapat memilih menu sesuai kebutuhan, kemudian memilih data yang ingin dikelola, yaitu data pelanggan, paket wedding, atau pemesanan wedding. 

Apabila pengguna telah menyelesaikan proses CRUD yang dipilih dan memilih menu “Kembali ke Menu Utama”, program akan kembali ke menu utama sehingga pengguna dapat melakukan proses lainnya. Program akan terus berjalan selama pengguna belum memilih menu Keluar.

---

### **Menu Utama**
<img width="472" height="341" alt="image" src="https://github.com/user-attachments/assets/e2ec58d7-0361-4558-8b5e-46fbd85224e4" />

<img width="470" height="326" alt="image" src="https://github.com/user-attachments/assets/4e3910f0-7e09-477f-a1a5-c9cb82d8c35a" />

Pada gambar di atas, saya menampilkan menu utama dari program yang telah dirancang. Terdapat 5 menu utama yang dapat dipilih, yaitu menu untuk menambahkan data, menampilkan data, menghapus data, mengupdate data, serta menu untuk keluar dari program. Pengguna akan diminta untuk memilih salah satu dari kelima menu tersebut.

---

### **1. Menu Tambah**

<img width="465" height="219" alt="image" src="https://github.com/user-attachments/assets/994e7fa4-0f1d-4aa8-ba09-fb885bb358a2" />

Ketika pengguna memilih “1” pada menu utama, pengguna akan masuk ke dalam Menu Tambah, di mana menu ini memungkinkan pengguna untuk memasukkan data baru pada data pelanggan, paket wedding, maupun pemesanan wedding. Pengguna dapat memilih salah satu jenis data yang ingin ditambahkan sesuai dengan kebutuhan. Pada tampilan tersebut, saya memilih menu “1", "yaitu Tambah Pelanggan”, sehingga program akan melanjutkan ke proses untuk memasukkan data pelanggan.

* **Tambah Pelanggan**

<img width="568" height="411" alt="image" src="https://github.com/user-attachments/assets/9dbccc13-34a0-4a31-ad23-4c82098f334b" />

Selanjutnya, program akan menampilkan tempat untuk memasukkan data pelanggan. Pengguna diminta memasukkan ID Pelanggan, Nama Pelanggan, dan No HP. Setelah seluruh data berhasil dimasukkan, program menampilkan pesan bahwa data pelanggan berhasil ditambahkan, kemudian kembali menampilkan Menu Tambah agar pengguna dapat melanjutkan proses penambahan data lainnya.

Berikut merupakan proses penambahan data lainnya:

* **Tambah Paket Wedding**

<img width="542" height="224" alt="image" src="https://github.com/user-attachments/assets/147a4c5b-e140-4a0b-9fff-0c76b142049d" />

* **Tambah Pemesanan Wedding**

<img width="463" height="362" alt="image" src="https://github.com/user-attachments/assets/2cc31b67-7149-4bb5-a765-a501251e9c0d" />

<img width="706" height="876" alt="image" src="https://github.com/user-attachments/assets/65cdc62c-9d67-49fe-b4c7-614ca256c260" />

Berdasarkan gambar di atas, diketahui bahwa pengguna dapat menambahkan:

* **Pelanggan**, dengan memasukkan ID, nama, dan nomor HP.
* **Paket Wedding**, dengan memasukkan ID, nama paket, dan harga.
* **Pemesanan Wedding**, dengan memilih pelanggan dan paket wedding yang sudah tersedia, kemudian memasukkan venue, tanggal acara, dan jumlah pax.


* **Kembali ke Menu Utama**
<img width="468" height="569" alt="image" src="https://github.com/user-attachments/assets/5c345a71-7f5b-4056-afcf-876e7fb374ca" />

Apabila telah menyelesaikan proses tambah, pengguna dapat memilih menu "4" untuk keluar dari menu tambah dan kembali ke menu utama.

---

### **2. Menu Tampilkan**

<img width="484" height="245" alt="image" src="https://github.com/user-attachments/assets/f43ce51e-aff5-43e8-b753-e22dc519e881" />

Ketika pengguna memilih “2” pada menu utama, pengguna akan masuk ke dalam Menu Tampilkan, di mana menu ini memungkinkan pengguna untuk melihat data yang sudah ada pada data pelanggan, paket wedding, maupun pemesanan wedding. Berikut merupakan tampilan untuk Menu Tampilkan di setiap data:

* **Tampilkan Pelanggan**

<img width="466" height="213" alt="image" src="https://github.com/user-attachments/assets/6a5c670e-ce87-42a5-818e-132a04b48806" />

* **Tampilkan Paket Wedding**

<img width="480" height="756" alt="image" src="https://github.com/user-attachments/assets/b9631b23-686c-4740-ac43-4ce9df8fe1f5" />

* **Tampilkan Pemesanan Wedding**

<img width="469" height="293" alt="image" src="https://github.com/user-attachments/assets/84801c1a-3880-4d73-8a4c-4f80163d660b" />

* **Kembali ke Menu Utama**

<img width="477" height="571" alt="image" src="https://github.com/user-attachments/assets/70c93b55-9aab-44fe-8019-d81b30a2295a" />

Pengguna dapat memilih menu "4" untuk keluar dari menu tampilkan dan kembali ke menu utama.

---

### **3. Menu Update**

Ketika pengguna memilih “3” pada menu utama, pengguna akan masuk ke dalam Menu Update. Menu ini digunakan untuk mengubah data yang sudah tersimpan pada program. Pengguna dapat memilih data yang ingin diperbarui, yaitu data pelanggan, paket wedding, maupun pemesanan wedding.

<img width="471" height="241" alt="image" src="https://github.com/user-attachments/assets/60b7d882-687e-429e-bb3d-1a03c0d6ba15" />

Pada Menu Update, pengguna dapat memilih salah satu dari tiga jenis data yang tersedia untuk diperbarui. Setelah memilih jenis data, pengguna akan diminta memasukkan ID dari data yang ingin diubah. Program kemudian akan mencari data berdasarkan ID tersebut. Apabila data ditemukan, pengguna dapat memasukkan informasi baru sesuai dengan atribut yang dapat diperbarui.

Berikut merupakan proses update pada setiap data:

* **Update Pelanggan**

<img width="531" height="225" alt="image" src="https://github.com/user-attachments/assets/a087e433-8374-4fee-a40a-12dba07a002d" />


Pada proses Update Pelanggan, pengguna diminta memasukkan ID pelanggan yang ingin diperbarui. Setelah ID ditemukan, pengguna dapat mengubah nama pelanggan dan No HP. Setelah data berhasil diperbarui, program akan menampilkan pesan bahwa data pelanggan berhasil diupdate.

* **Update Paket Wedding**

<img width="593" height="191" alt="image" src="https://github.com/user-attachments/assets/5a60d5e8-793e-40dc-ae32-ab8738bb404d" />


Pada proses Update Paket Wedding, pengguna diminta memasukkan ID paket yang ingin diperbarui. Setelah paket ditemukan, pengguna dapat mengubah harga paket wedding. Setelah proses berhasil dilakukan, program akan menampilkan pesan bahwa data paket berhasil diupdate.

* **Update Pemesanan Wedding**

<img width="577" height="248" alt="image" src="https://github.com/user-attachments/assets/77a7562b-80d5-499a-942d-aed56aaf90b0" />

Pada proses Update Pemesanan Wedding, pengguna diminta memasukkan ID booking yang ingin diperbarui. Setelah data ditemukan, pengguna dapat mengubah venue, tanggal acara, dan jumlah pax sesuai dengan kebutuhan. Setelah data berhasil diperbarui, program akan menampilkan pesan bahwa data pemesanan berhasil diupdate.

* **Kembali ke Menu Utama**

<img width="473" height="564" alt="image" src="https://github.com/user-attachments/assets/7b1b44b7-b165-470f-8d9f-5d6d208839cb" />

Apabila telah menyelesaikan proses update, pengguna dapat memilih menu “4” untuk keluar dari Menu Update dan kembali ke menu utama.

---

### **4. Menu Hapus**

Ketika pengguna memilih **“4”** pada menu utama, pengguna akan masuk ke dalam **Menu Hapus**. Menu ini digunakan untuk menghapus data yang sudah tersimpan pada sistem. Pengguna dapat memilih data yang ingin dihapus, yaitu data pelanggan, paket wedding, maupun pemesanan wedding.

<img width="..." height="..." alt="image" src="..." />

Pada Menu Hapus, pengguna dapat memilih salah satu jenis data yang tersedia. Setelah memilih jenis data, pengguna akan diminta memasukkan ID dari data yang ingin dihapus. Program kemudian akan mencari data berdasarkan ID tersebut. Apabila data ditemukan, data akan dihapus dari daftar penyimpanan.

Berikut merupakan proses penghapusan pada setiap data:

* **Hapus Pelanggan**

<img width="..." height="..." alt="image" src="..." />

Pada proses **Hapus Pelanggan**, pengguna diminta memasukkan ID pelanggan yang ingin dihapus. Program akan mencari ID tersebut pada daftar pelanggan. Apabila ID ditemukan, data pelanggan akan dihapus dan program akan menampilkan pesan bahwa data pelanggan berhasil dihapus.

* **Hapus Paket Wedding**

<img width="..." height="..." alt="image" src="..." />

Pada proses **Hapus Paket Wedding**, pengguna diminta memasukkan ID paket yang ingin dihapus. Program akan mencari ID tersebut pada daftar paket wedding. Apabila ID ditemukan, data paket akan dihapus dari sistem dan program akan menampilkan pesan bahwa data paket berhasil dihapus.

* **Hapus Pemesanan Wedding**

<img width="..." height="..." alt="image" src="..." />

Pada proses **Hapus Pemesanan Wedding**, pengguna diminta memasukkan ID booking yang ingin dihapus. Program akan mencari ID booking tersebut pada daftar pemesanan. Apabila ditemukan, data pemesanan akan dihapus dan program akan menampilkan pesan bahwa data pemesanan berhasil dihapus.

* **Kembali ke Menu Utama**

<img width="..." height="..." alt="image" src="..." />

Apabila telah menyelesaikan proses hapus, pengguna dapat memilih menu **“4”** untuk keluar dari Menu Hapus dan kembali ke menu utama.


### Menu Update

Menu Update digunakan untuk mengubah data yang sudah tersimpan.

Pengguna dapat melakukan perubahan pada:

* Nama dan nomor HP pelanggan
* Harga paket wedding
* Venue, tanggal acara, dan jumlah pax pada pemesanan

### Menu Hapus

Menu Hapus digunakan untuk menghapus data berdasarkan ID yang dimasukkan oleh pengguna.

Pengguna dapat menghapus:

* Data pelanggan
* Data paket wedding
* Data pemesanan wedding

### 🚪 Keluar

Menu Keluar digunakan untuk mengakhiri program.

---

## ⭐ Nilai Tambah Program

Selain menerapkan CRUD dan konsep OOP, program ini memiliki beberapa nilai tambah sebagai berikut.

### 🔐 1. Access Modifier

Program menerapkan access modifier **`private`** pada atribut dalam class seperti `Pelanggan`, `PaketWedding`, dan `PemesananWedding`.

Contohnya:

```java
private int idPelanggan;
private String nama;
private String noHp;
```

Penggunaan `private` membuat atribut tidak dapat diakses secara langsung dari luar class.

### 📦 2. Encapsulation

Konsep **encapsulation** diterapkan dengan menggunakan atribut `private` yang diakses melalui **getter dan setter**.

Contohnya:

```java
public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}
```

Dengan demikian, data dalam object dapat dikontrol melalui method yang telah disediakan oleh class.

Selain itu, tidak semua atribut memiliki setter. Contohnya, ID pada data pelanggan dan paket hanya ditentukan ketika object dibuat sehingga tidak dapat diubah melalui setter.

### ✅ 3. Validasi Input

Program juga memiliki validasi untuk membantu mencegah data yang tidak sesuai.

Beberapa validasi yang diterapkan antara lain:

* Mengecek agar ID pelanggan tidak sama dengan ID yang sudah tersimpan.
* Mengecek agar ID paket tidak sama dengan ID yang sudah tersimpan.
* Mengecek agar ID booking tidak sama dengan ID booking yang sudah tersimpan.
* Mengecek keberadaan ID pelanggan dan paket saat membuat pemesanan.
* Mengecek keberadaan ID saat melakukan update atau hapus data.
* Mengecek pilihan menu agar hanya pilihan yang tersedia yang dapat diproses.

Dengan adanya validasi tersebut, pengguna tidak dapat memasukkan ID yang sama untuk data yang seharusnya memiliki ID berbeda dan tidak dapat membuat pemesanan menggunakan pelanggan atau paket yang belum tersedia.

---

## 📋 Ringkasan Fitur

| Fitur       | Pelanggan | Paket Wedding | Pemesanan Wedding |
| ----------- | :-------: | :-----------: | :---------------: |
| Tambah      |     ✅     |       ✅       |         ✅         |
| Tampilkan   |     ✅     |       ✅       |         ✅         |
| Update      |     ✅     |       ✅       |         ✅         |
| Hapus       |     ✅     |       ✅       |         ✅         |
| Validasi ID |     ✅     |       ✅       |         ✅         |

---

## 💻 Contoh Data Paket Wedding

Program menyediakan beberapa data paket wedding awal:

| ID | Nama Paket                 |        Harga |
| -: | -------------------------- | -----------: |
|  1 | Paket Bismillah Lancar     | Rp15.000.000 |
|  2 | Paket Gas Nikah            | Rp25.000.000 |
|  3 | Paket Akhirnya Sah         | Rp40.000.000 |
|  4 | Paket Cinta Sampai Tua     | Rp55.000.000 |
|  5 | Paket Lancar Sampai Hari H | Rp75.000.000 |

Data tersebut dapat digunakan langsung saat pengguna membuat pemesanan wedding.

---

## 🎯 Kesimpulan

**Sistem Manajemen Wedding Organizer “Houry Do Wedds”** merupakan program sederhana berbasis Java yang digunakan untuk mengelola data pelanggan, paket wedding, dan pemesanan wedding.

Program ini menerapkan konsep **Object-Oriented Programming (OOP)**, **CRUD**, `ArrayList`, access modifier, encapsulation, serta validasi input. Dengan adanya fitur-fitur tersebut, program dapat membantu pengguna melakukan pengelolaan data wedding secara lebih terstruktur melalui menu yang tersedia.

---

## 📁 Repository

Repository ini menggunakan format penamaan:

```text
Minpro-1-PBO-HouryDoWedds
```

Program dibuat sebagai **Mini Project Pemrograman Berorientasi Objek (PBO)** untuk menerapkan konsep OOP dalam sebuah sistem sederhana yang memiliki proses pengelolaan data.



### 2. `PaketWedding.java`
Class ini merupakan class data yang digunakan untuk menyimpan data dan atribut dari paket wedding yang tersedia.
Atribut yang disimpan meliputi:
* ID paket
* Nama paket
* Harga

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
