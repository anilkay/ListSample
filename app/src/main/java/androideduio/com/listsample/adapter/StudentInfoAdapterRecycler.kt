package androideduio.com.listsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androideduio.com.listsample.R
import androideduio.com.listsample.model.StudentInfo

/**
 * Created by anilkaynar on 27.01.2018.
 */
class StudentInfoAdapterRecycler(studentinfo:ArrayList<StudentInfo>) :RecyclerView.Adapter<StudentInfoViewHolder>(){
    private val templist=studentinfo;
    private fun getItem(position: Int):StudentInfo {
        return templist.get(position);
    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StudentInfoViewHolder {
        val convertView = LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentinfo_item, parent, false)
        return StudentInfoViewHolder(convertView)
    }

    override fun onBindViewHolder(holder: StudentInfoViewHolder?, position: Int) {
       var item=getItem(position)
       holder!!.txtStudentNumber.text=item.studentNumber.toString()
       holder.txtStudentName.text=item.name
       holder.txtStudentSchool.text=item.schoolName
    }

    override fun getItemCount(): Int=templist.size

}