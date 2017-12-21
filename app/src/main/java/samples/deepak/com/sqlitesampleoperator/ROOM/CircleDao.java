package samples.deepak.com.sqlitesampleoperator.ROOM;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by deepak on 12/21/2017.
 */

@Dao
public interface CircleDao {



    @Query("SELECT * FROM circle")
    List<Circles> getAll();

    @Query("SELECT * FROM circle where id=:circleID")
    Circles findByName(int circleID);

    @Query("SELECT COUNT(*) from circle")
    int countUsers();

    @Insert
    void insertAll(Circles... users);

    @Delete
    void delete(Circles user);



}