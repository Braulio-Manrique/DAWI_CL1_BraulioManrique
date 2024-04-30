package pe.Cibertec.DAWI_CL1_Braulio_Manrique.Controller.backoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.Cibertec.DAWI_CL1_Braulio_Manrique.model.bd.Ejercicio1;

@Controller
public class Ejercicio1Controller {

    @GetMapping("/ejercicio1")
    public String ejercicio1(Model model){
        model.addAttribute("ejercicio1", new Ejercicio1());
        return "backoffice/ejercicio1/ejercicio1";
    }

    @PostMapping("/ejercicio1")
    public String ejercicio1(@ModelAttribute Ejercicio1 ejercicio1, Model model){
        int h = ejercicio1.getHoras();
        int M = ejercicio1.getMinutos();

        int tarifa = 1500;
        int tiempoTotalMinuto = (h*60) + M;
        int horasRedondeadas = tiempoTotalMinuto / 60;
        if (tiempoTotalMinuto % 60 != 0) { // Si hay minutos adicionales, redondea hacia arriba
            horasRedondeadas++;
        }
        double total = horasRedondeadas * tarifa;

        model.addAttribute("ejercicio1", new Ejercicio1());
        model.addAttribute("total",total);
        return "backoffice/ejercicio1/ejercicio1";
    }

}
