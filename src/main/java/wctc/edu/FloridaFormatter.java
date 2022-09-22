package wctc.edu;

public class FloridaFormatter implements DriversLicenseFormatter {
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSSSS();
        int FFF = driversLicense.getFFF();
        int YY = driversLicense.getYY();
        int DDD = driversLicense.getDDD();
        int NN = driversLicense.getNN();
        String floridaDrivers = (SSSS + "-" + FFF + "-" + YY + "-" + DDD + "-" + NN);
        return floridaDrivers;
    }
}

