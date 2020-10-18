package ir.massdev.youtibestatus.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import ir.massdev.youtibestatus.R


class HomeActivity : AppCompatActivity() {


    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // must be binding instead of findViewById
        toolbar = findViewById(R.id.too_bar)
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)
        configViewPager(viewPager)
        tabLayout.setupWithViewPager(viewPager)

        setSupportActionBar(toolbar)
        supportActionBar?.title = ""

/*        val w: Window = window
        w.setTitle("My title")*/

    }

    private fun configViewPager(viewPager: ViewPager) {
        // fragment list
        var fragmentList: ArrayList<Fragment> = ArrayList()
        fragmentList.add(CommentsFragment())
        fragmentList.add(LikesFragment())
        fragmentList.add(SharedFragment())
        fragmentList.add(SubscribeFragment())
        fragmentList.add(ViewsFragment())
/*        var manager: FragmentManager = FragmentManager
        var adapter = HomeViewPagerAdapter()*/

    }
}