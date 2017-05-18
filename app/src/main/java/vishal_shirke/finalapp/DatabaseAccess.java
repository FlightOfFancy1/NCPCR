package vishal_shirke.finalapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

public  int no;
    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    public DatabaseAccess(Context context) {

        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }


    public Cursor getAlphabetic(String Table_Name, String[] coloum,
                                String where, String strCloumName) {

        Cursor cv = null;
        try {


            cv = database.query(Table_Name, coloum, where, null, null, null,
                    strCloumName + " COLLATE NOCASE ASC");


        } catch (Exception e) {


        } finally {
        }
        return cv;

    }



    public Cursor getValues(String Table_Name, String[] coloum, String where) {

        Cursor cv = null;
        try {

            cv = database.query(Table_Name, coloum, where, null, null, null, null);

        } catch (Exception e) {

        } finally {
        }
        return cv;

    }


}