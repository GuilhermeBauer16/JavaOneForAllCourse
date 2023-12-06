package br.com.JavaOneForAll.lesson80Enum.domain;

public enum CustomerTypes {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start-up");

    private int DB_VALUE;
    private String reportValue;

    CustomerTypes(int dbValue, String reportValue) {
        this.DB_VALUE = dbValue;
        this.reportValue = reportValue;
    }

    public static CustomerTypes getByReportValue(String reportValue) {
        for (CustomerTypes customerTypes : values()) {
            if (customerTypes.getReportValue().equalsIgnoreCase(reportValue)) {

                return customerTypes;
            }
        }
        return null;
    }

    public int getDB_VALUE() {
        return DB_VALUE;
    }

    public void setDB_VALUE(int DB_VALUE) {
        this.DB_VALUE = DB_VALUE;

    }

    public String getReportValue() {
        return reportValue;
    }

    public void setReportValue(String reportValue) {
        this.reportValue = reportValue;
    }
}
