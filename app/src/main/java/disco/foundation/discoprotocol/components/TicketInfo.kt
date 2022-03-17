package disco.foundation.discoprotocol.components

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.models.DiscoTicket
import disco.foundation.discoprotocol.utils.setShadowBackground
import kotlinx.android.synthetic.main.sample_ticket_info.view.*

@SuppressLint("ResourceAsColor")
class TicketInfo @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) :  FrameLayout(context, attrs, defStyle,defStyleRes) {

    private var _infoType: TicketInfoType = TicketInfoType.FULL
    private var _color: Int = R.color.neon_blue
    private var _showIcons: Boolean = true

    private lateinit var ticket: DiscoTicket

    var infoType: TicketInfoType
        get() = _infoType
        set(value) {
            _infoType = value
        }

    var color: Int
        get() = _color
        set(value) {
            _color = value
        }

    private var showIcons: Boolean
        get() = _showIcons
        set(value) {
            _showIcons = value
        }

   init {
        LayoutInflater.from(context).inflate(R.layout.sample_ticket_info, this, true)
        // Load attributes
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.TicketInfo, defStyle, defStyleRes
        )

        color = a.getColor(
            R.styleable.TicketInfo_infoColor,
            _color
        )

        showIcons = a.getBoolean(
            R.styleable.TicketInfo_showIcons,
            _showIcons
        )

        infoType = TicketInfoType.values()[a.getInt(R.styleable.TicketInfo_infoType,0)]

       a.recycle()
    }

    fun setTicket(newTicket: DiscoTicket){
        ticket = newTicket
        setColorViews()
        setupCarTicketInfo()
    }

    private fun setColorViews(){
        ticket_shadow_view.setShadowBackground(color)
    }

    private fun setupCarTicketInfo(){
        when(_infoType){
            TicketInfoType.PARTIAL_BALANCE -> setupPartialBalanceTicketInfo()
            TicketInfoType.PARTIAL_ID -> setupPartialIDTicketInfo()
            else -> {}
        }
        setupFullTicketInfo()
    }

    private fun setupPartialIDTicketInfo(){
        row_ticket.visibility = GONE
        row_owner.visibility = GONE
        row_balance.visibility = GONE
        row_secured.visibility = GONE
        row_id.hideSeparator()

    }

    private fun setupPartialBalanceTicketInfo(){
        row_ticket.visibility = GONE
        row_check_in.visibility = GONE
        row_owner.visibility = GONE
        row_secured.visibility = GONE
        row_balance.hideSeparator()
    }

    private fun setupFullTicketInfo(){
        when (infoType){
            TicketInfoType.FULL -> {
                setupTicketRow(ticket)
                setupCheckInRow(ticket)
                setupIDRow(ticket)
                setupOwnerRow(ticket)
                setupBalanceRow(ticket)
                setupSecuredRow(ticket)
            }
            TicketInfoType.PARTIAL_ID -> {
                setupPartialIDTicketInfo()
                setupCheckInRow(ticket)
                setupIDRow(ticket)
                row_id.hideSeparator()
            }
            TicketInfoType.PARTIAL_BALANCE -> {
                setupPartialBalanceTicketInfo()
                setupIDRow(ticket)
                setupBalanceRow(ticket)
                row_balance.hideSeparator()
            }
        }
    }

    private fun setupTicketRow(ticket: DiscoTicket){
        row_ticket.showIcon = showIcons
        row_ticket.rowColor = color
        row_ticket.rowTitle = ticket.type
        row_ticket.rowValue = ticket.id
        row_ticket.showIcon = true
    }

    private fun setupCheckInRow(ticket: DiscoTicket){
        row_check_in.showIcon = showIcons
        row_check_in.rowColor = color
        row_check_in.rowValue = ticket.checkInDate.toString()
        row_check_in.showIcon = true
    }

    private fun setupIDRow(ticket: DiscoTicket){
        row_id.showIcon = showIcons
        row_id.rowColor = color
        row_id.rowValue = ticket.wearableId.toString()
        row_id.showIcon = true
    }

    private fun setupOwnerRow(ticket: DiscoTicket){
        row_owner.showIcon = showIcons
        row_owner.rowColor = color
        row_owner.rowValue = ticket.ownerAddress
        row_owner.showIcon = true
    }

    private fun setupBalanceRow(ticket: DiscoTicket){
        row_balance.showIcon = showIcons
        row_balance.rowColor = color
        row_balance.rowValue = ticket.balance.toString()
        row_balance.showIcon = true
    }

    private fun setupSecuredRow(ticket: DiscoTicket){
        row_secured.showIcon = showIcons
        row_secured.rowColor = color
        row_secured.rowValue = if(ticket.secured) context.getString(R.string.yes) else context.getString(R.string.no)
        row_secured.hideSeparator()
        row_secured.showIcon = true
    }
}

enum class TicketInfoType {
    FULL { override fun getDimension() = R.dimen.fullTicketInfo},
    PARTIAL_ID { override fun getDimension() = R.dimen.partialTicketInfo },
    PARTIAL_BALANCE { override fun getDimension() = R.dimen.partialTicketInfo };

    open fun getDimension(): Int {
        return R.dimen.fullTicketInfo
    }
}
