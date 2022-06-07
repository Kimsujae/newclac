package kr.ac.kumoh.s20160250.newclac.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kr.ac.kumoh.s20160250.newclac.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM history")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()

    @Delete
    fun delete(history: History)

//    @Query("SELECT * From history WHERE result LIKE :result LIMIT 1")
//    fun findByResult(result: String): History

}