package main.Ewallet;


import main.Ewallet.service.ApplicationService;
import main.Ewallet.service.impl.ApplicationServiceImpl;


public class main {
    public static void main(String[] args) throws Exception {

        ApplicationService applicationService = new ApplicationServiceImpl();
        applicationService.start();

    }
}
