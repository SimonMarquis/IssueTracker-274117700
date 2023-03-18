# IssueTracker #274117700

Reproducer project for issue https://issuetracker.google.com/issues/274117700

1. Compile the project (✅)
   ```bash
   gradlew assembleDebug
   ```
2. Now update both Kotlin and KSP version in [libs.versions.toml](gradle/libs.versions.toml)
3. Re-compile the project (❌)
   ```bash
   gradlew clean assembleDebug
   ```
   It will fail with the following error
   ```
   error: WordDao_Impl is not abstract and does not override abstract method delete$database_debug(Continuation<? super Unit>) in WordDao
   ```
4. Remove the `internal` modifier of the `delete()` function in [WordDao.kt](database/src/main/java/fr/smarquis/database/WordDao.kt)
5. Re-compile the project (✅)
   ```bash
   gradlew clean assembleDebug
   ```
