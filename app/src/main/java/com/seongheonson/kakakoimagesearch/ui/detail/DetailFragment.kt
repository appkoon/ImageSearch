package com.seongheonson.kakakoimagesearch.ui.detail

import android.annotation.SuppressLint
import android.databinding.DataBindingComponent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.seongheonson.kakakoimagesearch.R
import com.seongheonson.kakakoimagesearch.binding.FragmentDataBindingComponent
import com.seongheonson.kakakoimagesearch.common.KEY_DATA
import com.seongheonson.kakakoimagesearch.databinding.FragmentDetailBinding
import com.seongheonson.kakakoimagesearch.di.Injectable
import com.seongheonson.kakakoimagesearch.ui.MainActivity
import com.seongheonson.kakakoimagesearch.vo.Document


class DetailFragment : Fragment(), Injectable {

    lateinit var binding: FragmentDetailBinding

    private var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent(this)

    companion object {
        fun newInstance(repoBundle: Bundle?): DetailFragment {
            val fragment = DetailFragment()
            fragment.arguments = repoBundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false, dataBindingComponent)
        return binding.root
    }

    @SuppressLint("SimpleDateFormat", "SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).supportActionBar?.let{
            it.setDisplayShowTitleEnabled(true)
            it.setDisplayHomeAsUpEnabled(true)
            setHasOptionsMenu(true)
            it.title = "이미지 상세보기"
        }

        arguments?.getParcelable<Document>(KEY_DATA)?.let { document ->
            binding.document = document
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
                    android.R.id.home -> {
                        activity?.onBackPressed()
                        true
                    }
                    else -> super.onOptionsItemSelected(item);
              }
    }
}