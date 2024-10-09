# TestNG

![TestNG Logo](https://d2jdgazzki9vjm.cloudfront.net/tutorial/testng/images/testng-tutorial.png)

TestNG adalah framework pengujian yang kuat dan fleksibel untuk Java, yang terinspirasi dari JUnit dan NUnit. Framework ini dirancang untuk memberikan fungsionalitas yang lebih baik dalam pengujian unit dan integrasi, serta memungkinkan pengujian berbasis parameter dan pengujian paralel.

## Fitur Utama

- **Pengelompokan Tes**: Mengorganisir tes dalam grup yang dapat dijalankan bersama.
- **Pengujian Paralel**: Menjalankan tes secara paralel untuk meningkatkan kecepatan eksekusi.
- **Dukungan Parameter**: Memungkinkan parameterisasi pengujian untuk menjalankan tes dengan berbagai input.
- **Reporting**: Menghasilkan laporan yang detail dan informatif.
- **Anotasi**: Menyediakan anotasi sederhana untuk menandai metode pengujian dan mengelola siklus hidup pengujian.

## Instalasi

Untuk menggunakan TestNG dalam proyek Java, tambahkan dependensi berikut ke file `pom.xml` jika menggunakan Maven:

```xml
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
