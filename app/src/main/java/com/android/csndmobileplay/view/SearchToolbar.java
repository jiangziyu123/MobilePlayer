package com.android.csndmobileplay.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.csndmobileplay.R;
import com.android.csndmobileplay.activity.UriSearch;

/**
 * 扩展Toolbar
 * Created by 长春 on 2017/9/16.
 */

public class SearchToolbar extends Toolbar implements View.OnClickListener {
    private View mViewMore;
    private View mViewSearch;
    private final Context mContext;

    public SearchToolbar(Context context) {
        this(context,null);
    }

    public SearchToolbar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SearchToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext=context;
    }

    /**
     * 布局文件初始化完成时
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mViewMore = getChildAt(0);
        mViewSearch = getChildAt(1);
        mViewMore.setOnClickListener(this);
        mViewSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.toolbar_more:
                Toast.makeText(mContext,"sss",Toast.LENGTH_SHORT).show();
                break;
            case R.id.toolbar_search:
                mContext.startActivity(new Intent(mContext, UriSearch.class));
                break;
            default:
                break;
        }

    }
}
