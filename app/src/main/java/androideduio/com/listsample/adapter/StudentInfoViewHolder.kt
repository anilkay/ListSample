package androideduio.com.listsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import androideduio.com.listsample.R

/**
 * Created by anilkaynar on 27.01.2018.
 */
class StudentInfoViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    val txtStudentNumber: TextView by lazy {itemView.findViewById<TextView>(R.id.ognumarasi) }
    val txtStudentName:TextView by lazy { itemView.findViewById<TextView>(R.id.isim) }
    val txtStudentSchool:TextView by lazy { itemView.findViewById<TextView>(R.id.okul) }

}