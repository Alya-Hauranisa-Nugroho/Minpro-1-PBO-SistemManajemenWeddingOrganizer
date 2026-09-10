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
Class ini merupakan class utama yang menjadi _entry point_ program. Class ini digunakan untuk menjalankan program, menampilkan menu utama, serta memanggil fungsi yang terdapat pada WeddingCRUD.java.
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

<img width="473" height="244" alt="image" src="https://github.com/user-attachments/assets/b9937aff-0999-4fe3-afb4-7cbf83aa91fa" />

Pada Menu Hapus, pengguna dapat memilih salah satu jenis data yang tersedia. Setelah memilih jenis data, pengguna akan diminta memasukkan ID dari data yang ingin dihapus. Program kemudian akan mencari data berdasarkan ID tersebut. Apabila data ditemukan, data akan dihapus dari daftar penyimpanan.

Berikut merupakan proses penghapusan pada setiap data:

* **Hapus Pelanggan**

<img width="471" height="166" alt="image" src="https://github.com/user-attachments/assets/e26bbf15-903a-440f-a0cd-6b9de18b74b5" />


Pada proses Hapus Pelanggan, pengguna diminta memasukkan ID pelanggan yang ingin dihapus. Program akan mencari ID tersebut pada daftar pelanggan. Apabila ID ditemukan, data pelanggan akan dihapus dan program akan menampilkan pesan bahwa data pelanggan berhasil dihapus.

* **Hapus Paket Wedding**

<img width="462" height="163" alt="image" src="https://github.com/user-attachments/assets/91557b55-d901-4f1a-8ca6-695caf75f9f7" />

Pada proses Hapus Paket Wedding, pengguna diminta memasukkan ID paket yang ingin dihapus. Program akan mencari ID tersebut pada daftar paket wedding. Apabila ID ditemukan, data paket akan dihapus dari sistem dan program akan menampilkan pesan bahwa data paket berhasil dihapus.

* **Hapus Pemesanan Wedding**

<img width="492" height="163" alt="image" src="https://github.com/user-attachments/assets/bed7fbb2-88cc-4f17-a6ce-390c9803bc08" />


Pada proses **Hapus Pemesanan Wedding**, pengguna diminta memasukkan ID booking yang ingin dihapus. Program akan mencari ID booking tersebut pada daftar pemesanan. Apabila ditemukan, data pemesanan akan dihapus dan program akan menampilkan pesan bahwa data pemesanan berhasil dihapus.

* **Kembali ke Menu Utama**

<img width="471" height="565" alt="image" src="https://github.com/user-attachments/assets/3de0976c-0a7e-44d9-8691-5c283d5f81bb" />

Apabila telah menyelesaikan proses hapus, pengguna dapat memilih menu **“4”** untuk keluar dari Menu Hapus dan kembali ke menu utama.

5. **Keluar >>>**

<img width="545" height="516" alt="image" src="https://github.com/user-attachments/assets/b9ca1bc7-6617-4d37-bc53-8842b47c691d" />


Apabila pengguna telah selesai melakukan pengelolaan data, pengguna dapat memilih menu “5” pada menu utama untuk mengakhiri program. Setelah pengguna memilih menu tersebut, program akan menampilkan pesan “BYEEEE!!” sebagai tanda bahwa program telah selesai dijalankan.

---

## ⭐ Penerapan Nilai Tambah pada Program

Program ini memiliki penerapan nilai tambah, yaitu sebagai berikut:

### **1. Access Modifier**
Pada program ini, saya menerapkan access modifier private pada atribut yang terdapat di dalam class data, seperti Pelanggan, PaketWedding, dan PemesananWedding. Penggunaan private membuat atribut tersebut hanya dapat diakses secara langsung dari dalam class tempat atribut tersebut didefinisikan.

Contohnya terdapat pada baris kode di class Pelanggan, yaitu:

<img width="361" height="118" alt="image" src="https://github.com/user-attachments/assets/752974b1-c388-4f47-bed3-eb56448a9b13" />

Penggunaan access modifier pada gambar di atas menunjukkan bahwa data pada setiap object tidak dapat diakses atau diubah secara langsung dari luar class.

### **2. Access Modifier**
Pada program ini, saya menerapkan konsep encapsulation dengan menyembunyikan atribut menggunakan access modifier private dan menyediakan getter serta setter untuk mengakses atau mengubah data tertentu.

Sebagai contoh, pada class Pelanggan terdapat penerapan method getter dan setter:

<img width="453" height="517" alt="image" src="https://github.com/user-attachments/assets/273dd8bf-606c-4172-ba3c-2a3f09745a7a" />


Getter digunakan untuk mengambil nilai dari atribut, sedangkan setter digunakan untuk mengubah nilai atribut. Sehingga akses terhadap data dalam object dilakukan melalui method yang telah disediakan oleh class, sehingga data tidak diakses secara langsung dari luar class.

Terlihat juga pada gambar di atas bahwa tidak semua atribut memiliki setter. Contohnya, idPelanggan hanya memiliki getter sehingga ID tidak dapat diubah setelah object dibuat. Hal ini bertujuan untuk membantu menjaga data tertentu agar tetap sesuai dengan nilai awalnya.
