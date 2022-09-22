package wctc.edu;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final String CODE_MALE = "M";
    private final String CODE_FEMALE = "F";

    public int encodeMonthDayGender(int year, int month, int day, String genderCode) {
        int returnNum = month - 1;
        int returnNum1 = returnNum * 40;
        int returnNum2 = returnNum1 + day;

        if (genderCode == "M"){
            int returnNum3 = returnNum2 + MOD_MALE;
            return returnNum3;
        }
        else{
            int returnNum3 = returnNum2 + MOD_FEMALE;
            return returnNum3;
        }
    }

}
