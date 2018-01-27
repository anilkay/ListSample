package androideduio.com.listsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import androideduio.com.listsample.adapter.StudentInfoAdapterRecycler
import androideduio.com.listsample.util.AppUtil

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
      //  var listeView: ListView=findViewById(R.id.denemeliste)
        //listeView.adapter=StudentInfoAdapterList(AppUtil.getLessonList())
      var recylerView=findViewById<RecyclerView>(R.id.denemeRecyler)
        val layoutManager = LinearLayoutManager(this)
        recylerView.layoutManager=       layoutManager
        val studentInfoAdapter=StudentInfoAdapterRecycler(AppUtil.getLessonList())
        recylerView.adapter=studentInfoAdapter
        val fragmentManager = supportFragmentManager
      // val fragmentliste=ListViewFragment.newInstance("","")
        val fragmentrecyler=RecylerViewFragment.newInstance("","")
        val fragmentTransaction = fragmentManager!!.beginTransaction()
       // fragmentTransaction.add(R.id.fragment_result,fragmentliste)
        fragmentTransaction.add(R.id.fragment_result,fragmentrecyler)
        fragmentTransaction.commit()
    }
}
