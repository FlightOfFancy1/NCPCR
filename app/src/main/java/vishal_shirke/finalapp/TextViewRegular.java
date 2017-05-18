package vishal_shirke.finalapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class TextViewRegular extends android.support.v7.widget.AppCompatTextView {

	public TextViewRegular(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// isEnabled();
		init();
	}

	public TextViewRegular(Context context, AttributeSet attrs) {
		super(context, attrs);
		// isEnabled();
		init();
	}

	public TextViewRegular(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	private void init() {

		try {
			if(!this.isInEditMode()) {
				Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
						"fonts/roboto_regular.ttf");
				setTypeface(tf);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
