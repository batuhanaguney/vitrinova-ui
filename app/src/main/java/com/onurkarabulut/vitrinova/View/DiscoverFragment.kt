package com.onurkarabulut.vitrinova.View


import android.opengl.Visibility
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Adapter.*
import com.onurkarabulut.vitrinova.Animation.ViewPagerAnimation
import com.onurkarabulut.vitrinova.Model.*
import com.onurkarabulut.vitrinova.Model.Featured.Featured
import com.onurkarabulut.vitrinova.R
import com.onurkarabulut.vitrinova.ViewModel.DiscoverViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.editor_item.view.*
import kotlinx.android.synthetic.main.fragment_discover.*
import me.relex.circleindicator.CircleIndicator
import java.util.ArrayList

class DiscoverFragment : Fragment() {
    private lateinit var viewModel : DiscoverViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DiscoverViewModel::class.java)
        viewModel.getDatasFromAPI()

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeDatas()
    }


    fun observeDatas() {
        viewModel.data.observe(viewLifecycleOwner){
            it?.let{
                val adapter = FeaturedViewPagerAdapter(it.get(0).featured, requireActivity().baseContext)
                val animation = ViewPagerAnimation()
                featuredViewPager.setPageTransformer(true,animation)
                featuredViewPager.adapter = adapter
                val indicator = view?.findViewById(R.id.indicator) as CircleIndicator
                indicator.setViewPager(featuredViewPager)
                adapter.registerDataSetObserver(indicator.getDataSetObserver())
                discoverProductsRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                discoverProductsRecyclerView.adapter = NewProductsRecyclerAdapter(it.get(1).products)


                discoverCategoriesRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                discoverCategoriesRecyclerView.adapter = CategoriesRecyclerAdapter(it.get(2).categories)


                collectionsRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                collectionsRecyclerView.adapter = CollectionsRecyclerAdapter(it.get(3).collections)


                val editorShopLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                editorShopRecyclerView.layoutManager = editorShopLayoutManager
                editorShopRecyclerView.adapter = EditorShopRecyclerAdapter(it.get(4).shops)
                val editorSnapHelper = LinearSnapHelper()
                editorSnapHelper.attachToRecyclerView(editorShopRecyclerView)
                Picasso.get()
                    .load(it.get(4).shops.get(0).cover!!.url)
                    .noPlaceholder()
                    .into(editorBackImg)
                var index = 0
                editorShopRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                        if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                            val view1 = editorSnapHelper.findSnapView(editorShopLayoutManager)
                            index = editorShopLayoutManager.getPosition(view1!!)
                        }
                        Picasso.get()
                            .load(it.get(4).shops.get(index).cover!!.url)
                            .noPlaceholder()
                            .into(editorBackImg)
                    }
                })
                showCaseRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                showCaseRecyclerView.adapter = ShowCaseRecyclerAdapter(it.get(5).shops)
                val showCaseSnapHelper = LinearSnapHelper()
                showCaseSnapHelper.attachToRecyclerView(showCaseRecyclerView)
            }
        }
        viewModel.loading.observe(viewLifecycleOwner){
            if (it){
                scrollView.visibility = View.GONE
                progressBar.visibility = View.VISIBLE
            }else{
                progressBar.visibility = View.GONE
                scrollView.visibility = View.VISIBLE
            }
        }
    }
}