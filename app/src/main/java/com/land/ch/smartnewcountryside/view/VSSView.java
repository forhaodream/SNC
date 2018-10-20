package com.land.ch.smartnewcountryside.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;

/**
 * Created by CH
 * on 2018/10/16 17:09
 */
public class VSSView extends RelativeLayout {

    private TextView view_editText_title;
    private EditText view_editText_value;

    private TextView view_textView_title;
    private TextView view_textView_value;

    private ImageView view_showView1_head;
    private TextView view_showView1_title;

    private TextView view_showView2_title;

    private TextView view_choose_title;
    private TextView view_choose_value;

    private TextView view_photo_title;
    private ImageView view_photo_value;

    public VSSView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_vchooseview, this);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.VSSView);

        String view_type = typedArray.getString(R.styleable.VSSView_view_type);

        if (view_type != null) {
            if (view_type.equals("edit")) {
                String editText_title = typedArray.getString(R.styleable.VSSView_editText_title);
                String editText_hint = typedArray.getString(R.styleable.VSSView_editText_hint);
                String editText_value = typedArray.getString(R.styleable.VSSView_editText_value);

                LinearLayout view_ll_editText = findViewById(R.id.ll_editText);
                view_editText_title = findViewById(R.id.editText_title);
                view_editText_value = findViewById(R.id.editText_value);
                view_ll_editText.setVisibility(VISIBLE);
                view_editText_title.setText(editText_title);
                view_editText_value.setHint(editText_hint);
                view_editText_value.setText(editText_value);
            }
            if (view_type.equals("text")) {
                String textView_title = typedArray.getString(R.styleable.VSSView_textView_title);
                String textView_value = typedArray.getString(R.styleable.VSSView_textView_value);

                LinearLayout view_ll_textView = findViewById(R.id.ll_textView);
                view_textView_title = findViewById(R.id.textView_title);
                view_textView_value = findViewById(R.id.textView_value);
                view_ll_textView.setVisibility(VISIBLE);
                view_textView_title.setText(textView_title);
                view_textView_value.setText(textView_value);
                view_ll_textView.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onViewClickListener != null) {
                            onViewClickListener.onViewClick();
                        }
                    }
                });
            }
            if (view_type.equals("show1")) {
                int showView1_head = typedArray.getResourceId(R.styleable.VSSView_showView1_head, -1);
                String showView1_title = typedArray.getString(R.styleable.VSSView_showView1_title);

                LinearLayout view_ll_showView1 = findViewById(R.id.ll_showView1);
                view_showView1_head = findViewById(R.id.showView1_head);
                view_showView1_title = findViewById(R.id.showView1_title);
                view_ll_showView1.setVisibility(VISIBLE);
                view_showView1_head.setImageResource(showView1_head);
                view_showView1_title.setText(showView1_title);
                view_ll_showView1.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onViewClickListener != null) {
                            onViewClickListener.onViewClick();
                        }
                    }
                });
            }
            if (view_type.equals("show2")) {
                String showView2_title = typedArray.getString(R.styleable.VSSView_showView2_title);

                LinearLayout view_ll_showView2 = findViewById(R.id.ll_showView2);
                view_showView2_title = findViewById(R.id.showView2_title);
                view_ll_showView2.setVisibility(VISIBLE);
                view_showView2_title.setText(showView2_title);
                view_ll_showView2.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onViewClickListener != null) {
                            onViewClickListener.onViewClick();
                        }
                    }
                });
            }
            if (view_type.equals("choose")) {
                String choose_title = typedArray.getString(R.styleable.VSSView_choose_title);
                String choose_value = typedArray.getString(R.styleable.VSSView_choose_value);

                LinearLayout view_ll_choose = findViewById(R.id.ll_choose);
                view_choose_title = findViewById(R.id.choose_title);
                view_choose_value = findViewById(R.id.choose_value);
                view_ll_choose.setVisibility(VISIBLE);
                view_choose_title.setText(choose_title);
                view_choose_value.setText(choose_value);
                view_ll_choose.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onViewClickListener != null) {
                            onViewClickListener.onViewClick();
                        }
                    }
                });
            }
            if (view_type.equals("photo")) {
                String photo_title = typedArray.getString(R.styleable.VSSView_photo_title);
                int photo_value = typedArray.getResourceId(R.styleable.VSSView_photo_value, -1);

                LinearLayout view_ll_photo = findViewById(R.id.ll_photo);
                view_photo_title = findViewById(R.id.photo_title);
                view_photo_value = findViewById(R.id.photo_value);
                view_ll_photo.setVisibility(VISIBLE);
                view_photo_title.setText(photo_title);
                view_photo_value.setImageResource(photo_value);
                view_ll_photo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onViewClickListener != null) {
                            onViewClickListener.onViewClick();
                        }
                    }
                });
            }
        }
    }

    public String getView_editText_title() {
        return view_editText_title.getText().toString();
    }

    public void setView_editText_title(String view_editText_title) {
        this.view_editText_title.setText(view_editText_title);
    }

    public String getView_editText_value() {
        return view_editText_value.getText().toString();
    }

    public void setView_editText_value(String view_editText_value) {
        this.view_editText_value.setText(view_editText_value);
    }

    public String getView_textView_title() {
        return view_textView_title.getText().toString();
    }

    public void setView_textView_title(String view_textView_title) {
        this.view_textView_title.setText(view_textView_title);
    }

    public String getView_textView_value() {
        return view_textView_value.getText().toString();
    }

    public void setView_textView_value(String view_textView_value) {
        this.view_textView_value.setText(view_textView_value);
    }

    public void setView_showView1_head(int view_showView1_head) {
        this.view_showView1_head.setImageResource(view_showView1_head);
    }

    public String getView_showView1_title() {
        return view_showView1_title.getText().toString();
    }

    public void setView_showView1_title(String view_showView1_title) {
        this.view_showView1_title.setText(view_showView1_title);
    }

    public String getView_showView2_title() {
        return view_showView2_title.getText().toString();
    }

    public void setView_showView2_title(String view_showView2_title) {
        this.view_showView2_title.setText(view_showView2_title);
    }

    public String getView_choose_title() {
        return view_choose_title.getText().toString();
    }

    public void setView_choose_title(String view_choose_title) {
        this.view_choose_title.setText(view_choose_title);
    }

    public String getView_choose_value() {
        return view_choose_value.getText().toString();
    }

    public void setView_choose_value(String view_choose_value) {
        this.view_choose_value.setText(view_choose_value);
    }

    public String getView_photo_title() {
        return view_photo_title.getText().toString();
    }

    public void setView_photo_title(String view_photo_title) {
        this.view_photo_title.setText(view_photo_title);
    }

    public void setView_photo_value(int view_photo_value) {
        this.view_photo_value.setImageResource(view_photo_value);
    }

    public OnViewClickListener onViewClickListener;

    public void setOnViewClickListener(OnViewClickListener onViewClickListener) {
        this.onViewClickListener = onViewClickListener;
    }

    public interface OnViewClickListener {
        void onViewClick();
    }
}