package com.land.ch.smartnewcountryside.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;

import java.util.List;

/**
 * Created by CH
 * on 2018/10/22 11:34
 */
public class DropDownMenu extends RelativeLayout {

    //底层参照物控件，作为其他控件布局时候的相对参照
    private LinearLayout tabMenuViewButtom;
    //顶部菜单布局
    private LinearLayout tabMenuView;
    //底部容器，包含popupMenuViews，maskView
    private View containerView;
    //弹出菜单父布局
    private FrameLayout popupMenuViews;
    //遮罩半透明View，点击可关闭DropDownMenu
    private View maskView;
    //tabMenuView里面选中的tab位置，-1表示未选中
    private int current_tab_position = -1;

    //分割线颜色
    private int dividerColor = 0xffffffff;//0xffcccccc
    //tab选中颜色
    private int textSelectedColor = 0xff890c85;
    //tab未选中颜色
    private int textUnselectedColor = 0xff111111;
    //遮罩颜色
    private int maskColor = 0x88888888;
    //tab字体大小
    private int menuTextSize = 14;

    //tab选中图标
    private int menuSelectedIcon;
    //tab未选中图标
    private int menuUnselectedIcon;
    //菜单背景色
    private int menuBackgroundColor = 0xffffffff;
    //菜单下面的分割线颜色
    private int underlineColor = 0xffffffff;//0xffcccccc
    //菜单的箭头是否靠右边
    private boolean menuIconToRight = false;


    public DropDownMenu(Context context) {
        super(context, null);
    }

    public DropDownMenu(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DropDownMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //为DropDownMenu添加自定义属性
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.DropDownMenu);
        underlineColor = a.getColor(R.styleable.DropDownMenu_ddunderlineColor, underlineColor);
        dividerColor = a.getColor(R.styleable.DropDownMenu_dddividerColor, dividerColor);
        textSelectedColor = a.getColor(R.styleable.DropDownMenu_ddtextSelectedColor, textSelectedColor);
        textUnselectedColor = a.getColor(R.styleable.DropDownMenu_ddtextUnselectedColor, textUnselectedColor);
        menuBackgroundColor = a.getColor(R.styleable.DropDownMenu_ddmenuBackgroundColor, menuBackgroundColor);
        maskColor = a.getColor(R.styleable.DropDownMenu_ddmaskColor, maskColor);
        menuTextSize = a.getDimensionPixelSize(R.styleable.DropDownMenu_ddmenuTextSize, menuTextSize);
        menuSelectedIcon = a.getResourceId(R.styleable.DropDownMenu_ddmenuSelectedIcon, menuSelectedIcon);
        menuUnselectedIcon = a.getResourceId(R.styleable.DropDownMenu_ddmenuUnselectedIcon, menuUnselectedIcon);
        menuIconToRight = a.getBoolean(R.styleable.DropDownMenu_ddmenuIconToRight, menuIconToRight);
        a.recycle();

        //初始化tabMenuView并添加到tabMenuView的参照物
        tabMenuViewButtom = new LinearLayout(context);
        tabMenuViewButtom.setId(R.id.dropDownMenu_tabMenuView);
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        addView(tabMenuViewButtom, 0);

        //为tabMenuView添加下划线
        View underLine = new View(getContext());
        underLine.setId(R.id.dropDownMenu_underLine);
        LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1);
        lp.addRule(RelativeLayout.BELOW, R.id.dropDownMenu_tabMenuView);
        underLine.setLayoutParams(lp);
        underLine.setBackgroundColor(underlineColor);
        addView(underLine, 1);
    }

    /**
     * 初始化DropDownMenu
     *
     * @param tabTexts
     * @param popupViews
     */
    public void setDropDownMenu(@NonNull List<String> tabTexts, @NonNull List<View> popupViews) {
        if (tabTexts.size() != popupViews.size()) {
            throw new IllegalArgumentException("params not match, tabTexts.size() should be equal popupViews.size()");
        }

        LayoutParams plp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        plp.addRule(RelativeLayout.BELOW, R.id.dropDownMenu_underLine);

        maskView = new View(getContext());
        maskView.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        maskView.setBackgroundColor(maskColor);
        maskView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
            }
        });
        maskView.setVisibility(GONE);
        maskView.setLayoutParams(plp);
        addView(maskView);

        popupMenuViews = new FrameLayout(getContext());
        popupMenuViews.setVisibility(GONE);
        popupMenuViews.setLayoutParams(plp);
        addView(popupMenuViews);

        for (int i = 0; i < popupViews.size(); i++) {
            popupViews.get(i).setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            popupMenuViews.addView(popupViews.get(i), i);
        }

        //初始化tabMenuView并添加到tabMenuView，为了能tabMenuView使位于顶层，所以最后添加tabMenuView
        tabMenuView = new LinearLayout(getContext());
        tabMenuView.setId(R.id.dropDownMenu_tabMenuView);
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tabMenuView.setOrientation(LinearLayout.HORIZONTAL);
        tabMenuView.setBackgroundColor(menuBackgroundColor);
        tabMenuView.setLayoutParams(params);
        addView(tabMenuView);

        for (int i = 0; i < tabTexts.size(); i++) {
            addTab(tabTexts, i);
        }

        //为了使tabMenuViewButtom和tabMenuView的高度一样
        LayoutParams tparams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, tabMenuView.getHeight());
        tabMenuViewButtom.setLayoutParams(tparams);
    }

    private void addTab(@NonNull List<String> tabTexts, int i) {
        final TextView tab = new TextView(getContext());
        LinearLayout menuItenmView = new LinearLayout(getContext());
        menuItenmView.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1.0f));
        menuItenmView.setGravity(Gravity.CENTER);
        menuItenmView.setOrientation(LinearLayout.HORIZONTAL);
        tab.setSingleLine();
        tab.setEllipsize(TextUtils.TruncateAt.END);
        tab.setGravity(Gravity.CENTER);
        tab.setTextSize(TypedValue.COMPLEX_UNIT_PX, menuTextSize);
        if (menuIconToRight)
            tab.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        else
            tab.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        tab.setTextColor(textUnselectedColor);
        tab.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(menuUnselectedIcon), null);
        tab.setText(tabTexts.get(i) + "  ");
        tab.setPadding(dpTpPx(5), dpTpPx(8), dpTpPx(5), dpTpPx(8));
        menuItenmView.addView(tab, 0);
        //添加点击事件
        menuItenmView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switchMenu(tab);
            }
        });
        tabMenuView.addView(menuItenmView);
        //添加分割线
        if (i < tabTexts.size() - 1) {
            View view = new View(getContext());
            view.setLayoutParams(new LayoutParams(dpTpPx(0.5f), ViewGroup.LayoutParams.MATCH_PARENT));
            view.setBackgroundColor(dividerColor);
            tabMenuView.addView(view);
        }
    }

    /**
     * 改变tab文字
     *
     * @param text
     */
    public void setTabText(String text) {
        if (current_tab_position != -1) {
            ((TextView) ((ViewGroup) tabMenuView.getChildAt(current_tab_position)).getChildAt(0)).setText(text + "  ");
        }
    }

    public void setTabClickable(boolean clickable) {
        for (int i = 0; i < tabMenuView.getChildCount(); i = i + 2) {
            tabMenuView.getChildAt(i).setClickable(clickable);
        }
    }

    /**
     * 关闭菜单
     */
    public void closeMenu() {
        if (current_tab_position != -1) {
            TextView tab = (TextView) ((ViewGroup) tabMenuView.getChildAt(current_tab_position)).getChildAt(0);
            tab.setTextColor(textUnselectedColor);
            tab.setCompoundDrawablesWithIntrinsicBounds(null, null,
                    getResources().getDrawable(menuUnselectedIcon), null);
            popupMenuViews.setVisibility(View.GONE);
            popupMenuViews.setAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.dd_menu_out));
            maskView.setVisibility(GONE);
            maskView.setAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.dd_mask_out));
            current_tab_position = -1;
        }

    }

    /**
     * DropDownMenu是否处于可见状态
     *
     * @return
     */
    public boolean isShowing() {
        return current_tab_position != -1;
    }

    /**
     * 切换菜单
     *
     * @param target
     */
    private void switchMenu(View target) {
        System.out.println(current_tab_position);
        for (int i = 0; i < tabMenuView.getChildCount(); i = i + 2) {
            TextView tab = (TextView) ((ViewGroup) tabMenuView.getChildAt(i)).getChildAt(0);
            if (target == tab) {
                if (current_tab_position == i) {
                    closeMenu();
                } else {
                    if (current_tab_position == -1) {
                        popupMenuViews.setVisibility(View.VISIBLE);
                        popupMenuViews.setAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.dd_menu_in));
                        maskView.setVisibility(VISIBLE);
                        maskView.setAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.dd_mask_in));
                        View view = popupMenuViews.getChildAt(i / 2);
                        popupMenuViews.getChildAt(i / 2).setVisibility(View.VISIBLE);
                    } else {
                        popupMenuViews.getChildAt(i / 2).setVisibility(View.VISIBLE);
                    }
                    current_tab_position = i;
                    tab.setTextColor(textSelectedColor);
                    tab.setCompoundDrawablesWithIntrinsicBounds(null, null,
                            getResources().getDrawable(menuSelectedIcon), null);
                }
            } else {
                tab.setTextColor(textUnselectedColor);
                tab.setCompoundDrawablesWithIntrinsicBounds(null, null,
                        getResources().getDrawable(menuUnselectedIcon), null);
                popupMenuViews.getChildAt(i / 2).setVisibility(View.GONE);
            }
        }
    }

    public int dpTpPx(float value) {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        return (int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, dm) + 0.5);
    }
}