package samples.deepak.com.sqlitesampleoperator.ROOM;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by deepak on 12/21/2017.
 */


@Entity(tableName = "circle")
public class Circles {



@PrimaryKey
@ColumnInfo(name = "id")
    private int operator_Id;
    @ColumnInfo(name = "circle_name")
    private String stringCircleName;
    @ColumnInfo(name = "short_code")
    private String stringShortCode;



    public String getStringCircleName() {
        return stringCircleName;
    }

    public void setStringCircleName(String stringCircleName) {
        this.stringCircleName = stringCircleName;
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
