package pe.Cibertec.DAWI_CL1_Braulio_Manrique.Controller.backoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.Cibertec.DAWI_CL1_Braulio_Manrique.model.bd.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Ejercicio4Controller {

    @GetMapping("/ejercicio4")
    public String ejercicio4(Model model) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 20; i >= 10; i--) {
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        model.addAttribute("ejercicio4", new Ejercicio4());
        model.addAttribute("rs", lista);
        return "backoffice/ejercicio4/ejercicio4";


    }
}
