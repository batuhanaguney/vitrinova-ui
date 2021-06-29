package com.onurkarabulut.vitrinova.View

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Adapter.*
import com.onurkarabulut.vitrinova.Animation.ViewPagerAnimation
import com.onurkarabulut.vitrinova.Model.*
import com.onurkarabulut.vitrinova.R
import kotlinx.android.synthetic.main.fragment_discover.*
import me.relex.circleindicator.CircleIndicator
import java.util.ArrayList

class DiscoverFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

/*#######################################################################################################################*/
        var featuredData = ArrayList<Featured>()
        val featuredData1 = Featured(R.drawable.item1,"Jewelryafile","Vitrin")
        val featuredData2 = Featured(R.drawable.item2,"oxidepo metal tablo","Vitrin")
        val featuredData3 = Featured(R.drawable.item3,"Fudela Store","Vitrin")
        featuredData.add(featuredData1)
        featuredData.add(featuredData2)
        featuredData.add(featuredData3)
        val adapter = FeaturedViewPagerAdapter(featuredData, requireActivity().baseContext)
        val animation = ViewPagerAnimation()
        featuredViewPager.setPageTransformer(true,animation)
        featuredViewPager.adapter = adapter
        val indicator = view?.findViewById(R.id.indicator) as CircleIndicator
        indicator.setViewPager(featuredViewPager)
        adapter.registerDataSetObserver(indicator.getDataSetObserver())
        /*#######################################################################################################################*/
        var newProductsData = ArrayList<Products>()
        val newProductsData1 = Products(R.drawable.product1, "Göz küpe","Menessa","28 TL","34 TL")
        val newProductsData2 = Products(R.drawable.product2, "Gerçek deri Mini zincir askılı çanta","Deryle Design\n","250 TL",null)
        val newProductsData3 = Products(R.drawable.product3, "Dekoratif  ahşap avize","Ahsapevi","190 TL","230 TL")
        newProductsData.add(newProductsData1)
        newProductsData.add(newProductsData2)
        newProductsData.add(newProductsData3)
        val productAdapter = NewProductsRecyclerAdapter(newProductsData)
        val productLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        discoverProductsRecyclerView.layoutManager = productLayoutManager
        discoverProductsRecyclerView.adapter = productAdapter
        /*#######################################################################################################################*/
        var categoriesData = ArrayList<Categories>()
        val categoriesData1 = Categories(R.drawable.cat1,"KADIN")
        val categoriesData2 = Categories(R.drawable.cat2,"ERKEK")
        val categoriesData3 = Categories(R.drawable.cat3,"ÇOCUK")
        val categoriesData4 = Categories(R.drawable.cat4,"TEKNOLOJİ")
        val categoriesData5 = Categories(R.drawable.cat5,"YİYECEK")
        val categoriesData6 = Categories(R.drawable.cat6,"EĞLENCELİ")
        categoriesData.add(categoriesData1)
        categoriesData.add(categoriesData2)
        categoriesData.add(categoriesData3)
        categoriesData.add(categoriesData4)
        categoriesData.add(categoriesData5)
        categoriesData.add(categoriesData6)
        val categoriesAdapter = CategoriesRecyclerAdapter(categoriesData)
        val categoriesLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        discoverCategoriesRecyclerView.layoutManager = categoriesLayoutManager
        discoverCategoriesRecyclerView.adapter = categoriesAdapter
        /*#######################################################################################################################*/
        var collectionsData = ArrayList<Collections>()
        val collectionsData1 = Collections(R.drawable.collec1,"HEDİYE ÖNERİLERİ","EŞSİZ HEDİYELERLE MUTLU EDİN")
        collectionsData.add(collectionsData1)
        val collectionsAdapter = CollectionsRecyclerAdapter(collectionsData)
        val collectionsLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false)
        collectionsRecyclerView.layoutManager = collectionsLayoutManager
        collectionsRecyclerView.adapter = collectionsAdapter
        /*#######################################################################################################################*/
        var editorShopData = ArrayList<EditorsShop>()
        val editorShopData1 = EditorsShop(R.drawable.editorback1,R.drawable.editorpp1,"Gulp design","Özgün illüstrasyon çizimi ",R.drawable.editorpr1,R.drawable.editorpr2,R.drawable.editorpr3)
        val editorShopData2 = EditorsShop(R.drawable.editorback2,R.drawable.editorpp2,"Laricca Design","⚜️ Laricca Design ⚜️",R.drawable.editor2pr1,R.drawable.editor2pr2,R.drawable.editor2pr3)
        val editorShopData3 = EditorsShop(R.drawable.editorback1,R.drawable.editorpp1,"Gulp design","Özgün illüstrasyon çizimi ",R.drawable.editorpr1,R.drawable.editorpr2,R.drawable.editorpr3)
        val editorShopData4 = EditorsShop(R.drawable.editorback1,R.drawable.editorpp1,"Gulp design","Özgün illüstrasyon çizimi ",R.drawable.editorpr1,R.drawable.editorpr2,R.drawable.editorpr3)
        val editorShopData5 = EditorsShop(R.drawable.editorback2,R.drawable.editorpp2,"Laricca Design","⚜️ Laricca Design ⚜️",R.drawable.editor2pr1,R.drawable.editor2pr2,R.drawable.editor2pr3)
        val editorShopData6 = EditorsShop(R.drawable.editorback1,R.drawable.editorpp1,"Gulp design","Özgün illüstrasyon çizimi ",R.drawable.editorpr1,R.drawable.editorpr2,R.drawable.editorpr3)
        editorShopData.add(editorShopData1)
        editorShopData.add(editorShopData2)
        editorShopData.add(editorShopData3)
        editorShopData.add(editorShopData5)
        editorShopData.add(editorShopData4)
        editorShopData.add(editorShopData6)
        val editorShopAdapter = EditorShopRecyclerAdapter(editorShopData)
        val editorShopLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        editorShopRecyclerView.layoutManager = editorShopLayoutManager
        editorShopRecyclerView.adapter = editorShopAdapter
        val editorSnapHelper = LinearSnapHelper()
        editorSnapHelper.attachToRecyclerView(editorShopRecyclerView)
        editorBackImg.setImageResource(R.drawable.editorback1)
        var index = 0
        editorShopRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE){
                    val view1 = editorSnapHelper.findSnapView(editorShopLayoutManager)
                    index = editorShopLayoutManager.getPosition(view1!!)
                }
                editorBackImg.setImageResource(editorShopData.get(index).backImg)
            }
        })
        /*#######################################################################################################################*/
        var showCaseData = ArrayList<ShowCase>()
        val showCaseData1 = ShowCase(R.drawable.showr1,null,"Ahsapevi","Evinizde kullanabileceğiniz el yapımı ahşap aydınlatma ve aksesuar ürünleri ve el emeği kişiye özel hediyelik ürünleri vitrinimde bulabilirsiniz.",5)
        val showCaseData2 = ShowCase(null,null,"Beşik Korumalığı","Bebek odalarina özgü beşik koruyucu örgüler ve yastıklar",3)
        val showCaseData3 = ShowCase(R.drawable.showr2,R.drawable.showcasel3,"amigurumi","El işi çocuklarınız için doğal oyuncaklar ?",5)
        val showCaseData4 = ShowCase(R.drawable.showr3,null,"Pinokyonunkedisi","Evdeki küçük atolyemde hazırladığım sergilerde ve instagramda satış yaptığım ürünlerim artık burada?",2)
        showCaseData.add(showCaseData1)
        showCaseData.add(showCaseData2)
        showCaseData.add(showCaseData3)
        showCaseData.add(showCaseData4)
        val showCaseAdapter = ShowCaseRecyclerAdapter(showCaseData)
        val showCaseLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        showCaseRecyclerView.layoutManager = showCaseLayoutManager
        showCaseRecyclerView.adapter = showCaseAdapter
        val showCaseSnapHelper = LinearSnapHelper()
        showCaseSnapHelper.attachToRecyclerView(showCaseRecyclerView)


    }
}