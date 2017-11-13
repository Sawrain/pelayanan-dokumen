package id.ac.tazkia.akademik.dokumen.pelayanandokumen.controller;

import id.ac.tazkia.akademik.dokumen.pelayanandokumen.dao.RegistrasiDao;
import id.ac.tazkia.akademik.dokumen.pelayanandokumen.entity.Registrasi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegistrasiDataController {

    @Autowired
    private RegistrasiDao rd;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void tampilkanForm(Model model){
        model.addAttribute("registrasi", new Registrasi());
    }


    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String simpan(@Valid Registrasi p, BindingResult errors){
        if(errors.hasErrors()){
            return "home";
        }
        rd.save(p);
        return "redirect:konfirmasi";

    }

//    @GetMapping("/registrasi/form")
//    public void registrasiData(){
//
//    }


}
