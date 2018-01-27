package androideduio.com.listsample.util

import androideduio.com.listsample.model.StudentInfo


/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 27.01.2018                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/

object AppUtil {

    fun getLessonList(): ArrayList<StudentInfo> {

        val studentList = ArrayList<StudentInfo>()

        var studentInfo = StudentInfo(1234124, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        return studentList
    }
}