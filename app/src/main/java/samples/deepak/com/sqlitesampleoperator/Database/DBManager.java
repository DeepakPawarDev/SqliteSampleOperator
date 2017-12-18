package samples.deepak.com.sqlitesampleoperator.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import samples.deepak.com.sqlitesampleoperator.Entities.Operator;

/**
 * Created by deepak on 12/18/2017.
 */

public class DBManager {

    SimfiDBHelper simfiDBHelper = null;

    public DBManager(Context context) {

        simfiDBHelper = new SimfiDBHelper(context);
    }

    public void insertOperator(int intId, String stringName, String stringShortCode) {

        SQLiteDatabase db = simfiDBHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(OperatorContract.Operator.COLUMN_NAME_ID, intId);
        contentValues.put(OperatorContract.Operator.COLUMN_NAME_OPERATOR_NAME, stringName);
        contentValues.put(OperatorContract.Operator.COLUMN_NAME_SHORT_CODE, stringShortCode);

        long longOperatorID = db.insert(OperatorContract.Operator.TABLE_NAME, null, contentValues);

        System.out.println("************************   " + longOperatorID);

    }


    public ArrayList<Operator> getOperators() {

        SQLiteDatabase db = simfiDBHelper.getReadableDatabase();
        String[] projection = {OperatorContract.Operator.COLUMN_NAME_ID, OperatorContract.Operator.COLUMN_NAME_OPERATOR_NAME, OperatorContract.Operator.COLUMN_NAME_SHORT_CODE};

        Cursor cursor = db.query(
                OperatorContract.Operator.TABLE_NAME,                     // The table to query
                projection,                               // The columns to return
                null,                                // The columns for the WHERE clause
                null,                            // The values for the WHERE clause
                null,                                     // don't group the rows
                null,                                     // don't filter by row groups
                null                                 // The sort order
        );

        ArrayList<Operator> operatorArrayList = new ArrayList<>();

        while (cursor.moveToNext()) {

            Operator operator = new Operator();
            operator.setOperator_Id(cursor.getInt(cursor.getColumnIndex(OperatorContract.Operator.COLUMN_NAME_ID)));
            operator.setStringOperatorName(cursor.getString(cursor.getColumnIndex(OperatorContract.Operator.COLUMN_NAME_OPERATOR_NAME)));
            operator.setStringShortCode(cursor.getString(cursor.getColumnIndex(OperatorContract.Operator.COLUMN_NAME_SHORT_CODE)));

            operatorArrayList.add(operator);

        }

        return operatorArrayList;

    }


}
