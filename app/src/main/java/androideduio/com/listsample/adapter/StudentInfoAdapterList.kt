package androideduio.com.listsample.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androideduio.com.listsample.R
import androideduio.com.listsample.model.StudentInfo

/**
 * Created by anilkaynar on 27.01.2018.
 */
class StudentInfoAdapterList(StdInfo: ArrayList<StudentInfo>) : BaseAdapter() {
    private var tempList: ArrayList<StudentInfo> = StdInfo;
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView = convertView
                ?: LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentinfo_item, parent, false)
        var ogrenciNo = itemView.findViewById<TextView>(R.id.ognumarasi)
        var isim = itemView.findViewById<TextView>(R.id.isim);
        var okul = itemView.findViewById<TextView>(R.id.okul)
        var information: StudentInfo = getItem(position) as StudentInfo
        Log.e("studentNumber",""+information.studentNumber);
        Log.e("ogrencinoTextView",ogrenciNo.toString())
//        ogrenciNo.setText(information.studentNumber)
        isim.setText(information.name)
        okul.setText(information.schoolName)
        ogrenciNo.setText(""+information.studentNumber)
        return itemView
    }

    override fun getItem(p0: Int): Any = tempList.get(p0)
    override fun getItemId(p0: Int): Long = p0.toLong()


    override fun getCount(): Int = tempList.size


}