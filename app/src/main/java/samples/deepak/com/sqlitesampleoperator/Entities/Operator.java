package samples.deepak.com.sqlitesampleoperator.Entities;

/**
 * Created by deepak on 12/18/2017.
 */

public class Operator {

    private int operator_Id;
    private String stringOperatorName;
    private String stringShortCode;


    public String getStringOperatorName() {
        return stringOperatorName;
    }

    public void setStringOperatorName(String stringOperatorName) {
        this.stringOperatorName = stringOperatorName;
    }

    public int getOperator_Id() {
        return operator_Id;
    }

    public void setOperator_Id(int operator_Id) {
        this.operator_Id = operator_Id;
    }

    public String getStringShortCode() {
        return stringShortCode;
    }

    public void setStringShortCode(String stringShortCode) {
        this.stringShortCode = stringShortCode;
    }


}
