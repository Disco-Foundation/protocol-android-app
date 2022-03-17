package disco.foundation.discoprotocol.components

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.databinding.SampleTicketInfoRowBinding
import disco.foundation.discoprotocol.models.TicketRowType

@SuppressLint("ResourceAsColor")
class TicketInfoRow@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {


    private var _rowTitle: String? = null
    private var _rowValue: String? = null
    private var _rowColor: Int = R.color.neon_blue
    private var _showIcon: Boolean = true
    private var _rowType: TicketRowType = TicketRowType.CHECK_IN
    private var binding: SampleTicketInfoRowBinding =
        SampleTicketInfoRowBinding.inflate(LayoutInflater.from(context),this, true)

    var rowTitle: String?
        get() = _rowTitle
        set(value) {
            _rowTitle = value
            binding.infoRowTitle.text = value
        }

    var rowValue: String?
        get() = _rowValue
        set(value) {
            _rowValue = value
            binding.infoRowValue.text = value
            binding.textShadow.requestLayout()
        }

    var rowColor: Int
        get() = _rowColor
        set(value) {
            _rowColor = value
            binding.infoRowIcon.setBackgroundResource(rowType.getIcon(value))
            binding.separator.setBackgroundResource(value)
        }

    var showIcon: Boolean
        get() = _showIcon
        set(value) {
            _showIcon = value
            binding.infoRowIcon.visibility = if (value) VISIBLE else GONE
        }

    private var rowType: TicketRowType
        get() = _rowType
        set(value) {
            _rowType = value
            binding.infoRowIcon.setBackgroundResource(value.getIcon(rowColor))
        }

    init {
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs,
            R.styleable.TicketInfoRow,
            defStyle,
            0
        )

        rowTitle = a.getString(
            R.styleable.TicketInfoRow_rowTitle
        )
        rowValue = a.getString(
            R.styleable.TicketInfoRow_rowValue
        )
        rowColor = a.getResourceId(
            R.styleable.TicketInfoRow_rowColor,
            _rowColor
        )

       showIcon = a.getBoolean(
            R.styleable.TicketInfoRow_showIcon,
            _showIcon
        )

        rowType = TicketRowType.values()[a.getInt(R.styleable.TicketInfoRow_rowType,0)]

        a.recycle()
    }

    fun hideSeparator(){
        binding.separator.visibility = GONE
    }

}
