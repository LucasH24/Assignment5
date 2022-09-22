package wctc.edu;

public class WisconsinFormatter implements DriversLicenseFormatter {
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSSSS();
        int FFF = driversLicense.getFFF();
        int YY = driversLicense.getYY();
        int DDD = driversLicense.getDDD();
        int NN = driversLicense.getNN();

        String newYY = Integer.toString(YY);
        int len = newYY.length();
        String YY1 = newYY.substring(0, len / 2), YY2 = newYY.substring(len / 2);

        String wisconsinDrivers = (SSSS + "-" + FFF + YY1 + "-" + YY2 + DDD + "-" + NN);
        return wisconsinDrivers;
    }
}
