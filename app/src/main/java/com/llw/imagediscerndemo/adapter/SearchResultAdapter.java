package com.llw.imagediscerndemo.adapter;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.llw.imagediscerndemo.R;
import com.llw.imagediscerndemo.model.GetDiscernResultResponse;
import com.llw.imagediscerndemo.model.GetSearchResultResponse;

import java.util.List;

public class SearchResultAdapter extends BaseQuickAdapter<GetSearchResultResponse.ResultBean, BaseViewHolder> {
    public SearchResultAdapter(int layoutResId, @Nullable List<GetSearchResultResponse.ResultBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, GetSearchResultResponse.ResultBean item) {
        helper.setText(R.id.tv_score,String.valueOf(item.getScore()));
        Bitmap bm = BitmapFactory.decodeFile("/storage/emulated/0/Android/data/com.llw.imagediscerndemo/img/pic" + item.getBrief() + ".png");
        helper.setImageBitmap(R.id.iv_picture, bm);
    }
}