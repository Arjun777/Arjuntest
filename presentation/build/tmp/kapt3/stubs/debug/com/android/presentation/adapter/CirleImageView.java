package com.android.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 l2\u00020\u0001:\u0002lmB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020/H\u0002J\u0014\u0010>\u001a\u0004\u0018\u00010\"2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\n\u0010A\u001a\u0004\u0018\u000104H\u0016J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020<H\u0002J\b\u0010E\u001a\u00020<H\u0002J\u0010\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020HH\u0014J(\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0014J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020\u0019H\u0016J\u0012\u0010P\u001a\u00020<2\b\b\u0001\u0010Q\u001a\u00020\bH\u0007J\u0010\u0010R\u001a\u00020<2\b\b\u0001\u0010S\u001a\u00020\bJ\u0010\u0010T\u001a\u00020<2\u0006\u0010U\u001a\u000204H\u0016J\u0012\u0010V\u001a\u00020<2\b\b\u0001\u0010W\u001a\u00020\bH\u0007J\u0010\u0010X\u001a\u00020<2\u0006\u0010Y\u001a\u00020\"H\u0016J\u0012\u0010Z\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010[\u001a\u00020<2\b\b\u0001\u0010\\\u001a\u00020\bH\u0016J\u0012\u0010]\u001a\u00020<2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J(\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020\b2\u0006\u0010b\u001a\u00020\b2\u0006\u0010c\u001a\u00020\b2\u0006\u0010d\u001a\u00020\bH\u0016J(\u0010e\u001a\u00020<2\u0006\u0010f\u001a\u00020\b2\u0006\u0010b\u001a\u00020\b2\u0006\u0010g\u001a\u00020\b2\u0006\u0010d\u001a\u00020\bH\u0016J\u0010\u0010h\u001a\u00020<2\u0006\u0010i\u001a\u00020CH\u0016J\b\u0010j\u001a\u00020<H\u0002J\b\u0010k\u001a\u00020<H\u0002R&\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR&\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR&\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006n"}, d2 = {"Lcom/android/presentation/adapter/CirleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "borderColor", "getBorderColor", "()I", "setBorderColor", "(I)V", "borderWidth", "getBorderWidth", "setBorderWidth", "circleBackgroundColor", "getCircleBackgroundColor", "setCircleBackgroundColor", "fillColor", "getFillColor", "setFillColor", "borderOverlay", "", "isBorderOverlay", "()Z", "setBorderOverlay", "(Z)V", "disableCircularTransformation", "isDisableCircularTransformation", "setDisableCircularTransformation", "mBitmap", "Landroid/graphics/Bitmap;", "mBitmapHeight", "mBitmapPaint", "Landroid/graphics/Paint;", "mBitmapShader", "Landroid/graphics/BitmapShader;", "mBitmapWidth", "mBorderColor", "mBorderOverlay", "mBorderPaint", "mBorderRadius", "", "mBorderRect", "Landroid/graphics/RectF;", "mBorderWidth", "mCircleBackgroundColor", "mCircleBackgroundPaint", "mColorFilter", "Landroid/graphics/ColorFilter;", "mDrawableRadius", "mDrawableRect", "mReady", "mSetupPending", "mShaderMatrix", "Landroid/graphics/Matrix;", "applyColorFilter", "", "calculateBounds", "getBitmapFromDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "getColorFilter", "getScaleType", "Landroid/widget/ImageView$ScaleType;", "init", "initializeBitmap", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "setAdjustViewBounds", "adjustViewBounds", "setBorderColorResource", "borderColorRes", "setCircleBackgroundColorResource", "circleBackgroundRes", "setColorFilter", "cf", "setFillColorResource", "fillColorRes", "setImageBitmap", "bm", "setImageDrawable", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "setPadding", "left", "top", "right", "bottom", "setPaddingRelative", "start", "end", "setScaleType", "scaleType", "setup", "updateShaderMatrix", "Companion", "OutlineProvider", "presentation_debug"})
public final class CirleImageView extends androidx.appcompat.widget.AppCompatImageView {
    private final android.graphics.RectF mDrawableRect = null;
    private final android.graphics.RectF mBorderRect = null;
    private final android.graphics.Matrix mShaderMatrix = null;
    private final android.graphics.Paint mBitmapPaint = null;
    private final android.graphics.Paint mBorderPaint = null;
    private final android.graphics.Paint mCircleBackgroundPaint = null;
    private int mBorderColor = -16777216;
    private int mBorderWidth = 0;
    private int mCircleBackgroundColor = 0;
    private android.graphics.Bitmap mBitmap;
    private android.graphics.BitmapShader mBitmapShader;
    private int mBitmapWidth = 0;
    private int mBitmapHeight = 0;
    private float mDrawableRadius = 0.0F;
    private float mBorderRadius = 0.0F;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mReady = false;
    private boolean mSetupPending = false;
    private boolean mBorderOverlay = false;
    private boolean isDisableCircularTransformation = false;
    @org.jetbrains.annotations.NotNull
    public static final com.android.presentation.adapter.CirleImageView.Companion Companion = null;
    private static final android.widget.ImageView.ScaleType SCALE_TYPE = android.widget.ImageView.ScaleType.CENTER_CROP;
    private static final android.graphics.Bitmap.Config BITMAP_CONFIG = android.graphics.Bitmap.Config.ARGB_8888;
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_BORDER_COLOR = android.graphics.Color.BLACK;
    private static final int DEFAULT_CIRCLE_BACKGROUND_COLOR = android.graphics.Color.TRANSPARENT;
    private static final boolean DEFAULT_BORDER_OVERLAY = false;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isDisableCircularTransformation() {
        return false;
    }
    
    public final void setDisableCircularTransformation(boolean disableCircularTransformation) {
    }
    
    public final int getBorderColor() {
        return 0;
    }
    
    public final void setBorderColor(@androidx.annotation.ColorInt
    int borderColor) {
    }
    
    public final int getCircleBackgroundColor() {
        return 0;
    }
    
    public final void setCircleBackgroundColor(@androidx.annotation.ColorInt
    int circleBackgroundColor) {
    }
    
    @java.lang.Deprecated
    public final int getFillColor() {
        return 0;
    }
    
    @java.lang.Deprecated
    public final void setFillColor(@androidx.annotation.ColorInt
    int fillColor) {
    }
    
    public final int getBorderWidth() {
        return 0;
    }
    
    public final void setBorderWidth(int borderWidth) {
    }
    
    public final boolean isBorderOverlay() {
        return false;
    }
    
    public final void setBorderOverlay(boolean borderOverlay) {
    }
    
    public CirleImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public CirleImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public CirleImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void init() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.ImageView.ScaleType getScaleType() {
        return null;
    }
    
    @java.lang.Override
    public void setScaleType(@org.jetbrains.annotations.NotNull
    android.widget.ImageView.ScaleType scaleType) {
    }
    
    @java.lang.Override
    public void setAdjustViewBounds(boolean adjustViewBounds) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override
    public void setPadding(int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override
    public void setPaddingRelative(int start, int top, int end, int bottom) {
    }
    
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    @java.lang.Deprecated
    public final void setBorderColorResource(@androidx.annotation.ColorRes
    int borderColorRes) {
    }
    
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    public final void setCircleBackgroundColorResource(@androidx.annotation.ColorRes
    int circleBackgroundRes) {
    }
    
    /**
     * Set a color to be drawn behind the circle-shaped drawable. Note that
     * this has no effect if the drawable is opaque or no drawable is set.
     *
     * @param fillColorRes The color resource to be resolved to a color and
     * drawn behind the drawable
     */
    @java.lang.Deprecated
    public final void setFillColorResource(@androidx.annotation.ColorRes
    int fillColorRes) {
    }
    
    @java.lang.Override
    public void setImageBitmap(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bm) {
    }
    
    @java.lang.Override
    public void setImageDrawable(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @java.lang.Override
    public void setImageResource(@androidx.annotation.DrawableRes
    int resId) {
    }
    
    @java.lang.Override
    public void setImageURI(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
    }
    
    @java.lang.Override
    public void setColorFilter(@org.jetbrains.annotations.NotNull
    android.graphics.ColorFilter cf) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.graphics.ColorFilter getColorFilter() {
        return null;
    }
    
    private final void applyColorFilter() {
    }
    
    private final android.graphics.Bitmap getBitmapFromDrawable(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    private final void initializeBitmap() {
    }
    
    private final void setup() {
    }
    
    private final android.graphics.RectF calculateBounds() {
        return null;
    }
    
    private final void updateShaderMatrix() {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/android/presentation/adapter/CirleImageView$OutlineProvider;", "Landroid/view/ViewOutlineProvider;", "(Lcom/android/presentation/adapter/CirleImageView;)V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "presentation_debug"})
    final class OutlineProvider extends android.view.ViewOutlineProvider {
        
        public OutlineProvider() {
            super();
        }
        
        @java.lang.Override
        public void getOutline(@org.jetbrains.annotations.NotNull
        android.view.View view, @org.jetbrains.annotations.NotNull
        android.graphics.Outline outline) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/android/presentation/adapter/CirleImageView$Companion;", "", "()V", "BITMAP_CONFIG", "Landroid/graphics/Bitmap$Config;", "COLORDRAWABLE_DIMENSION", "", "DEFAULT_BORDER_COLOR", "DEFAULT_BORDER_OVERLAY", "", "DEFAULT_BORDER_WIDTH", "DEFAULT_CIRCLE_BACKGROUND_COLOR", "SCALE_TYPE", "Landroid/widget/ImageView$ScaleType;", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}