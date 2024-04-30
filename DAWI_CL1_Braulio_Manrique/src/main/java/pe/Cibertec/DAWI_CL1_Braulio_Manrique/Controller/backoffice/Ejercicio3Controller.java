package pe.Cibertec.DAWI_CL1_Braulio_Manrique.Controller.backoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.Cibertec.DAWI_CL1_Braulio_Manrique.model.bd.Ejercicio3;

@Controller
public class Ejercicio3Controller {
    @GetMapping("/ejercicio3")
    public String ejercicio3(Model model) {
        model.addAttribute("ejercicio3", new Ejercicio3());
        return "backoffice/ejercicio3/ejercicio3";
    }

    @PostMapping("/ejercicio3")
    public String ejercicio3(@ModelAttribute Ejercicio3 ejercicio3, Model model) {
        int anio = ejercicio3.getAnio();
        String rs = "";
        if (anio > 2024) {
            rs = "Error, Ingrese su Año de Nacimiento hasta 2024";
        } else {
            if (anio <= 2006) {
                rs = "Ya puedes Sacar tu DNI Azul";
            } else {
                rs = "No Puedes sacar tu DNI Azul";
            }
        }
        model.addAttribute("ejercicio3", new Ejercicio3());
        model.addAttribute("rs", rs);
        return "backoffice/ejercicio3/ejercicio3";

    }
}
