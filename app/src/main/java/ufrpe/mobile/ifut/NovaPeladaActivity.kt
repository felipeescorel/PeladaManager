package ufrpe.mobile.ifut

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [NovaPeladaActivity.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [NovaPeladaActivity.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class NovaPeladaActivity : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*val recyclerView = findViewById(R.id.amigosConvite) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)*/
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_newpickup, container, false)
    }
    companion object {
        fun newInstance(): NovaPeladaActivity = NovaPeladaActivity()
    }
    }

