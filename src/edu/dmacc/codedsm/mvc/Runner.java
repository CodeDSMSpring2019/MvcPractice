package edu.dmacc.codedsm.mvc;

import edu.dmacc.codedsm.mvc.controller.HourlyPayrollController;
import edu.dmacc.codedsm.mvc.controller.PayrollController;
import edu.dmacc.codedsm.mvc.repository.ConsoleRepository;
import edu.dmacc.codedsm.mvc.repository.Repository;
import edu.dmacc.codedsm.mvc.service.IowaPayrollService;
import edu.dmacc.codedsm.mvc.service.PayrollService;
import edu.dmacc.codedsm.mvc.service.TexasPayrollService;

public class Runner {

    public static void main(String[] args) {
        Repository repository = new ConsoleRepository();
//        PayrollService service = new IowaPayrollService(repository);
        PayrollService service = new TexasPayrollService();
        PayrollController controller = new HourlyPayrollController(service);
        controller.handleInput("Nate", 60);
    }

}
