package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;

/**
 *
 * The item is display in the AHBottomNavigation layout
 */
public class AHBottomNavigationItem {

	private String title = "";
	private Drawable drawable;
	private int color = Color.GRAY;
	private Drawable sele_drawable;

	private
	@StringRes
	int titleRes = 0;
	private
	@DrawableRes
	int drawableRes = 0;
	private
	@ColorRes
	int colorRes = 0;
	private
	@DrawableRes
	int sele_drawableRes = 0;

	/**
	 * Constructor
	 */
	public AHBottomNavigationItem() {
	}

	/**
	 * Constructor
	 *
	 * @param title    Title
	 * @param resource Drawable resource
	 */
	public AHBottomNavigationItem(String title, int resource) {
		this.title = title;
		this.drawableRes = resource;
	}



/*	*/
/*	*//***/
/*	 * @param title    Title*/
/*	 * @param resource Drawable resource*/
/*	 * @param color    Background color*/
/*	 */
/*	@Deprecated*/
/*	public AHBottomNavigationItem(String title, int resource, int color) {*/
/*		this.title = title;*/
/*		this.drawableRes = resource;*/
/*		this.color = color;*/
/*	}*/
/*
*/




	/**
	 * @param title            Title
	 * @param resource         Drawable resource
	 * @param sele_drawableRes
	 */
	public AHBottomNavigationItem(String title, int resource, int sele_drawableRes) {
		this.title = title;
		this.drawableRes = resource;
		this.sele_drawableRes = sele_drawableRes;
	}

	/**
	 * Constructor
	 *
	 * @param titleRes    String resource
	 * @param drawableRes Drawable resource
	 * @param colorRes    Color resource
	 */
	public AHBottomNavigationItem(@StringRes int titleRes, @DrawableRes int drawableRes, @DrawableRes int sele_drawableRes) {
		this.titleRes = titleRes;
		this.drawableRes = drawableRes;
		this.sele_drawableRes = sele_drawableRes;
	}

/*
    */
/**
 * Constructor
 *
 * @param titleRes    String resource
 * @param drawableRes Drawable resource
 * @param colorRes    Color resource
 *//*

    public AHBottomNavigationItem(@StringRes int titleRes, @DrawableRes int drawableRes, @ColorRes int colorRes) {
        this.titleRes = titleRes;
        this.drawableRes = drawableRes;
        this.colorRes = colorRes;
    }
*/


	/**
	 * Constructor
	 *
	 * @param title    String
	 * @param drawable Drawable
	 * @param color    Color
	 */
	public AHBottomNavigationItem(String title, Drawable drawable, @ColorInt int color) {
		this.title = title;
		this.drawable = drawable;
		this.color = color;
	}

	public String getTitle(Context context) {
		if (titleRes != 0) {
			return context.getString(titleRes);
		}
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.titleRes = 0;
	}

	public void setTitle(@StringRes int titleRes) {
		this.titleRes = titleRes;
		this.title = "";
	}

	public int getColor(Context context) {
		if (colorRes != 0) {
			return ContextCompat.getColor(context, colorRes);
		}
		return color;
	}

	public void setColor(@ColorInt int color) {
		this.color = color;
		this.colorRes = 0;
	}

	public void setColorRes(@ColorRes int colorRes) {
		this.colorRes = colorRes;
		this.color = 0;
	}


	public Drawable getDrawable(Context context) {
		if (drawableRes != 0) {
			return ContextCompat.getDrawable(context, drawableRes);
		}
		return drawable;
	}



	public void setDrawable(@DrawableRes int drawableRes) {
		this.drawableRes = drawableRes;
		this.drawable = null;
	}

	public void setDrawable(Drawable drawable) {
		this.drawable = drawable;
		this.drawableRes = 0;
	}



	public void setSele_drawable(@DrawableRes int sele_drawableRes) {
		this.sele_drawableRes = sele_drawableRes;
		this.sele_drawable = null;
	}

	public Drawable getSele_drawable(Context context) {
		if (sele_drawableRes != 0) {
			return ContextCompat.getDrawable(context, sele_drawableRes);
		}
		return sele_drawable;
	}


	public void setSele_drawable(Drawable sele_drawable) {
		this.sele_drawable = sele_drawable;
		this.sele_drawableRes = 0;
	}

}