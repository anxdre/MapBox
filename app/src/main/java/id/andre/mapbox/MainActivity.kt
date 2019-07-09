package id.andre.mapbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback
import com.mapbox.mapboxsdk.maps.Style
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Mapbox.getInstance(this , "pk.eyJ1IjoiYW54ZHJlIiwiYSI6ImNqeHZ4emRuODA2d3ozb284ZWlweXV6a2UifQ.0ofiD6yVNR_vnxITFcf-uQ")
        setContentView(R.layout.activity_main)

        mv_map.onCreate(savedInstanceState)
        mv_map.getMapAsync(OnMapReadyCallback { mapboxMap ->
            mapboxMap.setStyle(
                    Style.MAPBOX_STREETS , Style.OnStyleLoaded {

            })
        })

    }

    public override fun onStart() {
        super.onStart()
        mv_map.onStart()
    }

    public override fun onResume() {
        super.onResume()
        mv_map.onResume()
    }

    public override fun onPause() {
        super.onPause()
        mv_map.onPause()
    }

    public override fun onStop() {
        super.onStop()
        mv_map.onStop()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mv_map.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mv_map.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mv_map.onSaveInstanceState(outState)
    }

}
