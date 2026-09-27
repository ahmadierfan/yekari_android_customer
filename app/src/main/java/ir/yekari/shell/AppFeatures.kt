package ir.yekari.shell

import android.content.Context
import androidx.core.app.NotificationChannelCompat

/** تفاوت رفتاری اپ مشتری با اپ پیک (بقیهٔ پوستهٔ بومی در دو ریپو یکی است) */
object AppFeatures {
    /** مشتری کار پس‌زمینه ندارد */
    val tracker: Tracker? = null

    fun channels(context: Context): List<NotificationChannelCompat> = emptyList()
}
