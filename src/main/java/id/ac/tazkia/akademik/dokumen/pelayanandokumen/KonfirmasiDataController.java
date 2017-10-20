package id.ac.tazkia.akademik.dokumen.pelayanandokumen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KonfirmasiDataController {

    @GetMapping("/konfirmasi")
    public void konfirmasiData(){

    }

    @GetMapping("/notifikasi/email")
    public void notifikasiEmail(){

    }

    @GetMapping("/notifikasi/pembayaran")
    public void notifikasiPembayaran(){

    }

    @GetMapping("/notifikasi/registrasi")
    public void notifikasiRegistrasi(){

    }

    @GetMapping("/notifikasi/sms")
    public void notifikasiSms(){

    }

}
