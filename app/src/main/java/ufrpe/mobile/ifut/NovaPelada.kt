package ufrpe.mobile.ifut

import android.os.Bundle
import android.support.v4.app.Fragment


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [NovaPelada.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [NovaPelada.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class NovaPelada : Fragment() {

   // lateinit var openDatePicker: Animation
   //lateinit var closeDatePicker: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //closeDatePicker = AnimationUtils.loadAnimation(applicationContext,R.anim.close_date_picker)
        //openDatePicker = AnimationUtils.loadAnimation(applicationContext,R.anim.open_date_picker)
        /*datePicker.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?){
                Toast.makeText(this,"funcionou",Toast.LENGTH_LONG)
            }
        })*/
    }
    }

