package id.piusanggoro.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat
import java.util.*

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val namaBarang: String,
    @ColumnInfo(name = "price")
    val hargaBarang: Double,
    @ColumnInfo(name = "quantity")
    val stok: Int,
)

fun Item.getFormattedPrice(): String =
    NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(hargaBarang)
