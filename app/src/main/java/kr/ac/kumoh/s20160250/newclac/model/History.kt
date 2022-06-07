package kr.ac.kumoh.s20160250.newclac.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class History (
    @PrimaryKey val uid : Int?,
    @ColumnInfo(name ="expression") val expression: String?,
    @ColumnInfo(name ="result") val result: String?
    )