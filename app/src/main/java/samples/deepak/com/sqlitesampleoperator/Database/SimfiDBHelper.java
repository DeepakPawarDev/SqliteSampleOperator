package samples.deepak.com.sqlitesampleoperator.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by deepak on 12/18/2017.
 */

public class SimfiDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SIMFIDB.db";

    private static final String SQL_CREATE_OPERATOR="CREATE TABLE "+ OperatorContract.Operator.TABLE_NAME
            +" ("+ OperatorContract.Operator.COLUMN_NAME_ID+" INTEGER PRIMARY KEY,"+OperatorContract.Operator.COLUMN_NAME_OPERATOR_NAME
            +" TEXT,"+ OperatorContract.Operator.COLUMN_NAME_SHORT_CODE+" TEXT)"
            ;

    private static final String SQL_DELETE_OPERATOR =
            "DROP TABLE IF EXISTS " + OperatorContract.Operator.TABLE_NAME;



    public SimfiDBHelper(Context context){

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_OPERATOR);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(SQL_DELETE_OPERATOR);
        onCreate(db);

    }
}
