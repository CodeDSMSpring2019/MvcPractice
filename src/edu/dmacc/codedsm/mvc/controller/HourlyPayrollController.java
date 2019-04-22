package edu.dmacc.codedsm.mvc.controller;

import edu.dmacc.codedsm.mvc.PayrollData;
import edu.dmacc.codedsm.mvc.service.PayrollService;

public class HourlyPayrollController implements PayrollController {

    private PayrollService payrollService;

    public HourlyPayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @Override
    public void handleInput(String payeeName, Integer hoursWorked) {
        System.out.println("payeeName = [" + payeeName + "], hoursWorked = [" + hoursWorked + "]");
        PayrollData data = new PayrollData();
        data.setHoursWorked(hoursWorked);
        data.setPayeeName(payeeName);

        payrollService.calculatePayroll(data);
    }
}
