package ufrpe.mobile.ifut.dummy

import java.util.ArrayList
import java.util.HashMap

object Friend {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<FriendItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, FriendItem> = HashMap()

    private val COUNT = 250

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createFriend(i))
        }
    }

    private fun addItem(item: FriendItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createFriend(position: Int): FriendItem {
        return FriendItem(position.toString(), "Friend " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Friend: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class FriendItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}