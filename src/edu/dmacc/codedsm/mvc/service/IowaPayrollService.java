package edu.dmacc.codedsm.mvc.service;

import edu.dmacc.codedsm.mvc.PayrollData;
import edu.dmacc.codedsm.mvc.repository.Repository;

public class IowaPayrollService implements PayrollService {

    private Repository repository;

    public IowaPayrollService(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void calculatePayroll(PayrollData data) {
        System.out.println("data = [" + data + "]");
        repository.save(data);
    }
}
