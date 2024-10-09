package com.juaracoding;

public class Login {
    private String Username = "user";
    private String Password = "password";

    // Metode untuk autentikasi
    public boolean authenticate(String username, String password) {
        return username.equals(Username) && password.equals(Password);
    }

    // Metode untuk menampilkan logo (cek jika file memiliki ekstensi .png)
    public boolean showLogo(String path) {
        return path.endsWith("logo.png");
    }

    // Metode untuk fitur 'Forgot Password'
    public String forgotPassword(String username, String newPassword, String confirmPassword) {
        if (username.equals("admin")) {
            if (newPassword.equals(confirmPassword)) {
                return "Password Berhasil Diubah";  // Ubah di sini jika ingin konsistensi kapital
            } else {
                return "Password tidak sama";
            }
        } else {
            return "Username tidak sama";
        }
    }
}
