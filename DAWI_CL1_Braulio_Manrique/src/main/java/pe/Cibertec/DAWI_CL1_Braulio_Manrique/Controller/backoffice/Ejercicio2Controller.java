package pe.Cibertec.DAWI_CL1_Braulio_Manrique.Controller.backoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.Cibertec.DAWI_CL1_Braulio_Manrique.model.bd.Ejercicio1;
import pe.Cibertec.DAWI_CL1_Braulio_Manrique.model.bd.Ejercicio2;
import pe.Cibertec.DAWI_CL1_Braulio_Manrique.model.bd.Ejercicio3;

@Controller
public class Ejercicio2Controller {
        @GetMapping("/ejercicio2")
        public String ejercicio2(Model model){
                model.addAttribute("ejercicio2", new Ejercicio2());
                return "backoffice/ejercicio2/ejercicio2";
        }



        @PostMapping("/ejercicio2")
        public String ejercicio2(@ModelAttribute Ejercicio2 ejercicio2, Model model){
                int N1= ejercicio2.getN1();
                int N2= ejercicio2.getN2();
                int N3= ejercicio2.getN3();
                int N4= ejercicio2.getN4();
                double total =0.0;
                if (N1 < N2 && N1 < N3 && N1 <N4){
                        total = (N2 * 0.2)+ (N3 * 0.3) + (N4 * 0.5);
                }else if (N2 < N1 && N2 < N3 && N2 <N4){
                        total = (N1 * 0.2)+ (N3 * 0.3) + (N4 * 0.5);
                } else if (N3 < N1 && N3 < N2 && N3 <N4) {
                        total = (N1 * 0.2)+ (N2 * 0.3) + (N4 * 0.5);

                }else
                        total = (N1 * 0.2)+ (N2 * 0.3) + (N3 * 0.5);
                model.addAttribute("total", "El Promedio es : " + String.valueOf(total));
                model.addAttribute("ejercicio2", new Ejercicio2());
                return "backoffice/ejercicio2/ejercicio2";
        }
}
