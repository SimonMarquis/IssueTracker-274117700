package fr.smarquis.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WordDao {

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    abstract fun get(): Flow<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    // TODO: Remove internal modifier ↓
    internal abstract suspend fun delete()

}
