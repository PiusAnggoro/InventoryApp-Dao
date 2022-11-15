package id.piusanggoro.inventory

import android.app.Application
import id.piusanggoro.inventory.data.ItemRoomDatabase

class InventoryApplication : Application(){
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}