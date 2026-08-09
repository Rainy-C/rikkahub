package me.rerere.rikkahub.data.db.migrations

import androidx.room.DeleteColumn
import androidx.room.DeleteTable
import androidx.room.migration.AutoMigrationSpec

@DeleteTable(tableName = "workspaces")
@DeleteColumn(tableName = "ConversationEntity", columnName = "workspace_cwd")
class Migration_24_25 : AutoMigrationSpec
