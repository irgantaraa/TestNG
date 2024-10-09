package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private Login login;

    @BeforeClass
    public void setUp() {
        login = new Login();
    }

    @Test(priority = 1)
    public void positiveTest() {
        boolean actual = login.authenticate("user", "password");
        Assert.assertTrue(actual, "Login Berhasil");
    }

    @Test(priority = 2)
    public void negativeTestInvalidUsername() {
        boolean actual = login.authenticate("invalidUser", "password");
        Assert.assertFalse(actual, "Invalid credentials");
    }

    @Test(priority = 3)
    public void negativeTestInvalidPassword() {
        boolean actual = login.authenticate("user", "invalidPassword");
        Assert.assertFalse(actual, "Invalid credentials");
    }

    @Test(priority = 4)
    public void showLogo() {
        // Uji dengan memastikan path sesuai
        boolean actual = login.showLogo("logo.png");  // Simpler path with just the filename
        Assert.assertTrue(actual, "Logo ditampilkan dengan format yang benar");
    }

    @Test(priority = 5)
    public void forgotPassword() {
        String actual = login.forgotPassword("user", "1234", "1234");
        String expected = "Password berhasil diubah";  // Sesuaikan case sesuai output yang dihasilkan
        Assert.assertEquals(actual, expected);
    }
}
