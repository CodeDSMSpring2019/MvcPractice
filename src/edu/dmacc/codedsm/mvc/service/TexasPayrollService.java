package edu.dmacc.codedsm.mvc.service;


import edu.dmacc.codedsm.mvc.PayrollData;

public class TexasPayrollService implements PayrollService {
    @Override
    public void calculatePayroll(PayrollData data) {
        System.out.println("YEEEEHAW!");
    }
}
