package cowma.katotama.mycalculator

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class DrowingView(context: Context, attr: AttributeSet) : View(context, attr) {

    private var mDrawPath: CustomPath? = null
    private var mCanvasBitmap:Bitmap? = null
    private var mDrawPaint :Paint? = null
    private var mCanvasPaint: Paint? = null
    private var mbrushSize: Float = 0.toFloat()
    private var color = Color.BLACK

    internal inner class CustomPath(var colo: Int, var brushThickness: Float) : Path() {

    }
}