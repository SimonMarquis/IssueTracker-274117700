package fr.smarquis.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Word::class],
    version = 1,
    exportSchema = false,
)
abstract class WordRoomDatabase : RoomDatabase() {
    abstract val wordDao: WordDao
}
