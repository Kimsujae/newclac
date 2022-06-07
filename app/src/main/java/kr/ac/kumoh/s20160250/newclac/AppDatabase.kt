package kr.ac.kumoh.s20160250.newclac

import androidx.room.Database
import androidx.room.RoomDatabase
import kr.ac.kumoh.s20160250.newclac.dao.HistoryDao
import kr.ac.kumoh.s20160250.newclac.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}